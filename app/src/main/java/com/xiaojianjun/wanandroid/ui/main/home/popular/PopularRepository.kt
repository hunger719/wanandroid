package com.xiaojianjun.wanandroid.ui.main.home.popular

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class PopularRepository {
    suspend fun getTopArticleList() = RetrofitClient.apiService.getTopArticleList().apiData()
    suspend fun getArticleList(page: Int) = RetrofitClient.apiService.getArticleList(page).apiData()
}