package com.utad.danieliglesia.activity2;

import com.utad.danieliglesia.milib.Fragments.LoginFragmentListener;
import com.utad.danieliglesia.milib.Fragments.RegisterFragmentListener;

/**
 * Created by daniel.iglesia on 23/11/2017.
 */

public class MainActivityEvents implements LoginFragmentListener, RegisterFragmentListener{
    MainActivity mainActivity;

    public MainActivityEvents (MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
}
