package com.joy;

import com.joy.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Environment;

public class SampleApplication extends Application<SampleConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleApplication().run(args);
    }

    @Override
    public void run(SampleConfiguration sampleConfiguration, Environment environment) throws Exception {
        JerseyEnvironment jerseyEnvironment = environment.jersey();
        jerseyEnvironment.register(new HelloWorldResource());
    }
}
