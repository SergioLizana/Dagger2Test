package riviasoftware.dagger2test.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import riviasoftware.dagger2test.data.Motor;
import riviasoftware.dagger2test.data.Vehicle;

/**
 * Created by sergiolizanamontero on 30/7/17.
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
