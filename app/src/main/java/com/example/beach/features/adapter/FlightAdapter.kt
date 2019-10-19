package com.example.beach.features.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.beach.R
import com.example.beach.databinding.FlightItemRecyclerBinding
import com.example.beach.features.model.Flight

class FlightAdapter(private var flights: List<Flight>) :
    RecyclerView.Adapter<FlightAdapter.FlightsViewHolder>() {

/*
    var onItemClick: ((Flight) -> Unit)? = null
*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightsViewHolder {
        val binding: ViewDataBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.flight_item_recycler,
            parent,
            false
        )
        return FlightsViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return flights.size
    }

    override fun onBindViewHolder(holder: FlightsViewHolder, p1: Int) {
        holder.bind(flights[holder.adapterPosition])
    }


    inner class FlightsViewHolder(val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: Flight) {
            (binding as FlightItemRecyclerBinding).flight = flight
            binding.executePendingBindings()
        }

      /*  init {
            flight.setOnClickListener {
                onItemClick?.invoke(contacts[adapterPosition])
            }
        }*/

    }

}