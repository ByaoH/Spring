package com.l.demo02;

public class UserServiceImpl implements UserService{

    public void add() {
        System.out.println("add() ---> add 了一个用户");
    }

    public void delete() {
        System.out.println("delete() ---> delete 了一个用户");
    }

    public void update() {
        System.out.println("update() ---> update 了一个用户");
    }

    public void query() {
        System.out.println("query() ---> query 了一个用户");
    }
}
