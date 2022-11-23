package com.kreativsoft.awslambdaspringcloudfunction;

import org.springframework.cglib.core.internal.Function;

public class UppercaseConverter implements Function<String, String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
