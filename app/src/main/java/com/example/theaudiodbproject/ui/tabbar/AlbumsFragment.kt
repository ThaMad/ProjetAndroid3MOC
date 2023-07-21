package com.example.theaudiodbproject.ui.tabbar

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.ui.model.TrendingAlbum
import com.example.theaudiodbproject.ui.model.TrendingAlbumList
import MyTrendingAlbumsAdapter
import com.example.theaudiodbproject.ui.api.NetworkManager
import com.example.theaudiodbproject.ui.model.TrendingTrack
import com.example.theaudiodbproject.ui.tabbar.Adapter.MyTrendingTracksAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TitlesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumsFragment : Fragment(){

    private val albumTrendingTrackAdapter = MyTrendingAlbumsAdapter(object : MyTrendingAlbumsAdapter.OnTrendingAlbumListClickListener {
        override fun onTrendingAlbumClicked(album: TrendingAlbum) {
            TODO("Not yet implemented")
        }
    })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Albums fragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerView = view.findViewById<RecyclerView>(R.id.trendingalbumsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = albumTrendingTrackAdapter

        GlobalScope.launch(Dispatchers.Main) {
            try {
                val response = NetworkManager.getTrendingAlbums().await()
                albumTrendingTrackAdapter.setData(response.trending.sortedBy { it.intChartPlace?.toInt() })
            } catch (e: Exception) {
                // Gérer les erreurs ici, par exemple afficher un message d'erreur.
                Log.e("Erreur_API", "Erreur lors de la récupération des classements : ${e.message}")
            }
        }


    }
}
