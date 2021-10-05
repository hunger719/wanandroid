package com.xiaojianjun.wanandroid.ui.search.result

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class SearchResultRepository {

    suspend fun search(keywords: String, page: Int) =
        RetrofitClient.apiService.search(keywords, page).apiData()

}