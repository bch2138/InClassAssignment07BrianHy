package com.example.uhylabr.inclassassignment07_brianhy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // First you'll need 4 variables for inputs (3 EditText and 1 CheckBox)
    public EditText brand;
    public EditText model;
    public EditText numberOfWheels;
    public CheckBox checkBox;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText brand=(EditText)findViewById(R.id.brand);
        EditText model=(EditText)findViewById(R.id.model);
        EditText numberOfWheels=(EditText)findViewById(R.id.number_of_wheels);
        CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);

        // Then you'll need to connect those to the XML (findViewById)
    }

    public void launchActivity(View view) {
        // then a Method to .getText() and convert .toString() for each EditText
        // and a boolean for the CheckBox
        // then create an Object with constructor that accepts everything
        // and pass that to the SecondActivity
        submitButton=(Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                // String brand=brand.getText().toString();
                //String model=model.getText().toString();
                //Integer numberOfWheels=numberOfWheels.getText().toString();
                CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
                boolean goesOffRoad= checkBox.isChecked();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Keys.BRAND, "brand");
                intent.putExtra(Keys.MODEL, "model");
                intent.putExtra(Keys.NUMBEROFWHEELS, "0");
                intent.putExtra(Keys.GOESOFFROAD, "true");
            }});}
    TextView displayText=(TextView)findViewById(R.id.displayText);
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if (requestCode == 111 && resultCode == RESULT_OK){
            Car car = (Car) data.getSerializableExtra(Keys.CAR);
            displayText.setText(car.toString());
        }

    }

}