package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/16/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private Status status = new StoppedStatus();

    public String display() {
        return status.display();
    }

    public void stepGas() {
        status.stepGas();
    }

    public void gear() {
        status.gear();
    }

    public void fire() {
        status.fire();
    }

}
