package com.serlongfellow.android.airporthangout.providers

import com.serlongfellow.android.airporthangout.models.CandidateListModel

interface CandidateListProvider {
    fun fetchCandidateList() : List<CandidateListModel>
}