package com.example.shaurmaapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shaurmaapp.data.api.API
import com.example.shaurmaapp.data.models.StockModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val arrStocks: MutableLiveData<ArrayList<StockModel>> = MutableLiveData()

    fun getStocks(){
        viewModelScope.launch(Dispatchers.IO){
            arrStocks.value = API.getActualStocks()
        }
    }
}