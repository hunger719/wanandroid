package com.xiaojianjun.wanandroid.model.bean

import androidx.annotation.Keep

@Keep
data class PointRank(
    val coinCount: Int,
    val level: Int,
    val rank: Int,
    val userId: Int,
    val username: String
)