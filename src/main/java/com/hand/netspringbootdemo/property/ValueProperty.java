package com.hand.netspringbootdemo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The type Value property.
 */
@Component
public class ValueProperty {
    @Value("${demo.value-property:}")
    private  String valueProperty;

    /**
     * Gets value property.
     *
     * @return the value property
     */
    public String getValueProperty() {
        return valueProperty;
    }

    /**
     * Sets value property.
     *
     * @param valueProperty the value property
     */
    public void setValueProperty(String valueProperty) {
        this.valueProperty = valueProperty;
    }
}
