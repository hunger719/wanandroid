package com.xiaojianjun.wanandroid.ui.points.mine

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class MinePointsRespository {
    suspend fun getMyPoints() = RetrofitClient.apiService.getPoints().apiData()
    suspend fun getPointsRecord(page: Int) =
        RetrofitClient.apiService.getPointsRecord(page).apiData()
}