package com.xiaojianjun.wanandroid.model.bean

import androidx.annotation.Keep

@Keep
data class PointRecord(
    val coinCount: Int,
    val date: Long,
    val desc: String,
    val id: Int,
    val reason: String,
    val type: Int,
    val userId: Int,
    val userName: String
)