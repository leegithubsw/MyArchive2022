package com.example.myarchive2022.datas

class TodoRepository(todoDB:TodoDatabase) {
    private val todoDao = todoDB.todoDao()
    val allDatas = todoDao.getAll()

    companion object {
        private var iRepository: TodoRepository? = null
        fun getRepository(todoDB: TodoDatabase): TodoRepository {
            return iRepository ?: synchronized(this) {
                val instance: TodoRepository = TodoRepository(todoDB)
                iRepository = instance
                instance
            }
        }
    }

    suspend fun insertData(todoEntity: TodoEntity) {
        todoDao.insertData(todoEntity)
    }

    suspend fun updateData(todoEntity: TodoEntity) {
        todoDao.updateData(todoEntity)
    }

    suspend fun deleteData(todoEntity: TodoEntity) {
        todoDao.deleteData(todoEntity)
    }
}