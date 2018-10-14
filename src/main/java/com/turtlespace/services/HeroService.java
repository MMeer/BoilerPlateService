package com.turtlespace.services;

import com.turtlespace.assemblers.HeroAssembler;
import com.turtlespace.api.HeroDto;
import com.turtlespace.entities.Hero;
import com.turtlespace.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public HeroDto findHeroByName(String name)
    {
        Hero result = heroRepository.findByName(name);
        return HeroAssembler.assemble(result);
    }
}