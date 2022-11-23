package com.kreativsoft.awslambdaspringcloudfunction.functions;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

@Component
public class Greeter implements Function<String, String> {
    @Override
    public String apply(String s) {
        return "Hello " + s;
    }
}