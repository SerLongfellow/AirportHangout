package com.serlongfellow.android.airporthangout.providers.impl

import android.graphics.BitmapFactory
import android.support.v4.content.ContextCompat
import com.serlongfellow.android.airporthangout.BaseApplication
import com.serlongfellow.android.airporthangout.R
import com.serlongfellow.android.airporthangout.models.CandidateModel
import com.serlongfellow.android.airporthangout.providers.CandidateListProvider

class SimpleCandidateListProvider : CandidateListProvider {

    private var candidates = mutableListOf<CandidateModel>()

    init {
        var profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.arkansas_candidate)
        candidates.add(CandidateModel("Bubba J.", "Little Rock, AR, USA", "Methamphetamine Connoisseur", profilePhoto))

        profilePhoto = BitmapFactory.decodeResource(BaseApplication.instance.resources, R.drawable.seattle_candidate)
        candidates.add(CandidateModel("Kurt C.", "Seattle, WA, USA", "Rehabilitation Therapist", profilePhoto))
    }

    override fun fetchCandidateList(): List<CandidateModel> {
        return candidates.toList()
    }
}