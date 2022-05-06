package org.example.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/6/2022
 */
@Component("fFlight")
public class FirstFlight implements Courier {

    public FirstFlight() {
        System.out.println("FirstFlight 0-param constructor");
    }

    @Override
    public String deliver(String orderId) {
        return "Your order " + orderId + " is assigned to FirstFlight";
    }
}
