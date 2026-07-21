package com.example.a;

/**
 * Deliberately shipped WITHOUT unit tests so the JaCoCo report shows uncovered
 * (red) lines and partially covered (yellow) branches.
 */
public class DiscountEngine {

    public double applyDiscount(double price, int quantity, boolean loyaltyMember) {
        double discount = 0.0;
        if (quantity >= 100) {
            discount = 0.20;
        } else if (quantity >= 10) {
            discount = 0.10;
        } else if (quantity >= 5) {
            discount = 0.05;
        }
        if (loyaltyMember) {
            discount += 0.05;
        }
        if (discount > 0.25) {
            discount = 0.25;
        }
        return price * (1 - discount);
    }

    public String tier(double totalSpend) {
        if (totalSpend >= 10_000) {
            return "PLATINUM";
        } else if (totalSpend >= 1_000) {
            return "GOLD";
        } else if (totalSpend > 0) {
            return "SILVER";
        }
        return "NONE";
    }

    public boolean isEligibleForFreeShipping(double orderTotal, boolean loyaltyMember) {
        if (loyaltyMember) {
            return orderTotal >= 25.0;
        }
        return orderTotal >= 50.0;
    }
}
