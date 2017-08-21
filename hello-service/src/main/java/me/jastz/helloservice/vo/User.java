package me.jastz.helloservice.vo;

/**
 * Created by zhiwen on 2017/8/21.
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{\"_class\":\"User\", " +
                "\"name\":" + (name == null ? "null" : "\"" + name + "\"") + ", " +
                "\"age\":" + (age == null ? "null" : "\"" + age + "\"") +
                "}";
    }
}
