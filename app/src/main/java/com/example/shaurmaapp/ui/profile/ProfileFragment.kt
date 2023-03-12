package com.example.shaurmaapp.ui.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shaurmaapp.R
import com.example.shaurmaapp.databinding.FragmentProfileBinding
import com.example.shaurmaapp.ui.adapters.ProfileSettingsAdapter

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private lateinit var viewModel: ProfileViewModel
    private lateinit var adapter: ProfileSettingsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).supportActionBar!!.hide()
        viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
        // Инициализируем RecyclerView
        adapter = ProfileSettingsAdapter {
            Log.d("ProfileSettingsAdapter", it.id.toString())
            when(it.id){
                0 -> Navigation.findNavController(binding.root).navigate(R.id.navigation_profile_user_data)
                1 -> Navigation.findNavController(binding.root).navigate(R.id.navigation_profile_orders)
                2 -> Navigation.findNavController(binding.root).navigate(R.id.navigation_profile_addresses)
                3 -> Navigation.findNavController(binding.root).navigate(R.id.navigation_profile_payments)
            }

        }
        binding.profileRecyclerViewSettings.layoutManager = LinearLayoutManager(requireContext())
        binding.profileRecyclerViewSettings.adapter = adapter
        // Получаем данные для Recycler и устанавливаем их в него
        viewModel.settingsList.observe(viewLifecycleOwner){
            adapter.setDataSet(it)
        }

        val dividerItemDecoration = DividerItemDecoration(context,LinearLayoutManager.VERTICAL)
        binding.profileRecyclerViewSettings.addItemDecoration(dividerItemDecoration)

        return binding.root
    }
}