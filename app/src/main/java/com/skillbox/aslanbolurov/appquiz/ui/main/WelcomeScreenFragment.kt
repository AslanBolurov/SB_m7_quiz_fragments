package com.skillbox.aslanbolurov.appquiz.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.skillbox.aslanbolurov.appquiz.R
import com.skillbox.aslanbolurov.appquiz.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFragment : Fragment() {

    private var _binding : FragmentWelcomeScreenBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWelcomeScreenBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnActionToSurveyFragment.setOnClickListener{
            findNavController().navigate(R.id.action_WelcomeFragment_to_SurveyFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

//    companion object {
//        fun newInstance() = WelcomeScreenFragment()
//    }
}