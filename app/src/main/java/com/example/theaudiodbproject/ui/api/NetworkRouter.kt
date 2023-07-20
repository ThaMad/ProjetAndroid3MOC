package com.example.theaudiodbproject.ui.api

import AlbumServerResponse
import ArtistServerResponse
import com.example.theaudiodbproject.ui.model.AlbumList
import com.example.theaudiodbproject.ui.model.TrackList
import com.example.theaudiodbproject.ui.model.TrendingAlbumList
import com.example.theaudiodbproject.ui.model.TrendingTrackList
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query


interface TrendingRouter {
    @GET("trending.php?country=us&type=itunes&format=singles")
    fun getTrendingTracks(): Deferred<TrendingTrackList>

    @GET("trending.php?country=us&type=itunes&format=albums")
    fun getTrendingAlbums(): Deferred<TrendingAlbumList>

}

interface ArtistRouter {
    @GET("artist.php")
    fun getArtistById(
        @Query("i") idArtist: String,
    ): Deferred<ArtistServerResponse>

    @GET("search.php")
    fun getArtistByName(
        @Query("s") strArtist: String,
    ): Deferred<ArtistServerResponse>


}

interface AlbumRouter {
    @GET("searchalbum.php")
    fun getAlbumsByArtistName(
        @Query("s") strArtist: String,
    ): Deferred<AlbumList>

    @GET("search.php")
    fun getAlbumById(
        @Query("m") idAlbum: String,
    ): Deferred<AlbumServerResponse>


}

interface TrackRouter{

    @GET("track-top10-mb.php?s=28737730-ec70-4da5-89c5-77ac13c5c34d")
    fun getTopTracksByMbaId(
        @Query("s") strMusicBrainzArtistID: String,
    ): Deferred<TrackList>

    @GET("track.php")
    fun getTracksByAlbumId(
        @Query("m") idAlbum: String,
    ): Deferred<TrackList>

}



