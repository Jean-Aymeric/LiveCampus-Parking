package com.jad;

import com.jad.parking.Parking;
import com.jad.vehicle.Car;
import com.jad.vehicle.Motorbike;
import com.jad.vehicle.Tank;
import com.jad.vehicle.Van;

public class Main {
    public static void main(final String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        Van van = new Van();
        Tank tank = new Tank();

        Parking parking = new Parking();

        parking.addVehicle(car);
        parking.addVehicle(motorbike);
        parking.addVehicle(van);
        parking.addVehicle(tank);
    }
}
