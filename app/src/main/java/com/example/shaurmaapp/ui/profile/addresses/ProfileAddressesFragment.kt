package com.example.shaurmaapp.ui.profile.addresses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.shaurmaapp.databinding.FragmentProfileAddressesBinding

class ProfileAddressesFragment : Fragment(){

    private lateinit var binding: FragmentProfileAddressesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileAddressesBinding.inflate(inflater)

        (activity as AppCompatActivity).supportActionBar!!.show()

        return binding.root
    }
}