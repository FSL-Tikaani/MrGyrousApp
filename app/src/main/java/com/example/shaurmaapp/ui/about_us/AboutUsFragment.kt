package com.example.shaurmaapp.ui.about_us

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shaurmaapp.databinding.FragmentAboutUsBinding

class AboutUsFragment : Fragment() {

    private var binding: FragmentAboutUsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val aboutUsViewModel =
            ViewModelProvider(this)[AboutUsViewModel::class.java]

        binding = FragmentAboutUsBinding.inflate(inflater, container, false)
        val root: View = binding!!.root

        val textView: TextView = binding!!.textHome
        aboutUsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}