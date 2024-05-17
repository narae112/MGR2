package com.MGR.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 10)
    private String condition;
//    boolean condition;
//pull test 2
    //pull test 4
    @Column(columnDefinition = "TEXT")
    private String information;

    //test 0928
//test 0927
    //나래 0202
    //나래 0214
    //나래 0255
    //나래 0218
    //나래 0244
    //나래 0315

    // 혜원 0324
    // 혜원 0337
    // 혜원 0358

    //나래 0405

    //나래 0318
    //나래 0330
    //나래 0357
    // test 0419
    // test 0425

}
// test 혜원 0226

//test 평강 0313

