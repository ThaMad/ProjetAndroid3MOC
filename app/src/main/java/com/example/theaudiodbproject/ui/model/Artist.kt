import com.google.gson.annotations.SerializedName

data class Artist(
    val idArtist: String,
    val strArtist: String,
    val strArtistStripped: String?,
    val strArtistAlternate: String,
    val strLabel: String,
    val idLabel: String,
    val intFormedYear: String,
    val intBornYear: String,
    val intDiedYear: String?,
    val strDisbanded: String?,
    val strStyle: String,
    val strGenre: String,
    val strMood: String,
    val strWebsite: String,
    val strFacebook: String,
    val strTwitter: String,
    val strBiographyEN: String,
    val strBiographyDE: String?,
    val strBiographyFR: String,
    val strBiographyCN: String?,
    val strBiographyIT: String?,
    val strBiographyJP: String?,
    val strBiographyRU: String?,
    val strBiographyES: String?,
    val strBiographyPT: String?,
    val strBiographySE: String?,
    val strBiographyNL: String?,
    val strBiographyHU: String?,
    val strBiographyNO: String?,
    val strBiographyIL: String?,
    val strBiographyPL: String?,
    val strGender: String,
    val intMembers: String,
    val strCountry: String,
    val strCountryCode: String,
    val strArtistThumb: String,
    val strArtistLogo: String,
    val strArtistCutout: String?,
    val strArtistClearart: String,
    val strArtistWideThumb: String,
    val strArtistFanart: String,
    val strArtistFanart2: String,
    val strArtistFanart3: String,
    val strArtistFanart4: String,
    val strArtistBanner: String,
    val strMusicBrainzID: String,
    val strISNIcode: String?,
    val strLastFMChart: String?,
    val intCharted: String,
    val strLocked: String
)

