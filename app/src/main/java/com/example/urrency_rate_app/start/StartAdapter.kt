package com.example.urrency_rate_app.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urrency_rate_app.R
import com.example.urrency_rate_app.model_nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.id_item_name.text = listStart[position].ccy //показ названия
        holder.itemView.id_item_buy.text = listStart[position].buy //цена покупки
        holder.itemView.id_item_sale.text = listStart[position].sale //цена продажи
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setlist(list: List<NalichkaItem>){
        listStart = list
        notifyDataSetChanged() //обновление списка при его изменении
    }

}