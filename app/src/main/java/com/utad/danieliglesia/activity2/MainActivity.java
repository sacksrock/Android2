package com.utad.danieliglesia.activity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.utad.danieliglesia.milib.Fragments.LoginFragment;
import com.utad.danieliglesia.milib.Fragments.LoginFragmentListener;
import com.utad.danieliglesia.milib.Fragments.RegisterFragment;
import com.utad.danieliglesia.milib.Fragments.RegisterFragmentListener;

public class MainActivity extends AppCompatActivity {

    MainActivityEvents events;
    RegisterFragment registerFragment;
    LoginFragment loginFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);
        loginFragment = (LoginFragment)getSupportFragmentManager().findFragmentById(R.id.loginFragment);
        loginFragment.setListener(events);
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.registerFragment);
        registerFragment.setListener(events);


    }
}
