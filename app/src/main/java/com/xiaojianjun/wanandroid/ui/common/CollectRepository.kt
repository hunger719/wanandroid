package com.xiaojianjun.wanandroid.ui.common

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class CollectRepository {
    suspend fun collect(id: Long) = RetrofitClient.apiService.collect(id)
    suspend fun uncollect(id: Long) = RetrofitClient.apiService.uncollect(id)
}