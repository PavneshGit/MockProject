package com.ttn.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeHeader {
    @Inject
    private String text;
    @Inject
    private String home;
    @Inject
    private String publishedBlogs;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHome() {return home;}

    public void setHome(String home) {this.home = home;}

    public String getPublishedBlogs() {return publishedBlogs;}

    public void setPublishedBlogs(String publishedBlogs) {this.publishedBlogs = publishedBlogs;}

}
