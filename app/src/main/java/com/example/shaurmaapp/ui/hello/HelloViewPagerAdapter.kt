package com.example.shaurmaapp.ui.hello

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.shaurmaapp.R

class HelloViewPagerAdapter(fragmentActivity: FragmentActivity, private val context: Context)
    : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HelloFragmentViewPager.newInstance()
            1 -> HelloFragmentViewPager.newInstance()
            else -> HelloFragmentViewPager.newInstance()
        }
    }
}