package com.xiaojianjun.wanandroid.ui.detail

import com.xiaojianjun.wanandroid.model.bean.Article
import com.xiaojianjun.wanandroid.model.room.RoomHelper

class DetailRepository {
    suspend fun saveReadHistory(article: Article) = RoomHelper.addReadHistory(article)
}