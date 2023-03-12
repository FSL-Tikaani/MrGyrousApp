package com.example.shaurmaapp.ui.about_us

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is About Us Fragment"
    }
    val text: LiveData<String> = _text
}