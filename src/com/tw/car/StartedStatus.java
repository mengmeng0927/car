package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/23/13
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartedStatus extends Status {
    public StartedStatus() {
        status = "已启动";
    }

    public Status stepGas() {
        return new IdlingStatus();
    }

    public Status gear() {
        return new GearedStatus();
    }

}
