package com.hand.netspringbootdemo.repository;

import com.hand.netspringbootdemo.domain.User2;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The type User 2 repository.
 */
@Repository
public class User2Repository {


    private final ConcurrentMap<Integer,User2> concurrentMap = new ConcurrentHashMap<>();

    private  final static AtomicInteger ATOMIC_INTEGER = new AtomicInteger();


    /**
     * Save boolean.
     *
     * @param user2 the user 2
     * @return the boolean
     */
    public   Boolean save(User2 user2){
        Integer id = ATOMIC_INTEGER.incrementAndGet();
        user2.setId(id);
        return concurrentMap.put(id,user2) == null;
    }

    /**
     * Find all collection.
     *
     * @return the collection
     */
    public Collection<User2> findAll(){
        return concurrentMap.values();
    }

}
