package com.yash.streamApi;
public class Students {
 
    // member variables
    private int rollNumber;
    private String name;
    private int age;
 
    // constructors
    public Students(int rollId, String name, int age) {
        super();
        this.rollNumber = rollId;
        this.name = name;
        this.age = age;
    }
 
    // getters & setters
    public int getRollId() {
        return rollNumber;
    }
    public void setRollId(int rollId) {
        this.rollNumber = rollId;
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
 
    // toString()
    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber 
                + ", name=" + name 
                + ", age=" + age 
                + "]";
    }
}