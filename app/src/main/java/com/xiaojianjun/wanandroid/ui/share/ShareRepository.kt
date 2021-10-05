package com.xiaojianjun.wanandroid.ui.share

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class ShareRepository {
    suspend fun shareArticle(title: String, link: String) =
        RetrofitClient.apiService.shareArticle(title, link).apiData()
}