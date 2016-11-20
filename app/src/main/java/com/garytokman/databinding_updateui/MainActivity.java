package com.garytokman.databinding_updateui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.garytokman.databinding_updateui.databinding.ActivityMainBinding;
import com.garytokman.databinding_updateui.model.Car;
import com.garytokman.databinding_updateui.model.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Person person = new Person();
        person.setAge("22 years old");
        person.setJob("Android Developer at Google");
        person.setImage("https://cdn1.tnwcdn.com/wp-content/blogs.dir/1/files/2016/11/18nov-b3.jpg");

        Car car = new Car();
        car.type.set("Lambo");

        binding.setPerson(person);
        binding.setCar(car);
    }
}
