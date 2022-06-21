package com.example.navigationcomponentodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodevi.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false)
        tasarim.buttonGeriGit.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yAnasayfaGecis)
        }
        return tasarim.root
    }
}