data class ArtistServerResponse(
    @SerializedName("error")
    val error: String?,
    @SerializedName("response")
    val response: Response?
) {
    data class Response(
        @SerializedName("dArtist")
        val idArtist: String,
        @SerializedName("strArtist")
        val strArtist: String,
        @SerializedName("strArtistStripped")
        val strArtistStripped: String?,
        @SerializedName("strArtistAlternate")
        val strArtistAlternate: String,
        @SerializedName("strLabel")
        val strLabel: String,
        @SerializedName("idLabel")
        val idLabel: String,
        @SerializedName("intFormedYear")
        val intFormedYear: String,
        @SerializedName("intBornYear")
        val intBornYear: String,
        @SerializedName("intDiedYear")
        val intDiedYear: String?,
        @SerializedName("strDisbanded")
        val strDisbanded: String?,
        @SerializedName("strStyle")
        val strStyle: String,
        @SerializedName("strGenre")
        val strGenre: String,
        @SerializedName("strMood")
        val strMood: String,
        @SerializedName("strWebsite")
        val strWebsite: String,
        @SerializedName("strFacebook")
        val strFacebook: String,
        @SerializedName("strTwitter")
        val strTwitter: String,
        @SerializedName("strBiographyEN")
        val strBiographyEN: String,
        @SerializedName("strBiographyDE")
        val strBiographyDE: String?,
        @SerializedName("strBiographyFR")
        val strBiographyFR: String,
        @SerializedName("strBiographyCN")
        val strBiographyCN: String?,
        @SerializedName("strBiographyIT")
        val strBiographyIT: String?,
        @SerializedName("strBiographyJP")
        val strBiographyJP: String?,
        @SerializedName("strBiographyRU")
        val strBiographyRU: String?,
        @SerializedName("strBiographyES")
        val strBiographyES: String?,
        @SerializedName("strBiographyPT")
        val strBiographyPT: String?,
        @SerializedName("strBiographySE")
        val strBiographySE: String?,
        @SerializedName("strBiographyNL")
        val strBiographyNL: String?,
        @SerializedName("strBiographyHU")
        val strBiographyHU: String?,
        @SerializedName("strBiographyNO")
        val strBiographyNO: String?,
        @SerializedName("strBiographyIL")
        val strBiographyIL: String?,
        @SerializedName("strBiographyPL")
        val strBiographyPL: String?,
        @SerializedName("strGender")
        val strGender: String,
        @SerializedName("intMembers")
        val intMembers: String,
        @SerializedName("strCountry")
        val strCountry: String,
        @SerializedName("strCountryCode")
        val strCountryCode: String,
        @SerializedName("strArtistThumb")
        val strArtistThumb: String,
        @SerializedName("strArtistLogo")
        val strArtistLogo: String,
        @SerializedName("strArtistCutout")
        val strArtistCutout: String?,
        @SerializedName("strArtistClearart")
        val strArtistClearart: String,
        @SerializedName("strArtistWideThumb")
        val strArtistWideThumb: String,
        @SerializedName("strArtistFanart")
        val strArtistFanart: String,
        @SerializedName("strArtistFanart2")
        val strArtistFanart2: String,
        @SerializedName("strArtistFanart3")
        val strArtistFanart3: String,
        @SerializedName("strArtistFanart4")
        val strArtistFanart4: String,
        @SerializedName("strArtistBanner")
        val strArtistBanner: String,
        @SerializedName("strMusicBrainzID")
        val strMusicBrainzID: String,
        @SerializedName("strISNIcode")
        val strISNIcode: String?,
        @SerializedName("strLastFMChart")
        val strLastFMChart: String?,
        @SerializedName("intCharted")
        val intCharted: String,
        @SerializedName("strLocked")
        val strLocked: String
    )

    fun toArtist(): Artist = response?.let { resp ->
        return Artist(
            idArtist = resp.idArtist,
            strArtist = resp.strArtist,
            strArtistStripped = resp.strArtistStripped,
            strArtistAlternate = resp.strArtistAlternate,
            strLabel = resp.strLabel,
            idLabel = resp.idLabel,
            intFormedYear = resp.intFormedYear,
            intBornYear = resp.intBornYear,
            intDiedYear = resp.intDiedYear,
            strDisbanded = resp.strDisbanded,
            strStyle = resp.strStyle,
            strGenre = resp.strGenre,
            strMood = resp.strMood,
            strWebsite = resp.strWebsite,
            strFacebook = resp.strFacebook,
            strTwitter = resp.strTwitter,
            strBiographyEN = resp.strBiographyEN,
            strBiographyDE = resp.strBiographyDE,
            strBiographyFR = resp.strBiographyFR,
            strBiographyCN = resp.strBiographyCN,
            strBiographyIT = resp.strBiographyIT,
            strBiographyJP = resp.strBiographyJP,
            strBiographyRU = resp.strBiographyRU,
            strBiographyES = resp.strBiographyES,
            strBiographyPT = resp.strBiographyPT,
            strBiographySE = resp.strBiographySE,
            strBiographyNL = resp.strBiographyNL,
            strBiographyHU = resp.strBiographyHU,
            strBiographyNO = resp.strBiographyNO,
            strBiographyIL = resp.strBiographyIL,
            strBiographyPL = resp.strBiographyPL,
            strGender = resp.strGender,
            intMembers = resp.intMembers,
            strCountry = resp.strCountry,
            strCountryCode = resp.strCountryCode,
            strArtistThumb = resp.strArtistThumb,
            strArtistLogo = resp.strArtistLogo,
            strArtistCutout = resp.strArtistCutout,
            strArtistClearart = resp.strArtistClearart,
            strArtistWideThumb = resp.strArtistWideThumb,
            strArtistFanart = resp.strArtistFanart,
            strArtistFanart2 = resp.strArtistFanart2,
            strArtistFanart3 = resp.strArtistFanart3,
            strArtistFanart4 = resp.strArtistFanart4,
            strArtistBanner = resp.strArtistBanner,
            strMusicBrainzID = resp.strMusicBrainzID,
            strISNIcode = resp.strISNIcode,
            strLastFMChart = resp.strLastFMChart,
            intCharted = resp.intCharted,
            strLocked = resp.strLocked
        )
    } ?: throw Exception("Unable to parse the artist response")
}
