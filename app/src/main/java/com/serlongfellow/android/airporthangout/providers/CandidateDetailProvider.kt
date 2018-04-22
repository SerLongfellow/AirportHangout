package com.serlongfellow.android.airporthangout.providers

import com.serlongfellow.android.airporthangout.models.CandidateDetailModel

interface CandidateDetailProvider {
    fun getCandidateDetails(candidateId: Int) : CandidateDetailModel
}