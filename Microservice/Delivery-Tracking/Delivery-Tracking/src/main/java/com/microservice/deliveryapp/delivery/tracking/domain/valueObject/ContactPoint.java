package com.microservice.deliveryapp.delivery.tracking.domain.valueObject;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ContactPoint {
    private String zipCode;
    private String street;
    private String number;
    private String complement;
    private String name;
    private String phone;
}
