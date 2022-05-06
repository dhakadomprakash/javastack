package org.example.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/6/2022
 */
@Component("bDart")
public class BlueDart implements Courier {

    public BlueDart() {
        System.out.println("BlueDart 0-param constructor");
    }

    @Override
    public String deliver(String orderId) {
        return "Your order " + orderId + " is assigned to BlueDart";
    }
}
