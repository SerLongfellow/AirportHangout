package com.serlongfellow.android.airporthangout.providers.impl

import android.graphics.BitmapFactory
import com.serlongfellow.android.airporthangout.BaseApplication
import com.serlongfellow.android.airporthangout.R
import com.serlongfellow.android.airporthangout.models.CandidateDetailModel
import com.serlongfellow.android.airporthangout.providers.CandidateDetailProvider

class SimpleCandidateDetailProvider : CandidateDetailProvider {

    private var candidates = HashMap<Int, CandidateDetailModel>()

    init {
        var profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.arkansas_candidate)
        var id = 1
        candidates[id] = CandidateDetailModel(
                         id,
                         "Bubba J.",
                         "Little Rock, AR, USA",
                         "Methamphetamine Connoisseur",
                         profilePhoto)


        profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.seattle_candidate)
        id = 2
        candidates[id] = CandidateDetailModel(
                         id,
                         "Kurt C.",
                         "Seattle, WA, USA",
                         "Rehabilitation Therapist",
                         profilePhoto)

    }

    override fun getCandidateDetails(candidateId: Int) : CandidateDetailModel {
        var details = candidates[candidateId]

        if (details == null) {
            throw NoSuchElementException("No candidate details found for ID [$candidateId]")
        } else {
            return details
        }
    }
}