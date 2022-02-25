package br.edu.ifsp.scl.sdm.pa2.todolistarq.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.ifsp.scl.sdm.pa2.todolistarq.model.dao.TarefaDao
import br.edu.ifsp.scl.sdm.pa2.todolistarq.model.entity.Tarefa

@Database(entities = arrayOf(Tarefa::class), version = 1)
abstract class ToDoListArqDatabase: RoomDatabase() {
    object Constantes {
        val DB_NAME = "to_do_list_arq_database"
    }
    abstract fun getTarefaDao(): TarefaDao
}