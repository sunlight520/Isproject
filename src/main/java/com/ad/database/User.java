package com.ad.database;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
public class User {
    private int id;
    private Set<Accounts> account;
    private Set<comment> comment;
    private Set<Advertise> advertise;
}