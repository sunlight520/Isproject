package com.ad.database;

import lombok.Data;

import java.util.Set;

@Data
public class housing {
    private int id;
    private Integer price;
    private String description;
    private String address;
//    private Advertise advertise;
    private Set<Advertise> advertises;
}
