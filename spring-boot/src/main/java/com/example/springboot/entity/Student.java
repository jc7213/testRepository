package com.example.springboot.entity;

import java.io.Serializable;

public class Student  implements Serializable {
    private String sname;
    private int sid;
    private int sage;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", sage=" + sage +
                '}';
    }
}
