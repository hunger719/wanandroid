package com.xiaojianjun.wanandroid.ui.share

import android.view.inputmethod.EditorInfo
import com.xiaojianjun.wanandroid.R
import com.xiaojianjun.wanandroid.base.BaseVmActivity
import com.xiaojianjun.wanandroid.common.core.ActivityHelper
import com.xiaojianjun.wanandroid.ext.hideSoftInput
import com.xiaojianjun.wanandroid.ext.showToast
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : BaseVmActivity<ShareViewModel>() {

    override fun layoutRes() = R.layout.activity_share
    override fun viewModelClass() = ShareViewModel::class.java

    override fun initView() {
        ivBack.setOnClickListener { ActivityHelper.finish(ShareActivity::class.java) }
        acetlink.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                tvSubmit.performClick()
                true
            } else {
                false
            }
        }
        tvSubmit.setOnClickListener {
            val title = acetTitle.text.toString().trim()
            val link = acetlink.text.toString().trim()
            if (title.isEmpty()) {
                showToast(R.string.title_toast)
                return@setOnClickListener
            }
            if (link.isEmpty()) {
                showToast(R.string.link_toast)
                return@setOnClickListener
            }
            tvSubmit.hideSoftInput()
            mViewModel.shareArticle(title, link)
        }
    }

    override fun initData() {
        mViewModel.getUserInfo()
    }

    override fun observe() {
        super.observe()
        mViewModel.run {
            userInfo.observe(this@ShareActivity, {
                val sharePeople = if (it.nickname.isEmpty()) it.username else it.nickname
                acetSharePeople.setText(sharePeople)
            })
            submitting.observe(this@ShareActivity, {
                if (it) showProgressDialog(R.string.sharing_article) else dismissProgressDialog()
            })
            shareResult.observe(this@ShareActivity, {
                if (it) {
                    showToast(R.string.share_article_success)
                }
            })
        }
    }
}
