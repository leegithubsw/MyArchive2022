package com.example.myarchive2022.datas

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.myarchive2022.utils.MDatabaseName
import kotlinx.coroutines.CoroutineScope

@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun todoDao():TodoDao

    companion object {
        @Volatile
        private var instance: TodoDatabase? = null
        fun getInstance(context: Context, scope: CoroutineScope): TodoDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }
        private fun buildDatabase(context: Context):TodoDatabase{
            return Room.databaseBuilder(context, TodoDatabase::class.java, "$MDatabaseName")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                    }
                })
                .build()
        }
    }
}