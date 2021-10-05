package com.xiaojianjun.wanandroid.ui.collection

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class CollectionRepository {
    suspend fun getCollectionList(page: Int) =
        RetrofitClient.apiService.getCollectionList(page).apiData()
}