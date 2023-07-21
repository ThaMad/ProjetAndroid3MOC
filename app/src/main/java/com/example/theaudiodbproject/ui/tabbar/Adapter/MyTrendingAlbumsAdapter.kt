import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.ui.model.TrendingAlbum
import com.example.theaudiodbproject.ui.model.TrendingAlbumList
import com.example.theaudiodbproject.ui.model.TrendingTrack

class MyTrendingAlbumsAdapter(
    val callback: OnTrendingAlbumListClickListener
) : RecyclerView.Adapter<MyTrendingAlbumsAdapter.TrendingAlbumListViewHolder>() {

    private val data = mutableListOf<TrendingAlbum>()

    fun setData(trendingAlbum: List<TrendingAlbum>) {
        data.clear()
        data.addAll(trendingAlbum)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingAlbumListViewHolder {
        return TrendingAlbumListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.trendingalbum_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TrendingAlbumListViewHolder, position: Int) {
        val trendingAlbum = data[position]
        holder.update(trendingAlbum)
        //holder.thumbnail.setImageResource(trendingAlbum.strTrackThumb)
        holder.artist.text = trendingAlbum.strArtist
        holder.album.text = trendingAlbum.strAlbum
        holder.rankInCharts.text = trendingAlbum.intChartPlace
        holder.itemView.setOnClickListener {
            callback.onTrendingAlbumClicked(trendingAlbum)
        }
    }

    class TrendingAlbumListViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val thumbnail: ImageView = v.findViewById(R.id.album_thumbnail)
        val album: TextView = v.findViewById(R.id.albumName)
        val artist: TextView = v.findViewById(R.id.trendingalbumartist)
        val rankInCharts: TextView = v.findViewById((R.id.rankinchartsalbum))

        fun update(trendingAlbum: TrendingAlbum) {
            Glide.with(itemView).load(trendingAlbum.strAlbumThumb).into(thumbnail)
            album.text = trendingAlbum.strAlbum
            artist.text = trendingAlbum.strArtist
            rankInCharts.text = trendingAlbum.intChartPlace
        }

    }

    interface OnTrendingAlbumListClickListener {
        fun onTrendingAlbumClicked(album: TrendingAlbum)
    }
}
