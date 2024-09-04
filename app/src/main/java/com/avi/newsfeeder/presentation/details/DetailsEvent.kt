package com.avi.newsfeeder.presentation.details

import com.avi.newsfeeder.domain.model.Article

sealed class DetailsEvent {
    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()

    object RemoveSideEffect : DetailsEvent()

}
