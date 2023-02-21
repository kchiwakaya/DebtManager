package com.technologyedge.myapplication.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.technologyedge.myapplication.databinding.DebtListBinding
import com.technologyedge.myapplication.model.Debt

class DebtAdapter(private val onItemClicked:(Debt)-> Unit):ListAdapter<Debt,DebtAdapter.DebtViewHolder>(
    DiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DebtViewHolder {
        val viewHolder = DebtViewHolder(
            DebtListBinding.inflate(
                LayoutInflater.from( parent.context),
                parent,
                false
            )
        )
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            onItemClicked(getItem(position))
        }
        return viewHolder
    }
    override fun onBindViewHolder(holder: DebtViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class DebtViewHolder(private var binding: DebtListBinding): RecyclerView.ViewHolder(binding.root)
    {

        fun bind(debt: Debt) {
            binding.txtName.text = debt.debtor_name
            binding.txtAmount.text= debt.amount.toString()
            binding.txtDateDue.text = debt.date.toString()
        }
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Debt>() {
            override fun areItemsTheSame(oldItem: Debt, newItem: Debt): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Debt, newItem: Debt): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }




}