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
import com.example.theaudiodbproject.ui.model.TrendingTrackList

class myTrendingTracksAdapter(
    val trendingTrackList: TrendingTrackList,
    val callback: OnTrendingTrackListClickListener
) : RecyclerView.Adapter<myTrendingTracksAdapter.TrendingTrackListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingTrackListViewHolder {
        return myTrendingTracksAdapter.TrendingTrackListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.music_list_item, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return trendingTrackList.trendingTrack?.size ?: 0
    }

    override fun onBindViewHolder(holder: TrendingTrackListViewHolder, position: Int) {
        val trendingTrack = trendingTrackList[position]
        holder.update(trendingTrack)
        //holder.thumbnail.setImageResource(trendingTrack.strTrackThumb)
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

        fun update(trendingTrack: TrendingTrack) {
            Glide.with(itemView).load(trendingTrack.strTrackThumb).into(thumbnail)
            songtitle.text = trendingTrack.strTrack
            artist.text = trendingTrack.strArtist
        }

    }

    interface OnTrendingTrackListClickListener {
        fun onTrendingTrackClicked(trendingTrack: TrendingTrack)
    }
}
