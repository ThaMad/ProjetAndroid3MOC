package com.example.theaudiodbproject.ui.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.Locale


data class TrendingTrack(
    val idTrend: String?,
    val intChartPlace: String?,
    val idArtist: String?,
    val idAlbum: String?,
    val idTrack: String?,
    val strArtistMBID: String?,
    val strAlbumMBID: String?,
    val strTrackMBID: String?,
    val strArtist: String?,
    val strAlbum: String?,
    val strTrack: String?, // Changed to "strTrack"
    val strArtistThumb: String?, // Added property "strArtistThumb"
    val strAlbumThumb: String?, // Added property "strAlbumThumb"
    val strTrackThumb: String?,
    val strCountry: String?,
    val strType: String?,
    val intWeek: String?,
    val dateAdded: String?,
)

data class TrendingTrackServerResponse(
    @SerializedName("error")
    val error: String?,
    @SerializedName("response")
    val response: Response?
) {
    data class Response(
        @SerializedName("idTrend")
        val idTrend: String?,
        @SerializedName("intChartPlace")
        val intChartPlace: String?,
        @SerializedName("idArtist")
        val idArtist: String?,
        @SerializedName("idAlbum")
        val idAlbum: String?,
        @SerializedName("idTrack")
        val idTrack: String?,
        @SerializedName("strArtistMBID")
        val strArtistMBID: String?,
        @SerializedName("strAlbumMBID")
        val strAlbumMBID: String?,
        @SerializedName("strTrackMBID")
        val strTrackMBID: String?,
        @SerializedName("strArtist")
        val strArtist: String?,
        @SerializedName("strAlbum")
        val strAlbum: String?,
        @SerializedName("strTrack")
        val strTrack: String?, // Changed to "strTrack"
        @SerializedName("strArtistThumb")
        val strArtistThumb: String?, // Added property "strArtistThumb"
        @SerializedName("strAlbumThumb")
        val strAlbumThumb: String?, // Added property "strAlbumThumb"
        @SerializedName("strTrackThumb")
        val strTrackThumb: String?,
        @SerializedName("strCountry")
        val strCountry: String?,
        @SerializedName("strType")
        val strType: String?,
        @SerializedName("intWeek")
        val intWeek: String?,
        @SerializedName("dateAdded")
        val dateAdded: String?
    )

    fun toTrendingTrack(): TrendingTrack = response?.let { resp ->
        return TrendingTrack(
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
            strTrack = resp.strTrack,
            strArtistThumb = resp.strArtistThumb,
            strAlbumThumb = resp.strAlbumThumb,
            strTrackThumb = resp.strTrackThumb,
            strCountry = resp.strCountry,
            strType = resp.strType,
            intWeek = resp.intWeek,
            dateAdded = resp.dateAdded
        )
    } ?: throw Exception("Unable to parse the trendingRecyclerView track")
}
