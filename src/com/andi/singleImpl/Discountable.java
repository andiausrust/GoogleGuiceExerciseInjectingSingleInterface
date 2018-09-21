package com.andi.singleImpl;

import com.google.inject.ImplementedBy;

// use instead of bind(...).to(...) in DiscountGuiceModule
@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    double getDiscount ();
}