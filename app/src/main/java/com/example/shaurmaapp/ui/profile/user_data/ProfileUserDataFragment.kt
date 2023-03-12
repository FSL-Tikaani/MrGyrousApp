package com.example.shaurmaapp.ui.profile.user_data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.shaurmaapp.databinding.FragmentProfileUserDataBinding
import com.example.shaurmaapp.ui.main.MainActivity

class ProfileUserDataFragment : Fragment(){

    private lateinit var binding: FragmentProfileUserDataBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileUserDataBinding.inflate(inflater)

        (activity as AppCompatActivity).supportActionBar!!.show()


        return binding.root
    }

}