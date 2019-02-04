package com.example.helloworld.resources;

import com.example.helloworld.api.DataModel;
import com.example.helloworld.api.Saying;
import com.codahale.metrics.annotation.Timed;
import io.dropwizard.jersey.PATCH;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/hi")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "DropWizardPocWithSwagger")
public class HelloWorldResource {




    @GET
    @Timed
    @ApiOperation(value = "Post data and Run code",response = DataModel.class)

//    @Path("/run")
//    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<Saying> sayHello() {
        //final String value = String.format(template, name.orElse(defaultName));
        Saying say=new Saying();

        ArrayList<Saying> s=new ArrayList<Saying>();
//        d.setId1("104");
//        d.setN1("ila");
          s=Saying.addData(s);
        return s;

       // return new Saying(counter.incrementAndGet()*2, value);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public ArrayList<Saying> addData(Saying say4) {

        ArrayList<Saying> s=new ArrayList<>();
        s=Saying.addData(s);
        s=Saying.postData(say4,s);





//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public ArrayList<Saying> addDataPut(Saying say5) {

        ArrayList<Saying> s=new ArrayList<Saying>();
        s=Saying.addData(s);
        s=Saying.putData(say5,s);

//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }
    @DELETE
    @Timed
    public ArrayList<Saying> deleteRow(@QueryParam("id") int id) {
        ArrayList<Saying> s=new ArrayList<Saying>();
        s=Saying.addData(s);
        s=Saying.deleteData(id,s);

        return s;
    }
    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public ArrayList<Saying> addDataPatch(Saying say5) {
        ArrayList<Saying> s=new ArrayList<Saying>();
        s=Saying.addData(s);
        s=Saying.patchData(say5,s);




//        String edited = StudentsDao.edit(student);
//        response.setMessage(edited);
        return s;
    }
}