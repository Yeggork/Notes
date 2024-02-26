package com.example.notes;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Notes> notesList;

    public NoteAdapter(Context context,List<Notes> notesList){
        this.notesList = notesList;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_note,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder holder, int position) {
        Notes note = notesList.get(0);
        holder.text.setText(note.getText());
        holder.title.setText(note.getTitle());

    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, text;
        ImageView change, delete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.textViewNoteTitle);
            title = itemView.findViewById(R.id.textViewNoteText);
            change = itemView.findViewById(R.id.imageViewNotesChange);
            delete = itemView.findViewById(R.id.imageViewNotesDelete);
        }
    }
}
