package com.utad.danieliglesia.milib.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.utad.danieliglesia.milib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {
    private Button btnAceptar, btnCancelar;
    RegisterFragmentListener registerFragmentListener;
    RegisterFragmentEvents registerFragmentEvents;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register2, container, false);
        this.setListener(registerFragmentListener);
        registerFragmentEvents = new RegisterFragmentEvents(this);

        btnCancelar=v.findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(registerFragmentEvents);

        btnAceptar=v.findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(registerFragmentEvents);

        return v;
    }
    public void setListener( RegisterFragmentListener registerFragmentListener) {
        this.registerFragmentListener = registerFragmentListener;
    }

}
class RegisterFragmentEvents implements View.OnClickListener{
    RegisterFragment registerFragment;

    public RegisterFragmentEvents(RegisterFragment registerFragment){
        this.registerFragment=registerFragment;
    }
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnCancelar){
            if (this.registerFragment.registerFragmentListener!=null);
            this.registerFragment.registerFragmentListener.OnCancelarClicked();
        }else if (v.getId()==R.id.btnAceptar){
            if (this.registerFragment.registerFragmentListener!=null);
            this.registerFragment.registerFragmentListener.OnAceptarClicked();
        }
    }
}
