package com.hand.netspringbootdemo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:demo.properties")
public class PropertySourceProperty {
    @Value("${demo.property-source-property:}")
    private String propertySourceProperty;

    public String getPropertySourceProperty() {
        return propertySourceProperty;
    }

    public void setPropertySourceProperty(String propertySourceProperty) {
        this.propertySourceProperty = propertySourceProperty;
    }
}
