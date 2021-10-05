package com.xiaojianjun.wanandroid.ui.opensource

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.xiaojianjun.wanandroid.R
import com.xiaojianjun.wanandroid.model.bean.Article
import kotlinx.android.synthetic.main.item_open_source.view.*

class OpenSourceAdapter : BaseQuickAdapter<Article, BaseViewHolder>(R.layout.item_open_source) {
    override fun convert(holder: BaseViewHolder, item: Article) {
        holder.itemView.run {
            tvTitle.text = item.title
            tvLink.text = item.link
        }
    }
}