package ru.gb.Spring_HW_6.service;

import ru.gb.Spring_HW_6.model.Note;
import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Long id, Note note);
    Note newNote(Note note);
    void deleteNoteById(Long id);
}
