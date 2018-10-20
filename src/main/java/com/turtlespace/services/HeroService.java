package com.turtlespace.services;

import com.turtlespace.assemblers.HeroAssembler;
import com.turtlespace.api.HeroDto;
import com.turtlespace.entities.Hero;
import com.turtlespace.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public HeroDto findHeroByName(String name) {
        Hero result = heroRepository.findByName(name);
        return HeroAssembler.assemble(result);
    }

    public List<HeroDto> getAllHeroes() {
        return heroRepository.findAll().stream().map(HeroAssembler::assemble).collect(Collectors.toList());
    }
}