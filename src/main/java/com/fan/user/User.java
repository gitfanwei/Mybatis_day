package com.fan.user;

public class User {
    //四步 创建实体类和要查询的数据库表的字段一样
    private String name;
    private String age;
    private int id;
    private String ai;

    public User() {
    }

    public User(String name, String age, int id, String ai) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.ai = ai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                ", ai='" + ai + '\'' +
                '}';
    }
}
