package com.serlongfellow.android.airporthangout

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.serlongfellow.android.airporthangout.IntentExtras.Companion.INTENT_EXTRA_CANDIDATE_ID
import kotlinx.android.synthetic.main.line_view_meetup_candidates.view.*

class CandidateLineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var candidateId : Int = -1
    val profilePictureImageView : ImageView = itemView.profilePictureImageView
    val nameLabel : TextView = itemView.nameLabel
    val originLocationLabel : TextView = itemView.originLocationLabel
    val occupationLabel : TextView = itemView.occupationLabel

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(BaseApplication.instance, CandidateDetailActivity::class.java).apply {
            putExtra(INTENT_EXTRA_CANDIDATE_ID, candidateId)
        }

        BaseApplication.instance.startActivity(intent)
    }

}