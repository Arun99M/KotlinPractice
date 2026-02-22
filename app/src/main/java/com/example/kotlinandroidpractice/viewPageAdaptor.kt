package com.example.kotlinandroidpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(
    private val images: List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val ivImage: ImageView = itemView.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_pager, parent, false)

        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(
        holder: ViewPagerViewHolder,
        position: Int
    ) {

        val curImage = images[position]
        holder.ivImage.setImageResource(curImage)

        var isZoomed = false

        holder.ivImage.setOnClickListener {

            if (!isZoomed) {
                holder.ivImage.scaleX = 1.5f
                holder.ivImage.scaleY = 1.5f
                isZoomed = true
            } else {
                holder.ivImage.scaleX = 1f
                holder.ivImage.scaleY = 1f
                isZoomed = false
            }
        }
    }
}