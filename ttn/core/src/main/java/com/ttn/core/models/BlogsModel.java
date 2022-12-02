package com.ttn.core.models;

import com.ttn.core.services.PublishedBlogs;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogsModel {
    @Inject
    @Named("./blogsItemList")
    private List<BlogsItem> blogsItemList;
    public List<BlogsItem> getBlogsItemList() {
        return blogsItemList;
    }

    @OSGiService
    PublishedBlogs publishedBlogs;
    int numBlogs;
    public int getNumBlogs()
    {
        return publishedBlogs.noOfPages();
    }


}