package com.example.webdemo.domain;

//import java.io.Serializable;

/**
 * person ʵ�� POJO��
 */
public class Person //implements Serializable 
{
	//serialVersionUID
	//private static final long serialVersionUID = 4066575787097231411L;
	
	private int id;
    private String name;
    private int age;
    
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}