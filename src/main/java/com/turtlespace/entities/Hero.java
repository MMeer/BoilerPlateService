package com.turtlespace.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Accessors (chain=true)
@Entity
@Table(name="HERO")
public class Hero {
    @Id
    @Column (name="id")
    private Long id;

    @Column (name="name")
    private String name;

}
