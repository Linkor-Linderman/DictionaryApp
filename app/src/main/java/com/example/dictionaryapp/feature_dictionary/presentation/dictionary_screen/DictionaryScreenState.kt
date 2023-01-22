package com.example.dictionaryapp.feature_dictionary.presentation.dictionary_screen

import com.example.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class DictionaryScreenState(
    val wordInfoList: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
