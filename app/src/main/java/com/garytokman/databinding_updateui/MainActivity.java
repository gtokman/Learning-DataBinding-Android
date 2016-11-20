package com.garytokman.databinding_updateui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.garytokman.databinding_updateui.databinding.ActivityMainBinding;
import com.garytokman.databinding_updateui.model.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Person person = new Person();
        person.setName("Gary N Tokman");
        person.setAge("22 years old");
        person.setJob("Android Developer at Google");

        binding.setPerson(person);
    }
}
