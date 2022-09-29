package com.ad.database;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
public class comment {
    private int id;
    private Integer userid;
    private String content;
    private Timestamp time;
    private Integer advertiseid;
    private User user;

}
