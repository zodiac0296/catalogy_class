package com.example.myapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.Servies.SharedPreferenceHelper
import com.example.myapplication.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBlankBinding.inflate(inflater,container,false)
        val sharedPref = context?.let { SharedPreferenceHelper(it) }
        binding.btnSave.setOnClickListener {
            sharedPref?.login = binding.textView.text.toString()
            sharedPref?.password = binding.textView2.text.toString()
        }
        return binding.root
    }
}