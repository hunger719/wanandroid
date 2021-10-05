package com.xiaojianjun.wanandroid.ui.main.system.pager

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class SystemPagerRepository {

    suspend fun getArticleListByCid(page: Int, cid: Int) =
        RetrofitClient.apiService.getArticleListByCid(page, cid).apiData()
}