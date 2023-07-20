package com.example.theaudiodbproject.ui.model

data class TrendingTrackList(
    val trendingTrack: List<TrendingTrack>?
) {
    operator fun get(position: Int): TrendingTrack {
        return this[position];

    }
}