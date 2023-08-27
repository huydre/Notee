package com.plcoding.cleanarchitecturenoteapp.future_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.future_note.domain.repository.NoteRepository

data class NoteUseCase(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
