package com.zeroglitch.spam

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/rest")
public class Test {

    @Produces("application/json")
    @GET
    public String getPageTitle() String title) throws Exception {

        return "{ 'message' :'SUCCESS' }";
    }

    @POST
    public void getPageTitle(@QueryParam("title") String title) throws Exception {

    }

    public static void main(String args[]) throws Exception {
        new Test().setPageTitle("Internal Test of Setting title");
    }

}
