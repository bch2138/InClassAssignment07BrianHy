package com.example.uhylabr.inclassassignment07_brianhy;

/**
 * Created by UHYLABR on 3/9/2018.
 */

import java.io.Serializable;



public class Car implements Serializable {

    private String mBrand;
    private String mModel;
    private int mNumberOfWheels;
    private boolean mGoesOffRoad=true;

    public Car(String mBrand, String mModel, int mNumberOfWheels, boolean mGoesOffRoad){
        this.mBrand = mBrand;
        this.mModel = mModel;
        this.mNumberOfWheels = mNumberOfWheels;
        this.mGoesOffRoad = mGoesOffRoad;
    }

    public String getmBrand() {
        return mBrand;
    }

    public String getmModel() {
        return mModel;
    }

    public int getmNumberOfWheels() {
        return mNumberOfWheels;
    }

    public boolean ismGoesOffRoad() {
        return mGoesOffRoad;
    }


    //has a toString() that returns something like: "Animal Type/Name: " + animalName + "\nNumber of Legs:


    public String toString() {
        return "Car{" +
                "Brand='" + mBrand + '\'' +
                ", Model='" + mModel + '\'' +
                ", Number Of Wheels='" + mNumberOfWheels + '\'' +
                ", Off Road=" + mGoesOffRoad;



    }}

    /*public void launchActivity (View view){

        Intent intent = new Intent(this, SecondActivity.class);

        Car a = new Car("Brand", "Model", 0, true);
        intent.putExtra(Keys.CAR,a);
        startActivity(intent);}}

    public void addCar(View view){
    Intent intent = new Intent(this, SecondActivity.class){
        startActivityForResult(intent,111);
    };
    }}*/