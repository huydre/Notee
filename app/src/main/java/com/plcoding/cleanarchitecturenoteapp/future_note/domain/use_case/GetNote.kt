package com.plcoding.cleanarchitecturenoteapp.future_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.future_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.future_note.domain.repository.NoteRepository
import org.w3c.dom.Node
import java.net.IDN

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int) : Note? {
        return repository.getNoteById(id)
    }
}