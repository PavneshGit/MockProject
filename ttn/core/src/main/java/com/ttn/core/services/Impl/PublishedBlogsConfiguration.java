package com.ttn.core.services.Impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Published Blogs Configuration")

public @interface PublishedBlogsConfiguration
{
    @AttributeDefinition(
            name = "No Of Published Blogs",
            description = "Enter No Of Published Blogs",
            type=AttributeType.INTEGER)
    int  No_Of_Blogs() default 1;

}

