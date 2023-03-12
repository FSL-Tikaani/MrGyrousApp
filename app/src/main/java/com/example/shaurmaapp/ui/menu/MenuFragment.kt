package com.example.shaurmaapp.ui.menu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.shaurmaapp.databinding.FragmentMenuBinding
import com.example.shaurmaapp.ui.hello.HelloActivity

class MenuFragment : Fragment() {

    private var binding: FragmentMenuBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menuViewModel =
            ViewModelProvider(this)[MenuViewModel::class.java]

        binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root: View = binding!!.root

        val textView: TextView = binding!!.textDashboard
        menuViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        binding!!.btnGoHello.setOnClickListener {
            startActivity(Intent(context, HelloActivity::class.java))
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}