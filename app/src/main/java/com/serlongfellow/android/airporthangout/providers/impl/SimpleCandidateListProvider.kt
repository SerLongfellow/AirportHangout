package com.serlongfellow.android.airporthangout.providers.impl

import android.graphics.BitmapFactory
import com.serlongfellow.android.airporthangout.BaseApplication
import com.serlongfellow.android.airporthangout.R
import com.serlongfellow.android.airporthangout.models.CandidateListModel
import com.serlongfellow.android.airporthangout.providers.CandidateListProvider

class SimpleCandidateListProvider : CandidateListProvider {

    private var candidates = mutableListOf<CandidateListModel>()

    init {
        var profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.arkansas_candidate)
        candidates.add(CandidateListModel(
                1,
                "Bubba J.",
                "Little Rock, AR, USA",
                "Methamphetamine Connoisseur",
                profilePhoto)
        )

        profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.seattle_candidate)
        candidates.add(CandidateListModel(
                2,
                "Kurt C.",
                "Seattle, WA, USA",
                "Rehabilitation Therapist",
                profilePhoto)
        )
    }

    override fun fetchCandidateList(): List<CandidateListModel> {
        return candidates.toList()
    }
}