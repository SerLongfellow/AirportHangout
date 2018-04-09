package com.serlongfellow.android.airporthangout

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.meetup_candidates_line_view.view.*

class CandidateLineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val profilePictureImageView : ImageView = itemView.profilePictureImageView
    val originLocationLabel : TextView = itemView.originLocationLabel
    val occupationLabel : TextView = itemView.occupationLabel

}