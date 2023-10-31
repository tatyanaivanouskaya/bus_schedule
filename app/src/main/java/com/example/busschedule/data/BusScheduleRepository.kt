package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface BusScheduleRepository {

    fun getAllItemsStream(): Flow<List<BusSchedule>>


    fun getItemStream(stopName: String): Flow<List<BusSchedule>>
}