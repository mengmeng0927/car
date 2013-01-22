package com.tw.test;

import com.tw.car.Car;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 1/16/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CarTest {

    @Test
    public void shouldBeDownWhenGetInCar() {
        Car car = new Car();
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeDownWhenDownAndStepGas() {
        Car car = new Car();
        car.stepGas();
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeDownWhenDownAndGear() {
        Car car = new Car();
        car.gear();
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeFiredWhenFire() {
        Car car = new Car();
        car.fire();
        assertEquals(car.display(), "已启动");
    }

    @Test
    public void shouldBeGearedWhenFireAndGear() {
        Car car = new Car();
        car.fire();
        car.gear();
        assertEquals(car.display(), "已挂档");
    }

    @Test
    public void shouldBeIdlyWhenFireAndStepGas() {
        Car car = new Car();
        car.fire();
        car.stepGas();
        assertEquals(car.display(), "已空转");
    }

    @Test
    public void shouldBeMovedWhenFireAndGearAndStepGas() {
        Car car = new Car();
        car.fire();
        car.gear();
        car.stepGas();
        assertEquals(car.display(), "已开始移动");
    }
}
