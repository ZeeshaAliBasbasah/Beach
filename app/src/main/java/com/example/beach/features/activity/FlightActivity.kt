package com.example.beach.features.activity

import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beach.R
import com.example.beach.core.BaseActivity
import com.example.beach.core.Status
import com.example.beach.databinding.ActivityMainBinding
import com.example.beach.features.adapter.FlightAdapter
import com.example.beach.features.model.Flight
import com.example.beach.features.viewmodel.FlightViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class FlightActivity :
    BaseActivity<ActivityMainBinding, FlightViewModel>(FlightViewModel::class.java) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayoutRes() = R.layout.activity_main

    override fun getVMFactory(): ViewModelProvider.Factory {
        return viewModelFactory
    }

    override fun onInject() {
        AndroidInjection.inject(this)
    }

    override fun initViewModel(viewModel: FlightViewModel) {

        viewModel.getFlight().observe(this, Observer { albums ->
            albums?.let {
                when (it.status) {
                    Status.SUCCESS -> {
                        hideProgressBar()
                        inflateRecyclerView(it.data?.flights)
                    }
                    Status.ERROR -> {
                        hideProgressBar()
                        showError(it.message)
                    }

                    else -> {
                        showProgressBar()
                    }
                }
            } ?: kotlin.run {
                hideProgressBar()
            }
        })
    }

    private fun showError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    private fun inflateRecyclerView(albums: List<Flight>?) {
        albums?.let {
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = FlightAdapter(it, this)
        }
    }

    private fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }
}
