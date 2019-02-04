package com.example.helloworld;

import com.example.helloworld.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);

    }
    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(io.dropwizard.setup.Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<HelloWorldConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(HelloWorldConfiguration configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });
    }

    @Override
    public void run(HelloWorldConfiguration configuration, io.dropwizard.setup.Environment environment) throws Exception {

        environment.jersey().register(new HelloWorldResource());
        environment.jersey().register(MultiPartFeature.class);

    }



    }
