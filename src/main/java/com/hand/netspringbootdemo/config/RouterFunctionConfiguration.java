package com.hand.netspringbootdemo.config;

import com.hand.netspringbootdemo.domain.User2;
import com.hand.netspringbootdemo.repository.User2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

/**
 * The type Router function configuration.
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     * Person find all router function.
     *
     * flux是0~n个集合 ， mono 是0~1个集合
     *
     * react中的flux 和 mono  都是异步操作的
     *
     * flux and mono both publisher(发布器)
     *
     * @param user2Repository the user 2 repository
     * @return the router function
     */
    @Autowired
    @Bean
    public RouterFunction<ServerResponse> personFindAll(User2Repository user2Repository){
        Collection<User2> user2s = user2Repository.findAll();
        return  RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request->{
                    Mono<ServerResponse> serverResponseMono = null;
                    Flux<User2> flux = Flux.fromIterable(user2s);
                    return ServerResponse.ok().body(flux,User2.class);
                });
    }
}
