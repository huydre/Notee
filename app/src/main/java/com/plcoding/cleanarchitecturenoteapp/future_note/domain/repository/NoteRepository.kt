package com.plcoding.cleanarchitecturenoteapp.future_note.domain.repository

import com.plcoding.cleanarchitecturenoteapp.future_note.domain.model.Note
import java.net.IDN
import java.util.concurrent.Flow

interface NoteRepository {
    fun getNote(): kotlinx.coroutines.flow.Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}