package com.example.dev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.dev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonAnasayfaGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAFragment)
        }

        binding.buttonAnasayfaGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXFragment)
        }
        return binding.root


    }

}