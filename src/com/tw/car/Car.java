package com.tw.car;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/16/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private String m_status = "已熄火";

    public String display() {
        return m_status;
    }

    public void stepGas() {
        if (m_status == "已熄火") {
            return;
        }

        if (m_status == "已启动") {
            m_status = "已空转";
        }

        if (m_status == "已挂档") {
            m_status = "已开始移动";
        }
    }

    public void gear() {
        if (m_status == "已熄火") {
            return;
        }
        if (m_status == "已启动") {
            m_status = "已挂档";
        }
    }

    public void fire() {
        m_status = "已启动";
    }


}
