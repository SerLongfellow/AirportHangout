package com.serlongfellow.android.airporthangout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.TextView
import com.serlongfellow.android.airporthangout.IntentExtras.Companion.INTENT_EXTRA_CANDIDATE_ID
import com.serlongfellow.android.airporthangout.models.CandidateDetailModel
import com.serlongfellow.android.airporthangout.providers.CandidateDetailProvider
import com.serlongfellow.android.airporthangout.providers.impl.SimpleCandidateDetailProvider
import kotlinx.android.synthetic.main.activity_candidate_detail.*

class CandidateDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidate_detail)

        val candidateId = intent.extras.getInt(INTENT_EXTRA_CANDIDATE_ID)

        val detailProvider = SimpleCandidateDetailProvider()
        val candidate = detailProvider.getCandidateDetails(candidateId)

        setViewFields(candidate)
        hangoutButton.setOnClickListener { startHangoutChatActivity(candidateId) }
    }

    private fun setViewFields(candidate: CandidateDetailModel) {
        profilePictureImageView.setImageBitmap(candidate.profileImage)
        nameTextView.text = candidate.name
        originLocationTextView.text = candidate.originLocation
        occupationTextView.text = candidate.occupation
        addCandidateInterestsToView(candidate.interests)

    }

    private fun addCandidateInterestsToView(interests: List<String>) {
        for (interest in interests) {
            val interestTextView = TextView(this)
            interestTextView.text = interest

            interestsListLinearLayout.addView(interestTextView)
        }
    }

    private fun startHangoutChatActivity(candidateId: Int) {
        val intent = Intent(this, HangoutChatActivity::class.java).apply {
            putExtra(INTENT_EXTRA_CANDIDATE_ID, candidateId)
        }

        this.startActivity(intent)
    }
}
