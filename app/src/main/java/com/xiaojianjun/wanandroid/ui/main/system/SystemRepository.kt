package com.xiaojianjun.wanandroid.ui.main.system

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class SystemRepository {
    suspend fun getArticleCategories() = RetrofitClient.apiService.getArticleCategories().apiData()
}