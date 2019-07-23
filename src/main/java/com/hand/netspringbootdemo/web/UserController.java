package com.hand.netspringbootdemo.web;

import com.hand.netspringbootdemo.entity.User;
import com.hand.netspringbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type User controller.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    /**
     * Instantiates a new User controller.
     *
     * @param userRepository the user repository
     */
    @Autowired
    public  UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     * List list.
     *
     * @return the list
     */
    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }

    /**
     * Query user.
     *
     * @param id the id
     * @return the user
     */
    @GetMapping("/{id}")
    public User query(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    /**
     * Create user.
     *
     * @param user          the user
     * @param bindingResult the binding result
     * @return the user
     */
    @PostMapping
    public  User create(@RequestBody @Validated User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new IllegalArgumentException(bindingResult.toString());
        }
        return userRepository.save(user);
    }

    /**
     * Update user.
     *
     * @param user the user
     * @return the user
     */
    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }

    @GetMapping("/self/{name}")
    public List<User> findAllByNameOrderByAge(@PathVariable String name){
       return  userRepository.findAllByNameOrderByAge(name);
    }

}
