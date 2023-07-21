package com.example.theaudiodbproject.ui.tabbar.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.ui.model.TrendingTrack

class MyTrendingTracksAdapter(val callback: OnTrendingTrackListClickListener) : RecyclerView.Adapter<MyTrendingTracksAdapter.TrendingTrackListViewHolder>() {


    private val data = mutableListOf<TrendingTrack>()

    fun setData(trendingTrack: List<TrendingTrack>) {
        data.clear()
        data.addAll(trendingTrack)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingTrackListViewHolder {
        return MyTrendingTracksAdapter.TrendingTrackListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.music_list_item, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TrendingTrackListViewHolder, position: Int) {
        val trendingTrack = data[position]
        holder.update(trendingTrack)
        //holder.thumbnail.setImageResource(trendingTrack.strTrackThumb)
        holder.rankInCharts.text = trendingTrack.intChartPlace
        holder.artist.text = trendingTrack.strArtist
        holder.songtitle.text = trendingTrack.strTrack
        holder.itemView.setOnClickListener {
            callback.onTrendingTrackClicked(trendingTrack)
        }
    }

    class TrendingTrackListViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val thumbnail: ImageView = v.findViewById(R.id.title_thumbnail)
        val songtitle: TextView = v.findViewById(R.id.trackName)
        val artist: TextView = v.findViewById(R.id.trendingtrackartist)
        val rankInCharts: TextView = v.findViewById((R.id.rankincharts))

        fun update(trendingTrack: TrendingTrack) {
            Glide.with(itemView).load(trendingTrack.strTrackThumb).into(thumbnail)
            songtitle.text = trendingTrack.strTrack
            artist.text = trendingTrack.strArtist
            rankInCharts.text = trendingTrack.intChartPlace
        }

    }

    interface OnTrendingTrackListClickListener {
        fun onTrendingTrackClicked(trendingTrack: TrendingTrack)
    }
}
