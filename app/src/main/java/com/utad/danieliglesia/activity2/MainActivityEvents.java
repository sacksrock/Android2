package com.utad.danieliglesia.activity2;

import com.utad.danieliglesia.milib.Fragments.LoginFragment;
import com.utad.danieliglesia.milib.Fragments.LoginFragmentListener;
import com.utad.danieliglesia.milib.Fragments.RegisterFragment;
import com.utad.danieliglesia.milib.Fragments.RegisterFragmentListener;
import android.view.View;


/**
 * Created by daniel.iglesia on 23/11/2017.
 */

public class MainActivityEvents implements LoginFragmentListener, RegisterFragmentListener {
    private MainActivity mainActivity;
    private LoginFragment loginFragment;
    private RegisterFragment registerFragment;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnRegistrar) {
            this.loginFragment.getView().setVisibility(View.GONE);
            this.registerFragment.getView().setVisibility(View.VISIBLE);
        }
    }
}
