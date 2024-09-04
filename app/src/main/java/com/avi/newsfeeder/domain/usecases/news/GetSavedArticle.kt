package com.avi.newsfeeder.domain.usecases.news

import com.avi.newsfeeder.data.local.NewsDao
import com.avi.newsfeeder.domain.model.Article
import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}