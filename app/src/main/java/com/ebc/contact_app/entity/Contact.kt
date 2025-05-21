package com.ebc.contact_app.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")

data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val phone: String,
)
