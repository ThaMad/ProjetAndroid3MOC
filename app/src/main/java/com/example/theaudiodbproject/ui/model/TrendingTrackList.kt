package com.example.theaudiodbproject.ui.model

data class TrendingTrackList(
    val trendingTrack: MutableList<TrendingTrack>?
) {
    operator fun get(position: Int): TrendingTrack {
        return this[position];

    }
}