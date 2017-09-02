package cn.my.exercise.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    private String address;

    //首先发现没有在每一个属性上添加@Column注解：这个注解是用来映射属性名和数据库字段名的，不加上这个注解，herbinate会自动根据你的属性名进行字段名的定义：testName --->  TEST_NAME

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
