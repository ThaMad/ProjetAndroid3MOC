import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Album(
    val idAlbum: String,
    val idArtist: String,
    val idLabel: String,
    val strAlbum: String,
    val strAlbumStripped: String,
    val strArtist: String,
    val strArtistStripped: String,
    val intYearReleased: String,
    val strStyle: String,
    val strGenre: String,
    val strLabel: String,
    val strReleaseFormat: String,
    val intSales: String,
    val strAlbumThumb: String,
    val strAlbumThumbHQ: String?,
    val strAlbumThumbBack: String?,
    val strAlbumCDart: String?,
    val strAlbumSpine: String?,
    val strAlbum3DCase: String?,
    val strAlbum3DFlat: String?,
    val strAlbum3DFace: String?,
    val strAlbum3DThumb: String?,
    val strDescriptionEN: String,
    val strDescriptionDE: String?,
    val strDescriptionFR: String?,
    val strDescriptionCN: String?,
    val strDescriptionIT: String?,
    val strDescriptionJP: String?,
    val strDescriptionRU: String?,
    val strDescriptionES: String?,
    val strDescriptionPT: String?,
    val strDescriptionSE: String?,
    val strDescriptionNL: String?,
    val strDescriptionHU: String?,
    val strDescriptionNO: String?,
    val strDescriptionIL: String?,
    val strDescriptionPL: String?,
    val intLoved: String?,
    val intScore: String,
    val intScoreVotes: String,
    val strReview: String,
    val strMood: String,
    val strTheme: String?,
    val strSpeed: String?,
    val strLocation: String?,
    val strMusicBrainzID: String,
    val strMusicBrainzArtistID: String,
    val strAllMusicID: String?,
    val strBBCReviewID: String,
    val strRateYourMusicID: String?,
    val strDiscogsID: String?,
    val strWikidataID: String?,
    val strWikipediaID: String?,
    val strGeniusID: String,
    val strLyricWikiID: String?,
    val strMusicMozID: String?,
    val strItunesID: String?,
    val strAmazonID: String?,
    val strLocked: String
) : Parcelable

