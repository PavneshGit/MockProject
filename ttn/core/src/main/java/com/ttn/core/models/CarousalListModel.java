package com.ttn.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarousalListModel {
    @Inject
    @Named("./bannerList")
    private List<BannerItem>  bannerList;
    public List<BannerItem> getBannerList() {
        return bannerList;
    }
}
