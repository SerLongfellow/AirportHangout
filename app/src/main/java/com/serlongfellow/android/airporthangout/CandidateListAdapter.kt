package com.serlongfellow.android.airporthangout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.serlongfellow.android.airporthangout.providers.CandidateListProvider

class CandidateListAdapter(candidateListProvider: CandidateListProvider) : RecyclerView.Adapter<CandidateLineViewHolder>() {

    private var candidates = candidateListProvider.fetchCandidateList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidateLineViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.line_view_meetup_candidates, parent, false)

        return CandidateLineViewHolder(view)
    }

    override fun getItemCount(): Int {
        return candidates.size
    }

    override fun onBindViewHolder(holder: CandidateLineViewHolder, position: Int) {
        val candidate = candidates[position]

        holder.candidateId = candidate.id
        holder.profilePictureImageView.setImageBitmap(candidate.profileImage)
        holder.nameLabel.text = candidate.name
        holder.occupationLabel.text = candidate.occupation
        holder.originLocationLabel.text = candidate.originLocation
    }
}