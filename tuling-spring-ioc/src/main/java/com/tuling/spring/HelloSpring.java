package com.tuling.spring;/**
 * Created by Administrator on 2018/8/22.
 */

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Tommy
 *         Created by Tommy on 2018/8/22
 **/
public class HelloSpring {
    private FineSpring fine;

    public HelloSpring() {

    }

    public HelloSpring(String name, String sex) {
        System.out.println(name);
        System.out.println(sex);
    }

    public HelloSpring(FineSpring fine) {
        this.fine = fine;
    }

    public HelloSpring(FineSpring fine, String abc) {
        this.fine = fine;
    }

    public void sayHello() {
        System.out.println("hi luban ");
    }

    public void init() {

    }

    public void destroy() {

    }

    public static HelloSpring build(String type) {
        if (type.equals("A")) {
            return new HelloSpring("luban", "man");
        } else if (type.equals("B")) {
            return new HelloSpring("diaocan", "woman");
        } else {
            throw new IllegalArgumentException("type must A or B");
        }
    }

    public FineSpring getFine() {
        return fine;
    }

    public void setFine(FineSpring fine) {
        this.fine = fine;
    }
}
