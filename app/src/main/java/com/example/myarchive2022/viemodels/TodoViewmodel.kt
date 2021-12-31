package com.example.myarchive2022.viemodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.myarchive2022.datas.TodoDatabase
import com.example.myarchive2022.datas.TodoEntity
import com.example.myarchive2022.datas.TodoRepository
import kotlinx.coroutines.launch

class TodoViewmodel (application: Application): AndroidViewModel(application) {
    val todoRepository = TodoRepository.getRepository(TodoDatabase.getInstance(application, viewModelScope))
    val allDatas: LiveData<List<TodoEntity>> =todoRepository.allDatas

    fun insertData(todoEntity: TodoEntity) {
        viewModelScope.launch {
            todoRepository.insertData(todoEntity)
        }
    }

    fun updateData(todoEntity: TodoEntity) {
        viewModelScope.launch {
            todoRepository.updateData(todoEntity)
        }
    }

    fun deleteData(todoEntity: TodoEntity) {
        viewModelScope.launch {
            todoRepository.deleteData(todoEntity)
        }
    }
}