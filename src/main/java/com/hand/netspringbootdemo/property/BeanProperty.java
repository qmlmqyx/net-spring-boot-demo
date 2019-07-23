package com.hand.netspringbootdemo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
public class BeanProperty {


    private String beanProperty;
    private Boolean beanProperties;

    public String getBeanProperty() {
        return beanProperty;
    }

    public void setBeanProperty(String beanProperty) {
        this.beanProperty = beanProperty;
    }

    public Boolean getBeanProperties() {
        return beanProperties;
    }

    public void setBeanProperties(Boolean beanProperties) {
        this.beanProperties = beanProperties;
    }

    @Override
    public String toString() {
        return "BeanProperty{" +
                "beanProperty='" + beanProperty + '\'' +
                ", beanProperties=" + beanProperties +
                '}';
    }
}
