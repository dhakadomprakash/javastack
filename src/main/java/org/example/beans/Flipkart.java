package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dhakado on 5/6/2022
 */
@Component("flipkart")
public final class Flipkart {
    @Autowired
    @Qualifier("bDart")
    private Courier courier;

    public Flipkart() {
        System.out.println("Flipkart 0-param constructor");
    }

    public void shopping(String[] items, double[] prices) {
        double totalAmount = 0;
        for (double p : prices) {
            totalAmount += p;
        }

        Integer orderId = new Random().nextInt(10000);
        String msg = courier.deliver(orderId.toString());
        System.out.println(Arrays.toString(items) + " items have been ordered having bill amount " + totalAmount + " " + msg);
    }
}
