package com.example.shaurmaapp.ui.profile.payments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.shaurmaapp.databinding.FragmentProfilePaymentsBinding

class ProfilePaymentsFragment: Fragment() {

    private lateinit var binding: FragmentProfilePaymentsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfilePaymentsBinding.inflate(inflater)

        (activity as AppCompatActivity).supportActionBar!!.show()

        return binding.root
    }
}