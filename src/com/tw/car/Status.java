package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/23/13
 * Time: 9:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Status {
    protected String status;
    
    public Status stepGas() {
        return this;
    }

    public Status gear() {
        return this;
    }

    public Status fire() {
        return this;
    }

    public String display() {
        return status;
    }
}
