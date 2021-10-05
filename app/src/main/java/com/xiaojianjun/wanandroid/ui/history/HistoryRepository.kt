package com.xiaojianjun.wanandroid.ui.history

import com.xiaojianjun.wanandroid.model.bean.Article
import com.xiaojianjun.wanandroid.model.room.RoomHelper

class HistoryRepository {

    suspend fun getReadHistory() = RoomHelper.queryAllReadHistory()
    suspend fun deleteHistory(article: Article) = RoomHelper.deleteReadHistory(article)

}