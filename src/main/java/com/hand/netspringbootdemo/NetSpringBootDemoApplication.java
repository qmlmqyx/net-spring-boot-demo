package com.hand.netspringbootdemo;

import com.hand.netspringbootdemo.property.BeanProperty;
import com.hand.netspringbootdemo.property.PropertySourceProperty;
import com.hand.netspringbootdemo.property.ValueProperty;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * The type Net spring boot demo application.
 */
@SpringBootApplication
public class NetSpringBootDemoApplication {

    //日志输出，修改大小写提示 sensitive -> none
    private static final Logger logger = LoggerFactory.getLogger(NetSpringBootDemoApplication.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

       ApplicationContext applicationContext = SpringApplication.run(NetSpringBootDemoApplication.class, args);

/*       //1.@Value
        ValueProperty valueProperty = applicationContext.getBean(ValueProperty.class);
        logger.info("@Value:{}",valueProperty.getValueProperty());

        //2.@ConfigurationProperties
        BeanProperty beanProperty = applicationContext.getBean(BeanProperty.class);
        logger.info("@ConfigurationProperties:{}",beanProperty.toString());

        //3.@PropertySource
        PropertySourceProperty propertySourceProperty = applicationContext.getBean(PropertySourceProperty.class);
        logger.info("@PropertySource:{}",propertySourceProperty.getPropertySourceProperty());*/
    }

}
