package com.example.ideanotes.listeners;

import com.example.ideanotes.entities.Note;

public interface NotesListener {

    void onNoteClicked(Note note, int position);

}
