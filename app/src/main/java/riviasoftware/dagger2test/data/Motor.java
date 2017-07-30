package riviasoftware.dagger2test.data;

/**
 * Created by sergiolizanamontero on 30/7/17.
 */

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 120;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }

}
