package com.xiaojianjun.wanandroid.ui.main.discovery

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class DiscoveryRepository {
    suspend fun getBanners() = RetrofitClient.apiService.getBanners().apiData()
    suspend fun getHotWords() = RetrofitClient.apiService.getHotWords().apiData()
    suspend fun getFrequentlyWebsites() =
        RetrofitClient.apiService.getFrequentlyWebsites().apiData()
}