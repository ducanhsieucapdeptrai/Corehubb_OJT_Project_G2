package com.example.computershop.enums;

import lombok.Getter;

@Getter
public enum Role {
    Admin("Admin"),
    ADMIN("Admin"), // Backward compatibility
    Customer("Customer"),
    CUSTOMER("CUSTOMER"), // For uppercase conversion
    Shipper("Shipper"),
    SHIPPER("SHIPPER"), // For uppercase conversion
    Sales("Sales"),
    SALES("Sales"); // For uppercase conversion

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

} 