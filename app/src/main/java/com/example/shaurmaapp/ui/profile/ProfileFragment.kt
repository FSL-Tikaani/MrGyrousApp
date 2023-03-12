package com.example.shaurmaapp.ui.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shaurmaapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var binding: FragmentProfileBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val orderViewModel =
            ViewModelProvider(this)[ProfileViewModel::class.java]

        binding = FragmentProfileBinding.inflate(inflater, container, false)

        /*val textView: TextView = binding?.textProfile
        orderViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}