package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/23/13
 * Time: 9:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Status {
    protected String status = "已熄火";
    
    public void stepGas() {
        if (status == "已熄火") {
            return;
        }

        if (status == "已启动") {
            status = "已空转";
        }

        if (status == "已挂档") {
            status = "已开始移动";
        }
    }

    public void gear() {
        if (status == "已熄火") {
            return;
        }
        if (status == "已启动") {
            status = "已挂档";
        }
    }

    public void fire() {
        status = "已启动";
    }

    public String display() {
        return status;
    }
}
