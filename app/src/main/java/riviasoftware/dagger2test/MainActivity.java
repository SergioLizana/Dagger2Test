package riviasoftware.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import riviasoftware.dagger2test.components.DaggerVehicleComponent;
import riviasoftware.dagger2test.components.VehicleComponent;
import riviasoftware.dagger2test.data.Vehicle;
import riviasoftware.dagger2test.modules.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();


    }
}
