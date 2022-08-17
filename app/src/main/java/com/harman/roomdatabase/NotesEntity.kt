package com.harman.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class NotesEntity {
    @PrimaryKey (autoGenerate = true)
    var id :Int =0
    @ColumnInfo(name = "title") var  title : String ?= null
    @ColumnInfo(name = "description") var  description : String ?= null
    @ColumnInfo(name = "created_date") var  createdDate : String ?= null
}