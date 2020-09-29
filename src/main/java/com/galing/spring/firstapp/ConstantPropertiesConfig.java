package com.galing.spring.firstapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:constants.properties")
})
public class ConstantPropertiesConfig {
}
