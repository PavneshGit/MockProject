package com.ttn.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogsItem {
    @Inject
    private String blogsMainHeading;
    @Inject
    private String featuredPost;
    @Inject
    private String postDate;
    @Inject
    private String postDesc;
    @Inject
    private String continueReading;
    @Inject
    private String thumbnailBlogs;
    public String getBlogsMainHeading() {
        return blogsMainHeading;
    }

    public void setBlogsMainHeading(String blogsMainHeading) {
        this.blogsMainHeading = blogsMainHeading;
    }

    public String getFeaturedPost() {
        return featuredPost;
    }

    public void setFeaturedPost(String featuredPost) {
        this.featuredPost = featuredPost;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public String getContinueReading() {
        return continueReading;
    }

    public void setContinueReading(String continueReading) {
        this.continueReading = continueReading;
    }

    public String getThumbnailBlogs() {
        return thumbnailBlogs;
    }

    public void setThumbnailBlogs(String thumbnailBlogs) {
        this.thumbnailBlogs = thumbnailBlogs;
    }



}
