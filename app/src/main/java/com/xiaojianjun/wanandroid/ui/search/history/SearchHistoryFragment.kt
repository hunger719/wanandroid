package com.xiaojianjun.wanandroid.ui.search.history

import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isGone
import com.xiaojianjun.wanandroid.R
import com.xiaojianjun.wanandroid.base.BaseVmFragment
import com.xiaojianjun.wanandroid.model.bean.HotWord
import com.xiaojianjun.wanandroid.ui.search.SearchActivity
import com.zhy.view.flowlayout.FlowLayout
import com.zhy.view.flowlayout.TagAdapter
import kotlinx.android.synthetic.main.fragment_search_history.*
import kotlinx.android.synthetic.main.item_hot_search.view.*

class SearchHistoryFragment : BaseVmFragment<SearchHistoryViewModel>() {

    companion object {
        fun newInstance() = SearchHistoryFragment()
    }

    private lateinit var searchHistoryAdapter: SearchHistoryAdapter

    override fun layoutRes() = R.layout.fragment_search_history

    override fun viewModelClass() = SearchHistoryViewModel::class.java

    override fun initView() {
        val fragmentActivity = activity as? SearchActivity ?: return
        searchHistoryAdapter = SearchHistoryAdapter(fragmentActivity).also {
            it.onItemClickListener = { position ->
                fragmentActivity.fillSearchInput(it.data[position])
            }
            it.onDeleteClickListener = { position ->
                mViewModel.deleteSearchHistory(it.data[position])
            }
            rvSearchHistory.adapter = it
        }
    }

    override fun initData() {
        mViewModel.getHotSearch()
        mViewModel.getSearchHistory()
    }

    override fun observe() {
        super.observe()
        mViewModel.hotWords.observe(viewLifecycleOwner, {
            tvHotSearch.visibility = View.VISIBLE
            setHotwords(it)
        })
        mViewModel.searchHistory.observe(viewLifecycleOwner, {
            tvSearchHistory.isGone = it.isEmpty()
            searchHistoryAdapter.submitList(it)
        })
    }

    private fun setHotwords(hotwords: List<HotWord>) {
        tflHotSearch.run {
            adapter = object : TagAdapter<HotWord>(hotwords) {
                override fun getView(parent: FlowLayout?, position: Int, hotWord: HotWord?): View {
                    return LayoutInflater.from(parent?.context)
                        .inflate(R.layout.item_hot_search, parent, false)
                        .apply { this.tvTag.text = hotWord?.name }
                }
            }
            setOnTagClickListener { _, position, _ ->
                (activity as? SearchActivity)?.fillSearchInput(hotwords[position].name)
                false
            }
        }
    }

    fun addSearchHistory(keywords: String) {
        mViewModel.addSearchHistory(keywords)
    }

}
