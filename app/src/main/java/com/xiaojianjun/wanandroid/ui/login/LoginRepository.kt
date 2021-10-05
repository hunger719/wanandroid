package com.xiaojianjun.wanandroid.ui.login

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class LoginRepository {
    suspend fun login(username: String, password: String) =
        RetrofitClient.apiService.login(username, password).apiData()
}