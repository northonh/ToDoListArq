package br.edu.ifsp.scl.sdm.pa2.todolistarq.model.dao

import androidx.room.*
import br.edu.ifsp.scl.sdm.pa2.todolistarq.model.entity.Tarefa

@Dao
interface TarefaDao {
    @Insert
    fun inserirTarefa(tarefa: Tarefa): Long

    @Delete
    fun removerTarefa(tarefa: Tarefa)

    @Delete
    fun removerTarefas(vararg tarefa: Tarefa)

    @Update
    fun atualizarTarefa(tarefa: Tarefa)

    @Query( "SELECT * FROM tarefa")
    fun recuperarTarefas(): List<Tarefa>

    @Query( "SELECT * FROM tarefa WHERE id = :tarefaId")
    fun recuperaTarefa(tarefaId: Int): Tarefa
}