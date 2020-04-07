package com.stan.func;

import com.stan.Audi;
import com.stan.Benz;
import com.stan.Car;
import com.stan.Factory;


public class AudiFactory implements Factory {
    public Car getCar(String type) {
        return new Audi();
    }
}
