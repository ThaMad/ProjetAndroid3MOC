package com.example.theaudiodbproject.ui.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class TrendingAlbum(
    val idTrend: String,
    val intChartPlace: String,
    val idArtist: String,
    val idAlbum: String,
    val idTrack: String?,
    val strArtistMBID: String,
    val strAlbumMBID: String,
    val strTrackMBID: String?,
    val strArtist: String,
    val strAlbum: String,
    val strTrackThumb: String?,
    val strCountry: String,
    val strType: String,
    val intWeek: String,
    val dateAdded: String
)

data class TrendingAlbumServerResponse(
    @SerializedName("error")
    val error: String?,
    @SerializedName("response")
    val response: Response?
) {
    data class Response(
        @SerializedName("idTrend")
        val idTrend: String,
        @SerializedName("intChartPlace")
        val intChartPlace: String,
        @SerializedName("idArtist")
        val idArtist: String,
        @SerializedName("idAlbum")
        val idAlbum: String,
        @SerializedName("idTrack")
        val idTrack: String?,
        @SerializedName("strArtistMBID")
        val strArtistMBID: String,
        @SerializedName("strAlbumMBID")
        val strAlbumMBID: String,
        @SerializedName("strTrackMBID")
        val strTrackMBID: String?,
        @SerializedName("strArtist")
        val strArtist: String,
        @SerializedName("strAlbum")
        val strAlbum: String,
        @SerializedName("strTrackThumb")
        val strTrackThumb: String?,
        @SerializedName("strCountry")
        val strCountry: String,
        @SerializedName("strType")
        val strType: String,
        @SerializedName("intWeek")
        val intWeek: String,
        @SerializedName("dateAdded")
        val dateAdded: String
    )


    fun toTrendingAlbum(): TrendingAlbum = response?.let { resp ->
        return TrendingAlbum(
            idTrend = resp.idTrend,
            intChartPlace = resp.intChartPlace,
            idArtist = resp.idArtist,
            idAlbum = resp.idAlbum,
            idTrack = resp.idTrack,
            strArtistMBID = resp.strArtistMBID,
            strAlbumMBID = resp.strAlbumMBID,
            strTrackMBID = resp.strTrackMBID,
            strArtist = resp.strArtist,
            strAlbum = resp.strAlbum,
            strTrackThumb = resp.strTrackThumb,
            strCountry = resp.strCountry,
            strType = resp.strType,
            intWeek = resp.intWeek,
            dateAdded = resp.dateAdded
        )
    } ?: throw Exception("Unable to parse the trendingRecyclerView album")
}
