package com.tedu.pojo;

public class User {
    private Integer id;
    private String userName;
    private String passWord;

    @Override
    public String toString() {
        //这是一条测试注释
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + passWord + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }
}
