package com.example.shaurmaapp.ui.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.shaurmaapp.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelloBinding

    private lateinit var viewPager: ViewPager2
    private lateinit var btnBack: Button
    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init
        viewPager = binding.helloViewPager
        btnBack = binding.helloBtnBack
        btnNext = binding.helloBtnNext
        //init ViewPager2
        viewPager.adapter = HelloViewPagerAdapter(this, this)
        viewPager.offscreenPageLimit = 1
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                Log.d("ViewPager2 Debug", "position: $position")
            }
        })

        btnNext.setOnClickListener {
            if (getItem() > viewPager.childCount) {
                finish()
            } else {
                viewPager.setCurrentItem(getItem() + 1, true)
            }
        }

        btnBack.setOnClickListener {
            if (getItem() == 0) {
                finish()
            } else {
                viewPager.setCurrentItem(getItem() - 1, true)
            }
        }
    }

    private fun getItem(): Int {
        return viewPager.currentItem
    }
}