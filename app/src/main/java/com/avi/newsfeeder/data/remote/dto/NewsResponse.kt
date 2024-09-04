package com.avi.newsfeeder.data.remote.dto

import com.avi.newsfeeder.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
