package com.example.beach.features.activity

import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.beach.R
import com.example.beach.core.BaseActivity
import com.example.beach.core.Status
import com.example.beach.databinding.ActivityHotelBinding
import com.example.beach.features.adapter.HotelImagesAdapter
import com.example.beach.features.viewmodel.HotelViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_hotel.*
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
        binding.hotelViewModel = viewModel
        binding.setLifecycleOwner(this)
        viewModel.getHotel().observe(this, Observer { hotel ->
            hotel?.let {
                when (it.status) {
                    Status.SUCCESS -> {
                        viewModel.displayData(it.data!!)
                        inflateRecyclerView(it.data?.images)
                        inflateFacilityList(it.data?.facilities!!)
                    }
                    Status.ERROR -> {
                        showError(it.message)
                    }

                    else -> {
                    }
                }
            } ?: kotlin.run {
            }
        })
    }

    private fun inflateRecyclerView(images: List<String>?) {
        images?.let {
            imagesRecycleView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            imagesRecycleView.adapter = HotelImagesAdapter(it, this)
        }
    }

    private fun showError(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun inflateFacilityList(facilities: List<String>) {
        val adapter = ArrayAdapter(this, R.layout.facility_item, facilities)
        facility.adapter = adapter
    }
}
