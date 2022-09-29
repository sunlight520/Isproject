package com.ad.database;

import lombok.Data;

import java.util.Set;

@Data
public class Advertise {
    private Integer id;
    private Integer housingid;
    private Integer userid;
    private Set<comment> comment;
    private Set<housing> housings;
    private User User;
}
