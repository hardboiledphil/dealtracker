//package org.hardboiled;
//
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//
//@Path("/hello/{id}")
//public class GreetingResource {
//
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello(@PathParam("id") String name) {
//        return "Hello RESTEasy " + name;
//    }
//}