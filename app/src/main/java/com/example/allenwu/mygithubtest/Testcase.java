package com.example.allenwu.mygithubtest;

/**
 * Created by Admin on 2016/5/11.
 */
public class Testcase {
    String name;
    int id;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Testcase(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }
}
