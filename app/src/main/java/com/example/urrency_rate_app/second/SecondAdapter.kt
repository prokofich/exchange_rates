package com.example.urrency_rate_app.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urrency_rate_app.R
import com.example.urrency_rate_app.model_beznal.BeznalItem
import com.example.urrency_rate_app.model_nal.NalichkaItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.id_item_name.text = listSecond[position].ccy //показ название
        holder.itemView.id_item_buy.text = listSecond[position].buy //цена покупки
        holder.itemView.id_item_sale.text = listSecond[position].sale //цена продажи
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setlist(list: List<BeznalItem>){
        listSecond = list
        notifyDataSetChanged() //обновление списка при его изменении
    }

}