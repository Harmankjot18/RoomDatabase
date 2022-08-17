package com.harman.roomdatabase
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NotesAdapter(var notesEntity: ArrayList<NotesEntity>, var recyclerClick: RecyclerClick): RecyclerView.Adapter<NotesAdapter.ViewHolder>(){
    class ViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        var title = view.findViewById<TextView>(R.id.tvTitle)
        var desc = view.findViewById<TextView>(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.layout_notes_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesAdapter.ViewHolder, position: Int) {
        holder.title.setText(notesEntity[position].title)
        holder.desc.setText(notesEntity[position].description)
        holder.view.setOnClickListener {
            recyclerClick.notesClicked(notesEntity[position])
        }
    }

    override fun getItemCount(): Int {
        return notesEntity.size
    }
}