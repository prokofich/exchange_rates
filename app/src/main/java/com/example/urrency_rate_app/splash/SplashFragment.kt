package com.example.urrency_rate_app.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.urrency_rate_app.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
/*
начальный экран приложения
через 1,5 секунды происходит переход к просмотру валют
 */
class SplashFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        CoroutineScope(Dispatchers.Main).launch { //корутина в главном потоке
            delay(1500)
            Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_rootFragment) //переход к следующему экрану
        }
        return view
    }


}