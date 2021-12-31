package com.example.myarchive2022.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myarchive2022.databinding.FragmentBoanBinding

class BoanFragment: Fragment() {

    private val binding: FragmentBoanBinding by lazy {
        FragmentBoanBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
}