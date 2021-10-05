package com.xiaojianjun.wanandroid.model.bean

import androidx.annotation.Keep

@Keep
data class Frequently(
    val icon: String,
    val id: Int,
    val name: String,
    val link: String,
    val order: Int,
    val visible: Int
)