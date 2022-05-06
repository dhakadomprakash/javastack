package org.example.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/6/2022
 */
@Component("dhl")
public class DHL implements Courier {

    public DHL() {
        System.out.println("DHL 0-param constructor");
    }

    @Override
    public String deliver(String orderId) {
        return "Your order " + orderId + " is assigned to DHL";
    }
}
