package org.example.test;

import org.example.beans.Flipkart;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhakado on 5/6/2022
 */
public class StereoAnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Flipkart flipkart = context.getBean("flipkart", Flipkart.class);

        flipkart.shopping(new String[]{"jeans", "tshirt", "shirt"}, new double[]{2999, 599, 799});
    }
}
