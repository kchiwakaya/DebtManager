package com.technologyedge.myapplication.model

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DebtDao {

    @Query("SELECT * from debt ORDER BY date ASC")
    fun getAllDebts(): Flow<List<Debt>>

    @Query("SELECT * from debt WHERE id = :id")
    fun getDebt(id: Int): Flow<Debt>

    // Specify the conflict strategy as IGNORE, when the user tries to add an
    // existing Item into the database Room ignores the conflict.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(debt: Debt)

    @Update
    suspend fun update(debt: Debt)

    @Delete
    suspend fun delete(debt: Debt)
}