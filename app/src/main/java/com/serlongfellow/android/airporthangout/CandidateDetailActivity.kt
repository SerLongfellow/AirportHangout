package com.serlongfellow.android.airporthangout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_candidate_detail.*

class CandidateDetailActivity : AppCompatActivity() {
    companion object {
        const val INTENT_CANDIDATE_ID = "airporthangout.CANDIDATE_ID"
    }

    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var candidateListAdapter: CandidateListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidate_detail)
    }
}
