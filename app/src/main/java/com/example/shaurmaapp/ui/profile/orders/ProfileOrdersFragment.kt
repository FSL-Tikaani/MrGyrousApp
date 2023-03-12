package com.example.shaurmaapp.ui.profile.orders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.shaurmaapp.databinding.FragmentProfileOrdersBinding

class ProfileOrdersFragment: Fragment() {

    private lateinit var binding: FragmentProfileOrdersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileOrdersBinding.inflate(inflater)

        (activity as AppCompatActivity).supportActionBar!!.show()

        return binding.root
    }
}