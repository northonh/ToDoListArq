package br.edu.ifsp.scl.sdm.pa2.todolistarq.model.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Tarefa (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @NonNull
    var nome: String,
    @NonNull
    var realizada: Int = 0
): Parcelable
