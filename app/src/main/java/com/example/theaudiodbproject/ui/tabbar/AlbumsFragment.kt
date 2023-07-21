package com.example.theaudiodbproject.ui.tabbar

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.ui.api.NetworkManager
import com.example.theaudiodbproject.ui.model.TrendingAlbum
import com.example.theaudiodbproject.ui.model.TrendingAlbumList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import myTrendingAlbumsAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TitlesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumsFragment : Fragment(), myTrendingAlbumsAdapter.OnTrendingAlbumListClickListener {

    private lateinit var adapter: myTrendingAlbumsAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var trendingAlbumList: TrendingAlbumList

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Albums fragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TitlesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        trendingAlbumList = TrendingAlbumList(ArrayList())

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.trendingalbumsRecyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = myTrendingAlbumsAdapter(trendingAlbumList, this)
        recyclerView.adapter = adapter

    }

    override fun onTrendingAlbumClicked(trendingAlbum: TrendingAlbum) {
        TODO("Not yet implemented")
    }
}
