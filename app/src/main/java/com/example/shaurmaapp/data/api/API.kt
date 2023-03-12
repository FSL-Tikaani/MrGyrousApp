package com.example.shaurmaapp.data.api

import com.example.shaurmaapp.data.models.StockModel

class API {
    companion object {
        fun getActualStocks(): ArrayList<StockModel> {
            val arrStocks :ArrayList<StockModel> = ArrayList()
            // Получаем с сервера актуальные акции
            // ...
            arrStocks.add(StockModel(1, "Header1"))
            arrStocks.add(StockModel(2, "Header2"))
            arrStocks.add(StockModel(3, "Header3"))

            return arrStocks
        }
    }
}