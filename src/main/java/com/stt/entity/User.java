package com.stt.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by taotaosun on 2017/4/26.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    private static final long serialVersionUID = -1L;

    private Long id;
    private String name;
    private Integer age;
    private Integer sex;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = true, length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age", nullable = true, length = 3)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "sex", nullable = true, length = 1)
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
