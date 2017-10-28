package edu.wzm.domain;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class Teacher {

    private int id;
    private String name;
    private String tno;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

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
        StringBuilder sb = new StringBuilder("Teacher[")
                .append("id=" + id)
                .append(", name=" + name)
                .append(", tno=" + tno)
                .append("]");

        return sb.toString();
    }
}
