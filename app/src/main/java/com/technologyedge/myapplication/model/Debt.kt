package com.technologyedge.myapplication.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Debt(
    @PrimaryKey
    val id:Int,
    @NonNull
    val debtor_name:String,
    val debt_description:String,
    @NonNull
    val amount:Double,
    val date:Date )