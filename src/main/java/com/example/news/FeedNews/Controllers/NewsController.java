package com.example.news.FeedNews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;

@Controller
public class NewsController {
    @GetMapping("/news")
    public String News( Model model) {
//        Iterable<NewsPost> ICollectionNews=repository.findAll();
//        ArrayList<NewsPost> arrayListNews=new ArrayList<>();
//        for (NewsPost item:ICollectionNews) {
//            arrayListNews.add(item);
//        }
//        Collections.reverse(arrayListNews);
//        model.addAttribute("News",arrayListNews);
        return "news";
    }
    @GetMapping("/addnews")
    public String addnews( Model model) {
//        Iterable<NewsPost> ICollectionNews=repository.findAll();
//        ArrayList<NewsPost> arrayListNews=new ArrayList<>();
//        for (NewsPost item:ICollectionNews) {
//            arrayListNews.add(item);
//        }
//        Collections.reverse(arrayListNews);
//        model.addAttribute("News",arrayListNews);
        return "addnews";
    }
    @GetMapping("/about")
    public String about( Model model) {
        return "about";
    }
}
