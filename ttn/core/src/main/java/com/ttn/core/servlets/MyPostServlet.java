package com.ttn.core.servlets;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import static com.sun.java.util.jar.pack.DriverResource.resource;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="mynode/comment",
        methods=HttpConstants.METHOD_GET,
        extensions="txt")
@ServiceDescription("Simple Demo Servlet")
public class MyPostServlet extends SlingAllMethodsServlet {

    private static final long serialVersionUID = -159625176093879129L;

    private static final Logger log = LoggerFactory.getLogger(MyPostServlet.class);

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) {

        try {
            ResourceResolver resourceResolver = request.getResourceResolver();
            Resource resource = resourceResolver.getResource("/content");

            Node node = resource.adaptTo(Node.class);
            Node newNode = node.addNode("demoNodePavnesh", "nt:unstructured");
            newNode.setProperty("name", "Demo Node Pavnesh");

            resourceResolver.commit();

        } catch (PersistenceException | RepositoryException e) {

            log.error(e.getMessage(), e);

            e.printStackTrace();
        }
    }
}


//Resource resource2 = resourceResolver.getResource("/content");
//Node node2 = resource2.adaptTo(Node.class);

//Node n2 = node2.getNode("/apps/Bootcamp/components/Comment");
//n2.setProperty("Name","Pavnesh Singh");

//node2.setProperty("Name", "Pavnesh Singh");
//node2.getSession().save();

// ModifiableValueMap map = resource2.adaptTo(ModifiableValueMap.class);
// map.put("Name", "Pavnesh Singh");
// resource2.getResourceResolver().commit();
