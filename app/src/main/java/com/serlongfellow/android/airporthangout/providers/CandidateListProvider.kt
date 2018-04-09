package com.serlongfellow.android.airporthangout.providers

import com.serlongfellow.android.airporthangout.models.CandidateModel

interface CandidateListProvider {
    fun fetchCandidateList() : List<CandidateModel>
}