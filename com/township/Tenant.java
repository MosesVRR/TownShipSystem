package com.township;

import java.util.List;

class Tenant extends User {
    private Property property;
    private List<RentReceipt> receipts;

    public Tenant(String name) {
        super(name);
    }

    public void generateReceipt() {
        // Implementation
    }

    public void payReceipt() {
        // Implementation
    }

    public RentReceipt getReceipt(String id) {
        // Implementation
        return null;
    }
}
