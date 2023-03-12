package com.example.shaurmaapp.data.local_storage

import com.example.shaurmaapp.R
import com.example.shaurmaapp.data.models.ProfileSettingsModel

class ProfileSettingsStorage {
    companion object{
        private val data = arrayListOf(
            ProfileSettingsModel(0, "Мои данные", R.drawable.baseline_person_24),
            ProfileSettingsModel(1, "Мои заказы", R.drawable.baseline_format_list_bulleted_24),
            ProfileSettingsModel(2, "Мои адреса", R.drawable.baseline_home_24),
            ProfileSettingsModel(3, "Мои способы оплаты", R.drawable.baseline_credit_card_24),
        )
        fun getDataList() = data
    }
}