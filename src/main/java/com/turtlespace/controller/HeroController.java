package com.turtlespace.controller;

import com.turtlespace.services.HeroService;
import com.turtlespace.api.HeroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

//    @GetMapping
//    public List<HeroDto> getHeroes(){
//        return heroService.getHeroList();
//    }

    @GetMapping("/search")
    public HeroDto findByName(@RequestParam("name") String name){
        return heroService.findHeroByName(name);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

}