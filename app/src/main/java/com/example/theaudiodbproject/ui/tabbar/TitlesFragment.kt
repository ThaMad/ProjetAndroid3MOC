package com.example.theaudiodbproject.ui.tabbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.ui.api.NetworkManager
import com.example.theaudiodbproject.ui.model.TrendingTrack
import com.example.theaudiodbproject.ui.model.TrendingTrackList
import com.example.theaudiodbproject.ui.tabbar.Adapter.myTrendingTracksAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.reflect.Array

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TitlesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitlesFragment : Fragment(),myTrendingTracksAdapter.OnTrendingTrackListClickListener{

    private lateinit var adapter: myTrendingTracksAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var trendingTrackList: TrendingTrackList



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_titles, container, false)
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

        trendingTrackList = TrendingTrackList(ArrayList()) // Initialize an empty TrendingTrackList

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.trendingRecyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = myTrendingTracksAdapter(trendingTrackList, this)
        recyclerView.adapter = adapter

        // Call the API to get trending tracks and update the list
        loadTrendingTracks()
    }

    private fun loadTrendingTracks() {
        GlobalScope.launch(Dispatchers.Main) {
            try {
                // Call the API function to get trending tracks
                val response = NetworkManager.getTrendingTracks()
                // If the response is successful and contains data, update the list
                response.trendingTrack?.let {
                    trendingTrackList.trendingTrack?.addAll(it)
                    adapter.notifyDataSetChanged()
                }
            } catch (e: Exception) {
                // Handle the error, such as showing a toast with the error message
                Toast.makeText(context, "Error fetching trending tracks: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onTrendingTrackClicked(trendingTrack: TrendingTrack) {
        // Handle the click event for a trending track item here
        // You can implement your logic when a track is clicked
    }


    }


