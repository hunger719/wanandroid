package com.xiaojianjun.wanandroid.ui.main.home.wechat

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class WechatRepository {
    suspend fun getWechatCategories() = RetrofitClient.apiService.getWechatCategories().apiData()
    suspend fun getWechatArticleList(page: Int, id: Int) =
        RetrofitClient.apiService.getWechatArticleList(page, id).apiData()
}