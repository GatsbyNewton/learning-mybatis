package edu.wzm.mybatis.domain;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class Teacher {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + "]";
    }
}
