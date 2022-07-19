package com.example.urrency_rate_app.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.urrency_rate_app.R
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {


    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewmodel = ViewModelProvider(this).get(StartViewModel::class.java) //получение доступа к viewmodelstart
        val v =  inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.id_rv_start
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewmodel.getNalMoney() //вызов функции получение списска валют
        viewmodel.my_money_list.observe(viewLifecycleOwner,{ list ->
            list.body()?.let { adapter.setlist(it) } //отправка списка валют в адаптер
        })



        return v
    }


}