package com.harman.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NotesDao {
    @Insert
    fun insertNotes (vararg notesEntity: NotesEntity)
    @Query ("select * from NotesEntity")
    fun getNotes():List<NotesEntity>
    @Delete
    fun delete (vararg notesEntity: NotesEntity)
}