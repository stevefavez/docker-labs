package org.docker.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Steve Favez on 14.04.2016.
 * Yet another Hello world restfull service implementation. Just a "GET" returning a plain hello world message.
 *
 */
@Path("/sayhello")
public class YahwRs {

    private final static Logger LOGGER = LoggerFactory.getLogger(YahwRs.class) ;

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String sayHelloWorldPlease() {
        final String yahwMessage = "Hello world from a restful service deployed in wildfy, in docker and eventually, in  virtualbox aftera hot swap" ;
        LOGGER.info( yahwMessage );
        return yahwMessage ;
    }

}
