package com.example.beach.features.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beach.R
import kotlinx.android.synthetic.main.hotel_images_item.view.*

class HotelImagesAdapter(private var images: List<String>, private val context: Context) :
    RecyclerView.Adapter<HotelImagesAdapter.FlightsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightsViewHolder {
        return FlightsViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.hotel_images_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: FlightsViewHolder, p1: Int) {
        Glide.with(context).load(images[p1]).into(holder.hotelImage)
    }

    inner class FlightsViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val hotelImage = view.image
    }

}