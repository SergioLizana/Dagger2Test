package riviasoftware.dagger2test.components;

import javax.inject.Singleton;

import dagger.Component;
import riviasoftware.dagger2test.data.Vehicle;
import riviasoftware.dagger2test.modules.VehicleModule;

/**
 * Created by sergiolizanamontero on 30/7/17.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}