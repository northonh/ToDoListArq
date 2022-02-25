package br.edu.ifsp.scl.sdm.pa2.todolistarq.view.adapter

import android.view.*
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsp.scl.sdm.pa2.todolistarq.R
import br.edu.ifsp.scl.sdm.pa2.todolistarq.databinding.ViewTarefaBinding
import br.edu.ifsp.scl.sdm.pa2.todolistarq.model.entity.Tarefa

class TarefasAdapter(private val onTarefaClickListener: OnTarefaClickListener,
                     private val tarefasList: MutableList<Tarefa>): RecyclerView.Adapter<TarefasAdapter.TarefaViewHolder>() {
    class TarefaViewHolder(val viewTarefaBinding: ViewTarefaBinding): RecyclerView.ViewHolder(viewTarefaBinding.root), View.OnCreateContextMenuListener {
        val nomeTv: TextView = viewTarefaBinding.nomeTv
        val realizadaCb: CheckBox = viewTarefaBinding.realizadaCb
        init {
            itemView.setOnCreateContextMenuListener(this)
        }


        override fun onCreateContextMenu(
            contextMenu: ContextMenu?,
            view: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            MenuInflater(view?.context).inflate(R.menu.context_menu_tarefa, contextMenu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder =
        TarefaViewHolder(
            ViewTarefaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = tarefasList[position]
        holder.nomeTv.text = tarefa.nome
        holder.realizadaCb.isChecked = tarefa.realizada != 0

        // onTarefaClickListener
        holder.itemView.setOnClickListener {
            onTarefaClickListener.onTarefaClick(position)
        }
        // Menu de contexto
        holder.itemView.setOnLongClickListener {
            posicao = holder.adapterPosition
            false
        }
    }

    override fun getItemCount(): Int = tarefasList.size

    // Posição a ser recuperada pelo menu de contexto
    var posicao = -1
}