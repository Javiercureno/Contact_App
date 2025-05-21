package com.ebc.contact_app.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ebc.contact_app.dao.ContactDao
import com.ebc.contact_app.entity.Contact

@Database(entities = [Contact::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun contactDao(): ContactDao

}