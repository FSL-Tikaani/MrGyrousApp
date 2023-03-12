package com.example.shaurmaapp.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shaurmaapp.data.models.ProfileSettingsModel
import com.example.shaurmaapp.databinding.CardViewProfileSettingsBinding
import java.util.ArrayList

class ProfileSettingsAdapter(private val clickedItem: (model: ProfileSettingsModel) -> Unit) : RecyclerView.Adapter<ProfileSettingsAdapter.ViewHolder>() {

    private var dataList = emptyList<ProfileSettingsModel>()

    class ViewHolder(
        private val binding: CardViewProfileSettingsBinding,
        private val clickedItem: (model: ProfileSettingsModel) -> Unit
    ): RecyclerView.ViewHolder(binding.root){
        fun bind(profileSettingsModel: ProfileSettingsModel){
            binding.profileCardViewTvName.text = profileSettingsModel.name
            binding.profileCardViewImg.setImageResource(profileSettingsModel.res_img)
            binding.root.setOnClickListener{clickedItem(profileSettingsModel)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CardViewProfileSettingsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false), clickedItem
            )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setDataSet(arrProfileSettingsModel: ArrayList<ProfileSettingsModel>) {
        dataList = arrProfileSettingsModel
        notifyDataSetChanged()
    }

}