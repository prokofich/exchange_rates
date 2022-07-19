package com.example.urrency_rate_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.*
import kotlinx.android.synthetic.main.fragment_root.view.*


class RootFragment : Fragment() {

    private var ctx:Context? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        ctx = context //получение контекста

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.id_tab_layout.tabIconTint = null

        view.id_view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(view.id_tab_layout,view.id_view_pager){ //связь фрагмента и меню снизу
            tab,pos ->
            when(pos){
                0 ->{
                    tab.setIcon(R.drawable.ic_money_nal) //установка иконок снизу
                }
                1 ->{
                    tab.setIcon(R.drawable.ic_money_beznal) //установка иконок снизу
                }
            }
        }.attach()

        return view
    }

}