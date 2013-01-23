package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/23/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class GearedStatus extends Status {
    public GearedStatus() {
        status = "已挂档";
    }

    public Status stepGas() {
        return new MovedStatus();
    }
}
