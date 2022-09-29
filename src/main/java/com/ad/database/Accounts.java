package com.ad.database;
import lombok.Data;
@Data
public class Accounts {
    private int id;
    private String username;
    private String password;
    private Integer authoritylevel;
    private Integer userid;
    private User user;
}
