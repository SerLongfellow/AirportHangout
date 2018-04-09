package com.serlongfellow.android.airporthangout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var candidateListAdapter: CandidateListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycler()
    }

    fun setupRecycler() {
        linearLayoutManager = LinearLayoutManager(this)
        candidateListAdapter = CandidateListAdapter()

        candidateRecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = candidateListAdapter
        }
    }
}
