package com.gscanlon21.reversedictionary.vm.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gscanlon21.reversedictionary.repository.history.HistoryRepository

/**
 * Factory for creating a [SearchTermViewModel] with a constructor that takes a [HistoryRepository]
 */
class SearchTermViewModelFactory(private val repository: HistoryRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SearchTermViewModel(repository) as T
    }
}
