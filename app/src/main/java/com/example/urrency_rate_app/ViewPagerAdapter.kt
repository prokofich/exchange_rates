package com.example.urrency_rate_app

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.urrency_rate_app.second.SecondFragment
import com.example.urrency_rate_app.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return 2 //всего есть 2 экрана
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> StartFragment() //при перелистывании влево показывается экран с наличкой
            else -> SecondFragment() //при перелистывании вправо показывается экран с безналичкой
        }
    }
}