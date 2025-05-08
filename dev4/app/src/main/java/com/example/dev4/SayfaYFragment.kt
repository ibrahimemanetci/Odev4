package com.example.dev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.example.dev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        val geriTusu = object : OnBackPressedCallback(false) {
            override fun handleOnBackPressed() {
                Log.e("Sayfa Y","Geri tuşu çalıştı.")
                isEnabled = true
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)
        return binding.root

    }

}