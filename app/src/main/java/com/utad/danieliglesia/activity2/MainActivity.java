package com.utad.danieliglesia.activity2;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.utad.danieliglesia.milib.Fragments.LoginFragment;
import com.utad.danieliglesia.milib.Fragments.LoginFragmentListener;
import com.utad.danieliglesia.milib.Fragments.RegisterFragment;
import com.utad.danieliglesia.milib.Fragments.RegisterFragmentListener;

public class MainActivity extends AppCompatActivity {

    private MainActivityEvents mainActivityEvents;
    RegisterFragment registerFragment;
    LoginFragment loginFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityEvents = new MainActivityEvents(this);

        loginFragment = (LoginFragment)getSupportFragmentManager().findFragmentById(R.id.loginFragment);
        loginFragment.setListener(mainActivityEvents);
        registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.registerFragment);
        registerFragment.setListener(mainActivityEvents);
    }
    
}
class MainActivityEvents implements LoginFragmentListener, RegisterFragmentListener{
    private MainActivity mainActivity;
    
    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }
    @Override
    public void OnRegisterClicked() {
        FragmentTransaction transicion = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transicion.show(this.mainActivity.registerFragment);
        transicion.hide(this.mainActivity.loginFragment);
        transicion.commit();
    }

    @Override
    public void OnLoginClicked() {

    }
    public void OnCancelarClicked() {
        FragmentTransaction transicion = this.mainActivity.getSupportFragmentManager().beginTransaction();
        transicion.hide(this.mainActivity.registerFragment);
        transicion.show(this.mainActivity.loginFragment);
        transicion.commit();
    }
    public void OnAceptarClicked() {

    }
}