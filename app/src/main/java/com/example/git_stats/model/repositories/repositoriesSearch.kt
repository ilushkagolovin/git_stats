package com.example.git_stats.model.repositories

data class repositoriesSearch(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)