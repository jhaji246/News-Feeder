package com.avi.newsfeeder.presentation.bookmark

import com.avi.newsfeeder.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)
