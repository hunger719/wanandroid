package com.xiaojianjun.wanandroid.ui.points.rank

import com.xiaojianjun.wanandroid.model.api.RetrofitClient

class PointsRankRespository {
    suspend fun getPointsRank(page: Int) =
        RetrofitClient.apiService.getPointsRank(page).apiData()
}