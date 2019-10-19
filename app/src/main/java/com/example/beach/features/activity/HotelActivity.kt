package com.example.beach.features.activity

import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.beach.R
import com.example.beach.core.BaseActivity
import com.example.beach.core.Status
import com.example.beach.databinding.ActivityHotelBinding
import com.example.beach.features.viewmodel.HotelViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class HotelActivity :
    BaseActivity<ActivityHotelBinding, HotelViewModel>(HotelViewModel::class.java) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun getLayoutRes() = R.layout.activity_hotel

    override fun getVMFactory(): ViewModelProvider.Factory {
        return viewModelFactory
    }

    override fun onInject() {
        AndroidInjection.inject(this)
    }

    override fun initViewModel(viewModel: HotelViewModel) {
        viewModel.getHotel().observe(this, Observer { hotel ->
            hotel?.let {
                when (it.status) {
                    Status.SUCCESS -> {
                        hideProgressBar()
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

    private fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }
}
