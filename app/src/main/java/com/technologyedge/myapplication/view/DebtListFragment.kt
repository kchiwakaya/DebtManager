package com.technologyedge.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.technologyedge.myapplication.databinding.DebtListBinding
import com.technologyedge.myapplication.model.DebtApplication
import com.technologyedge.myapplication.viewmodel.DebtViewModel
import com.technologyedge.myapplication.viewmodel.DebtViewModelFactory

class DebtListFragment: Fragment() {
/*    private val viewModel: DebtViewModel by activityViewModels {
        DebtViewModelFactory
            (activity?.application as DebtApplication).database.debtDao()
        )
    }*/
//private val viewModel1: DebtViewModel by activityViewModels {
//    DebtViewModelFactory(activity?.application as DebtApplication).
//}
    private var _binding: DebtListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DebtListBinding.inflate(inflater, container, false)
        return binding.root
    }

/*    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = DebtAdapter {
            val action =
                ItemListFragmentDirections.actionItemListFragmentToItemDetailFragment(it.id)
            this.findNavController().navigate(action)
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerView.adapter = adapter
        // Attach an observer on the allItems list to update the UI automatically when the data
        // changes.
        viewModel.allItems.observe(this.viewLifecycleOwner) { items ->
            items.let {
                adapter.submitList(it)
            }
        }*/

      /*  binding.floatingActionButton.setOnClickListener {
            val action = ItemListFragmentDirections.actionItemListFragmentToAddItemFragment(
                getString(R.string.add_fragment_title)
            )
            this.findNavController().navigate(action)
        }*/
    }
//}