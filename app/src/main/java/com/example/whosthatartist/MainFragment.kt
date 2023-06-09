package com.example.whosthatartist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.whosthatartist.databinding.ActivityMainBinding

class MainFragment : Fragment() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel : ArtistViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityMainBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView

    }
}