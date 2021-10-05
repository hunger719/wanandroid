package com.xiaojianjun.wanandroid.ui.main.navigation

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class NavigationRepository {
    suspend fun getNavigations() = RetrofitClient.apiService.getNavigations().apiData()
}