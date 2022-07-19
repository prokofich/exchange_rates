package com.example.urrency_rate_app.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.urrency_rate_app.R
import com.example.urrency_rate_app.start.StartAdapter
import com.example.urrency_rate_app.start.StartViewModel
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_start.view.*


class SecondFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewmodel = ViewModelProvider(this).get(SecondViewModel::class.java) //получение доступа к viewmodelsecond
        val v = inflater.inflate(R.layout.fragment_second, container, false)

        recyclerView = v.id_rv_second
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewmodel.getBeznalMoney() //вызов функции получения списка
        viewmodel.my_money_list.observe(viewLifecycleOwner,{ list ->
            list.body()?.let { adapter.setlist(it) } //отправка списка валют в адаптер
        })

        return v
    }


}