data class AlbumServerResponse(
    @SerializedName("error")
    val error: String?,
    @SerializedName("response")
    val response: Response?
) {
    data class Response(
        @SerializedName("idAlbum")
        val idAlbum: String,
        @SerializedName("idArtist")
        val idArtist: String,
        @SerializedName("idLabel")
        val idLabel: String,
        @SerializedName("strAlbum")
        val strAlbum: String,
        @SerializedName("strAlbumStripped")
        val strAlbumStripped: String,
        @SerializedName("strArtist")
        val strArtist: String,
        @SerializedName("strArtistStripped")
        val strArtistStripped: String,
        @SerializedName("intYearReleased")
        val intYearReleased: String,
        @SerializedName("strStyle")
        val strStyle: String,
        @SerializedName("strGenre")
        val strGenre: String,
        @SerializedName("strLabel")
        val strLabel: String,
        @SerializedName("strReleaseFormat")
        val strReleaseFormat: String,
        @SerializedName("intSales")
        val intSales: String,
        @SerializedName("strAlbumThumb")
        val strAlbumThumb: String,
        @SerializedName("strAlbumThumbHQ")
        val strAlbumThumbHQ: String?,
        @SerializedName("strAlbumThumbBack")
        val strAlbumThumbBack: String?,
        @SerializedName("strAlbumCDart")
        val strAlbumCDart: String?,
        @SerializedName("strAlbumSpine")
        val strAlbumSpine: String?,
        @SerializedName("strAlbum3DCase")
        val strAlbum3DCase: String?,
        @SerializedName("strAlbum3DFlat")
        val strAlbum3DFlat: String?,
        @SerializedName("strAlbum3DFace")
        val strAlbum3DFace: String?,
        @SerializedName("strAlbum3DThumb")
        val strAlbum3DThumb: String?,
        @SerializedName("strDescriptionEN")
        val strDescriptionEN: String,
        @SerializedName("strDescriptionDE")
        val strDescriptionDE: String?,
        @SerializedName("strDescriptionFR")
        val strDescriptionFR: String?,
        @SerializedName("strDescriptionCN")
        val strDescriptionCN: String?,
        @SerializedName("strDescriptionIT")
        val strDescriptionIT: String?,
        @SerializedName("strDescriptionJP")
        val strDescriptionJP: String?,
        @SerializedName("strDescriptionRU")
        val strDescriptionRU: String?,
        @SerializedName("strDescriptionES")
        val strDescriptionES: String?,
        @SerializedName("strDescriptionPT")
        val strDescriptionPT: String?,
        @SerializedName("strDescriptionSE")
        val strDescriptionSE: String?,
        @SerializedName("strDescriptionNL")
        val strDescriptionNL: String?,
        @SerializedName("strDescriptionHU")
        val strDescriptionHU: String?,
        @SerializedName("strDescriptionNO")
        val strDescriptionNO: String?,
        @SerializedName("strDescriptionIL")
        val strDescriptionIL: String?,
        @SerializedName("strDescriptionPL")
        val strDescriptionPL: String?,
        @SerializedName("intLoved")
        val intLoved: String?,
        @SerializedName("intScore")
        val intScore: String,
        @SerializedName("intScoreVotes")
        val intScoreVotes: String,
        @SerializedName("strReview")
        val strReview: String,
        @SerializedName("strMood")
        val strMood: String,
        @SerializedName("strTheme")
        val strTheme: String?,
        @SerializedName("strSpeed")
        val strSpeed: String?,
        @SerializedName("strLocation")
        val strLocation: String?,
        @SerializedName("strMusicBrainzID")
        val strMusicBrainzID: String,
        @SerializedName("strMusicBrainzArtistID")
        val strMusicBrainzArtistID: String,
        @SerializedName("strAllMusicID")
        val strAllMusicID: String?,
        @SerializedName("strBBCReviewID")
        val strBBCReviewID: String,
        @SerializedName("strRateYourMusicID")
        val strRateYourMusicID: String?,
        @SerializedName("strDiscogsID")
        val strDiscogsID: String?,
        @SerializedName("strWikidataID")
        val strWikidataID: String?,
        @SerializedName("strWikipediaID")
        val strWikipediaID: String?,
        @SerializedName("strGeniusID")
        val strGeniusID: String,
        @SerializedName("strLyricWikiID")
        val strLyricWikiID: String?,
        @SerializedName("strMusicMozID")
        val strMusicMozID: String?,
        @SerializedName("strItunesID")
        val strItunesID: String?,
        @SerializedName("strAmazonID")
        val strAmazonID: String?,
        @SerializedName("strLocked")
        val strLocked: String
    )

    fun toAlbum(): Album = response?.let { resp ->
        return Album(
            idAlbum = resp.idAlbum,
            idArtist = resp.idArtist,
            idLabel = resp.idLabel,
            strAlbum = resp.strAlbum,
            strAlbumStripped = resp.strAlbumStripped,
            strArtist = resp.strArtist,
            strArtistStripped = resp.strArtistStripped,
            intYearReleased = resp.intYearReleased,
            strStyle = resp.strStyle,
            strGenre = resp.strGenre,
            strLabel = resp.strLabel,
            strReleaseFormat = resp.strReleaseFormat,
            intSales = resp.intSales,
            strAlbumThumb = resp.strAlbumThumb,
            strAlbumThumbHQ = resp.strAlbumThumbHQ,
            strAlbumThumbBack = resp.strAlbumThumbBack,
            strAlbumCDart = resp.strAlbumCDart,
            strAlbumSpine = resp.strAlbumSpine,
            strAlbum3DCase = resp.strAlbum3DCase,
            strAlbum3DFlat = resp.strAlbum3DFlat,
            strAlbum3DFace = resp.strAlbum3DFace,
            strAlbum3DThumb = resp.strAlbum3DThumb,
            strDescriptionEN = resp.strDescriptionEN,
            strDescriptionDE = resp.strDescriptionDE,
            strDescriptionFR = resp.strDescriptionFR,
            strDescriptionCN = resp.strDescriptionCN,
            strDescriptionIT = resp.strDescriptionIT,
            strDescriptionJP = resp.strDescriptionJP,
            strDescriptionRU = resp.strDescriptionRU,
            strDescriptionES = resp.strDescriptionES,
            strDescriptionPT = resp.strDescriptionPT,
            strDescriptionSE = resp.strDescriptionSE,
            strDescriptionNL = resp.strDescriptionNL,
            strDescriptionHU = resp.strDescriptionHU,
            strDescriptionNO = resp.strDescriptionNO,
            strDescriptionIL = resp.strDescriptionIL,
            strDescriptionPL = resp.strDescriptionPL,
            intLoved = resp.intLoved,
            intScore = resp.intScore,
            intScoreVotes = resp.intScoreVotes,
            strReview = resp.strReview,
            strMood = resp.strMood,
            strTheme = resp.strTheme,
            strSpeed = resp.strSpeed,
            strLocation = resp.strLocation,
            strMusicBrainzID = resp.strMusicBrainzID,
            strMusicBrainzArtistID = resp.strMusicBrainzArtistID,
            strAllMusicID = resp.strAllMusicID,
            strBBCReviewID = resp.strBBCReviewID,
            strRateYourMusicID = resp.strRateYourMusicID,
            strDiscogsID = resp.strDiscogsID,
            strWikidataID = resp.strWikidataID,
            strWikipediaID = resp.strWikipediaID,
            strGeniusID = resp.strGeniusID,
            strLyricWikiID = resp.strLyricWikiID,
            strMusicMozID = resp.strMusicMozID,
            strItunesID = resp.strItunesID,
            strAmazonID = resp.strAmazonID,
            strLocked = resp.strLocked
        )
    } ?: throw Exception("Unable to parse the album")
}
