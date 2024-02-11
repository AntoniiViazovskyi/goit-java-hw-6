package com.goit.result_clases;

import java.util.Date;

public class YoungestEldestWorker {
    private String type;
    private String name;
    private Date birthday;

    public YoungestEldestWorker(String type, String name, Date birthday) {
        this.type=type;
        this.name = name;
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "YoungestEldestWorker{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
