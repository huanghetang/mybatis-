package com.ssm.test.model;

public class user {
    private Integer userid;

    private String username;

    private String password;

    private String perminssion;

    public user(Integer userid, String username, String password, String perminssion) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.perminssion = perminssion;
    }

    public user() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPerminssion() {
        return perminssion;
    }

    public void setPerminssion(String perminssion) {
        this.perminssion = perminssion == null ? null : perminssion.trim();
    }
}