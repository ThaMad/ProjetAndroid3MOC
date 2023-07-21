package com.example.theaudiodbproject.ui.model

data class TrendingAlbumList(
    val trendingAlbum: MutableList<TrendingAlbum>?
) {

    operator fun get(position: Int): TrendingAlbum {
        return this[position];

    }
}