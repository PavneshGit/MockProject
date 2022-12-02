package com.ttn.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogAbout {
    @Inject
    private String about;
    @Inject
    private String aboutDesc;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAboutDesc() {
        return aboutDesc;
    }

    public void setAboutDesc(String aboutDesc) {
        this.aboutDesc = aboutDesc;
    }

}
