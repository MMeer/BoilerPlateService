package com.turtlespace.api;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class HeroDto {

    private Long id;
    private String name;
}
