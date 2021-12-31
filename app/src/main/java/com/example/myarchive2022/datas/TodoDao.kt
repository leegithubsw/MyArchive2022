package com.example.myarchive2022.datas

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Query("select * from lsw_todo order by date_todo desc, time_todo desc ")
    fun getAll(): LiveData<List<TodoEntity>>

    @Insert
    suspend fun insertData(todoEntity: TodoEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateData(todoEntity: TodoEntity)

    @Delete
    suspend fun deleteData(todoEntity: TodoEntity)

    @Query("delete from lsw_todo")
    suspend fun deleteAll()
}