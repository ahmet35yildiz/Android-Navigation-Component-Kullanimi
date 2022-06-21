package com.example.navigationcomponentodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodevi.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)
        tasarim.buttonGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bYGecis)
        }
        return tasarim.root
    }
}