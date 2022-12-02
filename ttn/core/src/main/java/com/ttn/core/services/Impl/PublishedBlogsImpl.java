package com.ttn.core.services.Impl;


import com.ttn.core.services.PublishedBlogs;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;


@Component(service =  PublishedBlogs.class)
@Designate(ocd = PublishedBlogsConfiguration.class)
public class PublishedBlogsImpl  implements PublishedBlogs
{
    public int  NoOfBlogs;
    @Activate
    public void activate(PublishedBlogsConfiguration config)
    {
        NoOfBlogs= config.No_Of_Blogs();

    }

    @Override
    public int noOfPages() {
        return NoOfBlogs;
    }
}
