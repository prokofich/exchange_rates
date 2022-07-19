package com.example.urrency_rate_app.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.urrency_rate_app.data_repository.Repository
import com.example.urrency_rate_app.model_beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val my_money_list: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            my_money_list.value = repo.getBeznal()
        }
    }

}