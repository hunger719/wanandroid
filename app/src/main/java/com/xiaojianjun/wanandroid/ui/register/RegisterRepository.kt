package com.xiaojianjun.wanandroid.ui.register

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class RegisterRepository {
    suspend fun register(username: String, password: String, repassword: String) =
        RetrofitClient.apiService.register(username, password, repassword).apiData()
}