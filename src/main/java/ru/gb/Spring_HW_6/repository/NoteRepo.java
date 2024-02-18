package ru.gb.Spring_HW_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.Spring_HW_6.model.Note;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
}
