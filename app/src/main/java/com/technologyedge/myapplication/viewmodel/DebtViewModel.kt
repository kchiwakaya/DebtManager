package com.technologyedge.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.technologyedge.myapplication.model.Debt
import com.technologyedge.myapplication.model.DebtDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class DebtViewModel(private val debtDao: DebtDao):ViewModel() {

    fun getDebts(): Flow<List<Debt>> = debtDao.getAllDebts()



    // Cache all items form the database using LiveData.
   // val allItems: LiveData<List<Debt>> = debtDao.getAllDebts().asLiveData()


    /**
     * Launching a new coroutine to update an item in a non-blocking way
     */
    private fun updateItem(debt: Debt) {
        viewModelScope.launch {
            debtDao.update(debt)
        }
    }




    /**
     * Launching a new coroutine to insert an item in a non-blocking way
     */
    private fun insertItem(debt: Debt) {
        viewModelScope.launch {
            debtDao.insert(debt)
        }
    }

    /**
     * Launching a new coroutine to delete an item in a non-blocking way
     */
    fun deleteItem(debt: Debt) {
        viewModelScope.launch {
            debtDao.delete(debt)
        }
    }

    /**
     * Retrieve an item from the repository.
     */
   /* fun retrieveItem(id: Int): LiveData<Debt> {
        return debtDao.getDebt(id).as
    }*/


    }
