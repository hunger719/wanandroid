package com.xiaojianjun.wanandroid.ext

import java.text.SimpleDateFormat
import java.util.*

fun Long.toDateTime(pattern: String): String =
    SimpleDateFormat(pattern, Locale.getDefault()).format(this)