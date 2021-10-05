package com.xiaojianjun.wanandroid.util

import android.app.Activity
import androidx.core.app.ShareCompat
import com.xiaojianjun.wanandroid.R

fun share(
    activity: Activity,
    title: String? = activity.getString(R.string.app_name),
    content: String?
) {
    ShareCompat.IntentBuilder.from(activity)
        .setType("text/plain")
        .setSubject(title)
        .setText(content)
        .setChooserTitle(title)
        .startChooser()
}