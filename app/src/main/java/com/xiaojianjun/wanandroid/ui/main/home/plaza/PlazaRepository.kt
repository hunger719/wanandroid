package com.xiaojianjun.wanandroid.ui.main.home.plaza

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class PlazaRepository {
    suspend fun getUserArticleList(page: Int) =
        RetrofitClient.apiService.getUserArticleList(page).apiData()
}