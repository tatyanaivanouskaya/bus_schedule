package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusSchedule(private val busScheduleDao: BusScheduleDao) : BusScheduleRepository {
    override fun getAllItemsStream(): Flow<List<BusSchedule>>  = busScheduleDao.getAllItems()

    override fun getItemStream(stopName: String): Flow<List<BusSchedule>>  = busScheduleDao.getItem(stopName = stopName)
}