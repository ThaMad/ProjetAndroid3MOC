package com.example.theaudiodbproject.ui.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.theaudiodbproject.R
import com.example.theaudiodbproject.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {

    private var _binding: FragmentRankingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rankingViewModel =
            ViewModelProvider(this).get(RankingViewModel::class.java)

        _binding = FragmentRankingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    private fun replaceFragment(rankingFragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.rankingframelayout)
        fragmentTransaction.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
