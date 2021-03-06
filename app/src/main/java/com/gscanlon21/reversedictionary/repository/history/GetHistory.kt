package com.gscanlon21.reversedictionary.repository.history

import androidx.lifecycle.asFlow
import com.gscanlon21.reversedictionary.core.repository.DbBoundResource
import com.gscanlon21.reversedictionary.db.history.HistoryDao
import com.gscanlon21.reversedictionary.db.history.HistoryEntity
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class GetHistory(private val historyDao: HistoryDao) : DbBoundResource<List<HistoryEntity>> {
    override suspend fun loadFromDb() = historyDao.getAll().asFlow()
}
