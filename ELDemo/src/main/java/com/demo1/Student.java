package com.demo1;

/**
 * @ClassName Student
 * @Description TODO
 * @Author hyj98
 * @Date 2022-09-29 9:08
 * @Version 1.0
 */

public class Student {
    private int sid;
    private String sname;
    private String password;

    public Student() {
    }

    public Student(int sid, String sname, String password) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
