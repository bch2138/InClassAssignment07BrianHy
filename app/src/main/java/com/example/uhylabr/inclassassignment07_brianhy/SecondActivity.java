package com.example.uhylabr.inclassassignment07_brianhy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView displayText=(TextView)findViewById(R.id.displayText);


        Intent intent = new Intent(this, Car.class);
        Car mCar = (Car) intent.getSerializableExtra(Keys.CAR);

    }

    public void submitCar(View view){
        Car car = new Car("Brand", "Model", 0, true);
        Intent data = new Intent();
        data.putExtra(Keys.CAR,car);
        setResult(RESULT_OK, data);
        finish();
    }
}






