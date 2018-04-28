package com.serlongfellow.android.airporthangout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.serlongfellow.android.airporthangout.providers.impl.SimpleCandidateListProvider
import kotlinx.android.synthetic.main.activity_candidate_search.*

class CandidateSearchActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var candidateListAdapter: CandidateListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidate_search)

        setupRecycler()
    }

    private fun setupRecycler() {
        linearLayoutManager = LinearLayoutManager(this)
        candidateListAdapter = CandidateListAdapter(SimpleCandidateListProvider())

        candidateRecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = candidateListAdapter
        }
    }
}
