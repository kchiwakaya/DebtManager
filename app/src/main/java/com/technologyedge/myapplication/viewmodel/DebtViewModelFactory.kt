package com.technologyedge.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.technologyedge.myapplication.model.DebtDao

class DebtViewModelFactory(
    private val debtDao: DebtDao
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       if(modelClass.isAssignableFrom(DebtViewModel::class.java)){
          @Suppress("UNCHECKED_CAST")
           return DebtViewModel(debtDao) as T
       }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}