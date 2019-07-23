package com.hand.netspringbootdemo.web;

import com.hand.netspringbootdemo.domain.User2;
import com.hand.netspringbootdemo.repository.User2Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * The type User 2 controller.
 */
@RestController
@RequestMapping("/person")
public class User2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(User2Controller.class);

    private  final User2Repository user2Repository;

    /**
     * Instantiates a new User 2 controller.
     *
     * @param user2Repository the user 2 repository
     */
    @Autowired
    public User2Controller(User2Repository user2Repository){
        this.user2Repository = user2Repository;
    }

    /**
     * Save user 2.
     *
     * @param name the name
     * @return the user 2
     */
    @RequestMapping("/save")
    public User2 save(@RequestParam String name){
        User2 user2 = new User2();

        user2.setName(name);

        if(!user2Repository.save(user2)){
            LOGGER.info("保存失败:{}",user2.toString());
        }

        LOGGER.info("保存成功: {}",user2.toString());

        return  user2;

    }

    @RequestMapping("/find/all")
    public Collection<User2> findAll(){
        return  user2Repository.findAll();
    }


}
