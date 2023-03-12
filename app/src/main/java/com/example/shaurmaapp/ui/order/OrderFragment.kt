package com.example.shaurmaapp.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shaurmaapp.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {

    private var binding: FragmentOrderBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val orderViewModel =
            ViewModelProvider(this)[OrderViewModel::class.java]

        binding = FragmentOrderBinding.inflate(inflater, container, false)
        val root: View = binding!!.root

        val textView: TextView = binding!!.textNotifications
        orderViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}