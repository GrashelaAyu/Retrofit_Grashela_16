package com.example.retrofit_grashela_16.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_grashela_16.databinding.ItemProvinceBinding
import com.example.retrofit_grashela_16.model.ProvinceResponse

class ProvinceAdapter (private var list: ArrayList<ProvinceResponse>): RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>(){
    inner class ProvinceViewHolder(val binding: ItemProvinceBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(province: ProvinceResponse){
            with(itemView){
                binding.tvName.text = province.attributes.province
                binding.tvPositive.text = province.attributes.positive.toString()
                binding.tvRecover.text = province.attributes.recover.toString()
                binding.tvDeath.text = province.attributes.death.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
        return ProvinceViewHolder(
            ItemProvinceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}