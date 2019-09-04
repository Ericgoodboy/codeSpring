package IOC;

import org.junit.Test;

public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = Car.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel.getSpecification());
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
