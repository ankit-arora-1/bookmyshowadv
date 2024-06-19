package org.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {
    private int amount;
    private String refNumber;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;
}
