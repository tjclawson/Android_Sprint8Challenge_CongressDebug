package com.lambdaschool.congressdata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.support.v7.widget.RecyclerView

import java.util.ArrayList

class CongresspersonListViewModel : ViewModel() {
    var overviewList: LiveData<ArrayList<OfficialOverview>>? = null
    get() {
        if (field == null) {
            loadList()
        }
        return field
    }

    private fun loadList(): LiveData<ArrayList<OfficialOverview>>? {
        overviewList = OverviewListRepository.overviewList
        return overviewList
    }

    fun loadThings(listAdapter: OverviewListAdapter?, layoutList: RecyclerView, list: ArrayList<OfficialOverview> ) {
        assert(list != null)

        // using recycler view
        list?.let {
            listAdapter = OverviewListAdapter(list)
            layoutList!!.adapter = listAdapter
        }
        // using scroll view
        /*for (OfficialOverview officialOverview : overviewList) {
    scrollData.addView(getDefaultTextView(officialOverview.getDisplayName(),
                                          officialOverview.getId()));
}*/
    }
}
