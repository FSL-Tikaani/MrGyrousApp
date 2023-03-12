package com.example.shaurmaapp.ui.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shaurmaapp.data.api.API
import com.example.shaurmaapp.data.models.ProfileSettingsModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProfileViewModel : ViewModel() {
    val settingsList: MutableLiveData<ArrayList<ProfileSettingsModel>> = MutableLiveData()

    init {
        loadSettings()
    }
    private fun loadSettings() {
        viewModelScope.launch(Dispatchers.IO){
            settingsList.postValue(API.getProfileSettings())
        }
    }
}