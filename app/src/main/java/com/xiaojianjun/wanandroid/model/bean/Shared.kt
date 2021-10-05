package com.xiaojianjun.wanandroid.model.bean

import androidx.annotation.Keep

@Keep
data class Shared(
    val coinInfo: PointRank,
    val shareArticles: Pagination<Article>
)