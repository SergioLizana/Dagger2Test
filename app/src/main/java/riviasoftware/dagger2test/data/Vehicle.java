package riviasoftware.dagger2test.data;

import javax.inject.Inject;

/**
 * Created by sergiolizanamontero on 30/7/17.
 */

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }

}
