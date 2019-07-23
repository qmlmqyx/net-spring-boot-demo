package com.hand.netspringbootdemo.repository;

import com.hand.netspringbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * The interface User repository.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * Find all by name order by age list.
     *
     * @param name the name
     * @return the list
     */
    List<User> findAllByNameOrderByAge(String name);
}
