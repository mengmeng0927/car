package com.tw.test;

import com.tw.car.Car;
import org.junit.Before;
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

    private Car car;

    @Before
    public void setup() {
        car = new Car();
    }

    @Test
    public void shouldBeDownWhenGetInCar() {
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeDownWhenDownAndStepGas() {
        car.stepGas();
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeDownWhenDownAndGear() {
        car.gear();
        assertEquals(car.display(), "已熄火");
    }

    @Test
    public void shouldBeFiredWhenFire() {
        car.fire();
        assertEquals(car.display(), "已启动");
    }

    @Test
    public void shouldBeGearedWhenFireAndGear() {
        car.fire();
        car.gear();
        assertEquals(car.display(), "已挂档");
    }

    @Test
    public void shouldBeIdlyWhenFireAndStepGas() {
        car.fire();
        car.stepGas();
        assertEquals(car.display(), "已空转");
    }

    @Test
    public void shouldBeMovedWhenFireAndGearAndStepGas() {
        car.fire();
        car.gear();
        car.stepGas();
        assertEquals(car.display(), "已开始移动");
    }
}
