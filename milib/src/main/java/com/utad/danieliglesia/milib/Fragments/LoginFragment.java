package com.utad.danieliglesia.milib.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utad.danieliglesia.milib.R;


public class LoginFragment extends Fragment {
    LoginFragmentListener loginFragmentListener;
    public LoginFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        return v;
    }

    public void setListener(LoginFragmentListener loginFragmentListener) {
        this.loginFragmentListener = loginFragmentListener;
    }
}
