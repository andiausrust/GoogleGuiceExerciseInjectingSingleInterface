package com.andi.singleImpl;

// here you tell google Guice how to wire up/binding , factories are created here
// next time you see an Discountable.class bind it to NightOwlDiscount
// has to be instantiated (e.g. main)
public class DiscountGuiceModule extends com.google.inject.AbstractModule{

    @Override
    protected void configure() {
        // no binding code here - instead at Discountable
        // gut with big projects GuiceModule is easier to control
        // bind(Discountable.class).to(NightOwlDiscount.class);
    }
}
