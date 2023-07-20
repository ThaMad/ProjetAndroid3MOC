package com.example.theaudiodbproject.ui.api
import AlbumServerResponse
import ArtistServerResponse
import com.example.theaudiodbproject.ui.model.TrackList
import com.example.theaudiodbproject.ui.model.TrendingAlbumList
import com.example.theaudiodbproject.ui.model.TrendingTrackList
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {

    private val api = Retrofit.Builder()
        .baseUrl("https://theaudiodb.com/api/v1/json/523532/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    ///// Ranking page : trendingRecyclerView singles & albums
    private val trendingApi = api.create(TrendingRouter::class.java)

    //Singles
    suspend fun getTrendingTracks(): TrendingTrackList {
        return trendingApi.getTrendingTracks().await();
    }

    //Albums
    suspend fun getTrendingAlbums(): TrendingAlbumList {
        return trendingApi.getTrendingAlbums().await();
    }

    ////// Artist
    private val artistApi = api.create(ArtistRouter::class.java)

    suspend fun getArtistById(i : String): ArtistServerResponse {
        return artistApi.getArtistById(i).await();
    }
    suspend fun getArtistByName(s: String): ArtistServerResponse {
        return artistApi.getArtistByName(s).await()
    }

    ////// Album
    private val albumApi = api.create(AlbumRouter::class.java)

    suspend fun getAlbumById(m: String): AlbumServerResponse {
        return albumApi.getAlbumById(m).await()
    }
    suspend fun getArtistByArtistName(strArtist: String): ArtistServerResponse {
        return artistApi.getArtistByName(strArtist).await()
    }

    ///// Track

    private val trackApi = api.create(TrackRouter::class.java)

    suspend fun getTopTracksByMbaId(s: String): TrackList {
        return trackApi.getTopTracksByMbaId(s).await()
    }
    suspend fun getTracksByAlbumId(m: String): TrackList {
        return trackApi.getTracksByAlbumId(m).await()
    }







}