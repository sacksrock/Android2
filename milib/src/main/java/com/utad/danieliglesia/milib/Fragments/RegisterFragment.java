package com.utad.danieliglesia.milib.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utad.danieliglesia.milib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
    RegisterFragmentListener registerFragmentListener;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register2, container, false);

        return v;
    }
    public void setListener( RegisterFragmentListener registerFragmentListener) {
        this.registerFragmentListener = registerFragmentListener;
    }

}
