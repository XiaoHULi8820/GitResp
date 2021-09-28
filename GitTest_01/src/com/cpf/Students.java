package com.cpf;

/**
 * @Auther: chenpf
 * @Date: 2021/9/28 - 09 - 28 - 17:15
 * @Description: com.cpf
 * @version: 1.0
 */
public class Students {
    private String name;
    private int age;
    private double height;

    public Students(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
