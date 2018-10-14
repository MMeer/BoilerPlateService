package com.turtlespace.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Accessors (chain=true)
@Entity
@Table(name="Hero")
public class Hero {
    @Id
    @Column (name="id")
    private Long id;

    @Column (name="name")
    private String name;

}
