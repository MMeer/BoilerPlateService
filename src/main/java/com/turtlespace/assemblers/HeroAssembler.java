package com.turtlespace.assemblers;

import com.turtlespace.api.HeroDto;
import com.turtlespace.entities.Hero;
import lombok.experimental.UtilityClass;

@UtilityClass

public class HeroAssembler {
    public HeroDto assemble (Hero hero)
    {
        return new HeroDto()
                .setId(hero.getId())
                .setName(hero.getName());
    }

}
