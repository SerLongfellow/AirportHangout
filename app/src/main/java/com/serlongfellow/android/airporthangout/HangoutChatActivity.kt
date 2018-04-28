package com.serlongfellow.android.airporthangout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import com.serlongfellow.android.airporthangout.models.CandidateDetailModel
import com.serlongfellow.android.airporthangout.providers.CandidateDetailProvider
import com.serlongfellow.android.airporthangout.providers.impl.SimpleCandidateDetailProvider
import kotlinx.android.synthetic.main.activity_candidate_detail.*

class HangoutChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangout_chat)

    }
}
