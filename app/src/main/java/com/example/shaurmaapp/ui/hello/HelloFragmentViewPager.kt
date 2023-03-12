package com.example.shaurmaapp.ui.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shaurmaapp.databinding.FragmentHelloBinding

class HelloFragmentViewPager : Fragment() {

    private lateinit var binding: FragmentHelloBinding

    private var title = "Title ViewPager2"
    private var description = "Description ViewPager2"
    private var imgResource = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //getting data
        // ...
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHelloBinding.inflate(inflater, container, false)

        binding.helloImg.setImageResource(imgResource)
        binding.helloTvTitle.text = title
        binding.helloTvDescription.text = description

        return binding.root
    }

    companion object {
        fun newInstance(): HelloFragmentViewPager {
            return HelloFragmentViewPager()
        }
    }

}