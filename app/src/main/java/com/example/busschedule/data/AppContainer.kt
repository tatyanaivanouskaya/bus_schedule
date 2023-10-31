package com.example.busschedule.data

import android.content.Context

interface AppContainer {
    val busScheduleRepository: BusScheduleRepository
}
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [-ItemsRepository-]
     */
    override val busScheduleRepository: BusScheduleRepository by lazy {
        OfflineBusSchedule(BusScheduleDatabase.getDatabase(context).busScheduleDao())
    }
}