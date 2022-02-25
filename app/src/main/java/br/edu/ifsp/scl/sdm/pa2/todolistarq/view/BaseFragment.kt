package br.edu.ifsp.scl.sdm.pa2.todolistarq.view

import androidx.fragment.app.Fragment

open class BaseFragment: Fragment() {
    // Constantes para serem usadas para comunicação entre os Fragments
    object Constantes {
        val TAREFA_REQUEST_KEY = "TAREFA_REQUEST_KEY"
        val TAREFA_EXTRA = "TAREFA_EXTRA"
        val ACAO_TAREFA_EXTRA = "ACAO_TAREFA_EXTRA"
        val CONSULTA = 1
    }
}