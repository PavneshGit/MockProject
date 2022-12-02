package com.ttn.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogHeading {

    @Inject
    private String sampleBlogPost;

    @Inject
    private String blogPostDate;
    @Inject
    private String blogPostBy;
    public String getSampleBlogPost() {
        return sampleBlogPost;
    }

    public void setSampleBlogPost(String sampleBlogPost) {
        this.sampleBlogPost = sampleBlogPost;
    }

    public String getBlogPostDate() {
        return blogPostDate;
    }

    public void setBlogPostDate(String blogPostDate) {
        this.blogPostDate = blogPostDate;
    }

    public String getBlogPostBy() {
        return blogPostBy;
    }

    public void setBlogPostBy(String blogPostBy) {
        this.blogPostBy = blogPostBy;
    }





}
