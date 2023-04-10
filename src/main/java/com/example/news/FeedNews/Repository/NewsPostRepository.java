package com.example.news.FeedNews.Repository;

import com.example.news.FeedNews.Models.NewsPost;
import org.springframework.data.repository.CrudRepository;

public interface NewsPostRepository extends CrudRepository<NewsPost,Long> {
}
