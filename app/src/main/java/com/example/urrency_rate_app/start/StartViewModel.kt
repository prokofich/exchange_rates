package com.example.urrency_rate_app.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.urrency_rate_app.data_repository.Repository
import com.example.urrency_rate_app.model_nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel :ViewModel(){

    var repo = Repository()
    val my_money_list: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            my_money_list.value = repo.getNal()
        }
    }

}