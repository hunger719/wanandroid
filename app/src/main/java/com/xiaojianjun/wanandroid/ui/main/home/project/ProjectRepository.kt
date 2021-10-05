package com.xiaojianjun.wanandroid.ui.main.home.project

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class ProjectRepository {
    suspend fun getProjectCategories() = RetrofitClient.apiService.getProjectCategories().apiData()
    suspend fun getProjectListByCid(page: Int, cid: Int) =
        RetrofitClient.apiService.getProjectListByCid(page, cid).apiData()
}