package com.serlongfellow.android.airporthangout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.serlongfellow.android.airporthangout.models.CandidateDetailModel
import com.serlongfellow.android.airporthangout.providers.CandidateDetailProvider
import com.serlongfellow.android.airporthangout.providers.impl.SimpleCandidateDetailProvider
import kotlinx.android.synthetic.main.activity_candidate_detail.*

class CandidateDetailActivity : AppCompatActivity() {
    companion object {
        const val INTENT_EXTRA_CANDIDATE_ID = "airporthangout.CANDIDATE_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidate_detail)

        val candidateId = intent.extras.getInt(INTENT_EXTRA_CANDIDATE_ID)

        val detailProvider = SimpleCandidateDetailProvider()
        var candidate = detailProvider.getCandidateDetails(candidateId)

        setViewFields(candidate)
    }

    private fun setViewFields(candidate : CandidateDetailModel) {
        profilePictureImageView.setImageBitmap(candidate.profileImage)
        nameTextView.text = candidate.name
        originLocationTextView.text = candidate.originLocation
        occupationTextView.text = candidate.occupation
    }
}
