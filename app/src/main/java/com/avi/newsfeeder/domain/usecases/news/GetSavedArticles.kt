package com.avi.newsfeeder.domain.usecases.news

import com.avi.newsfeeder.data.local.NewsDao
import com.avi.newsfeeder.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}