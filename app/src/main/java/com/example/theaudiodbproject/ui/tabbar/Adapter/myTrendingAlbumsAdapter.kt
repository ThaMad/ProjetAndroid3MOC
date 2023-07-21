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

class myTrendingAlbumsAdapter(
    val trendingAlbumList: TrendingAlbumList,
    val callback: OnTrendingAlbumListClickListener
) : RecyclerView.Adapter<myTrendingAlbumsAdapter.TrendingAlbumListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingAlbumListViewHolder {
        return TrendingAlbumListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.trendingalbum_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return trendingAlbumList.trendingAlbum?.size ?: 0
    }

    override fun onBindViewHolder(holder: TrendingAlbumListViewHolder, position: Int) {
        val trendingAlbum = trendingAlbumList[position]
        holder.update(trendingAlbum)
        //holder.thumbnail.setImageResource(trendingAlbum.strTrackThumb)
        holder.artist.text = trendingAlbum.strArtist
        holder.album.text = trendingAlbum.strAlbum
        holder.itemView.setOnClickListener {
            callback.onTrendingAlbumClicked(trendingAlbum)
        }
    }

    class TrendingAlbumListViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        val thumbnail: ImageView = v.findViewById(R.id.album_thumbnail)
        val album: TextView = v.findViewById(R.id.albumName)
        val artist: TextView = v.findViewById(R.id.trendingalbumartist)

        fun update(trendingAlbum: TrendingAlbum) {
            Glide.with(itemView).load(trendingAlbum.strTrackThumb).into(thumbnail)
            album.text = trendingAlbum.strAlbum
            artist.text = trendingAlbum.strArtist
        }

    }

    interface OnTrendingAlbumListClickListener {
        fun onTrendingAlbumClicked(album: TrendingAlbum)
    }
}
