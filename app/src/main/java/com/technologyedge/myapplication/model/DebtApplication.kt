package com.technologyedge.myapplication.model

import android.app.Application

class DebtApplication:Application() {
    val database:AppDatabase by lazy {AppDatabase.getDatabase(this)}
}