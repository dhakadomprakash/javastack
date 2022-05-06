package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/6/2022
 */
@Component("dtdc")
public class DTDC implements Courier {

    public DTDC() {
        System.out.println("DTDC 0-param constructor");
    }

    @Override
    public String deliver(String orderId) {
        return "Your order " + orderId + " is assigned to DTDC";
    }
}
