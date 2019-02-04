package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class DataModel {
    //@JsonProperty

    @JsonProperty

//    private String n1;
//    private String id1;
//    private  String check="checking without adding this in response model in automation";
    public static ArrayList<Saying> sayings=new ArrayList<>();



}
