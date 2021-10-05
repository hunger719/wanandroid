package com.xiaojianjun.wanandroid.ui.main.discovery

import android.content.Context
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.xiaojianjun.wanandroid.R
import com.xiaojianjun.wanandroid.common.core.load
import com.xiaojianjun.wanandroid.model.bean.Banner
import com.youth.banner.loader.ImageLoader

class BannerImageLoader(val fragment: Fragment) : ImageLoader() {
    override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
        val imagePath = (path as? Banner)?.imagePath
        imageView?.load(
            lifecycle = fragment.lifecycle,
            url = imagePath,
            placeholder = R.drawable.shape_bg_image_default
        )
    }

}