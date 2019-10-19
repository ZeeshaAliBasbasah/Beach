package com.example.beach.features.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.beach.R
import com.example.beach.databinding.FlightItemRecyclerBinding
import com.example.beach.features.model.Flight

class HotelImagesAdapter(private var images: List<String>) :
    RecyclerView.Adapter<HotelImagesAdapter.FlightsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightsViewHolder {
        val binding: ViewDataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.hotel_images_item,
            parent,
            false
        )
        return FlightsViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: FlightsViewHolder, p1: Int) {
        holder.bind(images[holder.adapterPosition])
    }


    inner class FlightsViewHolder(val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: String) {
            (binding as FlightItemRecyclerBinding).flight = flight
            binding.executePendingBindings()
        }
    }

}