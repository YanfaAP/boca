package com.boca.boca.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.boca.boca.R;

/**
 * Created by yanfa on 9/10/2015.
 */
public class LoginFragment extends Fragment {

    private Button loginButton;
    private Button signUpButton;

    public LoginFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        loginButton = (Button)rootView.findViewById(R.id.loginButton);
        signUpButton = (Button)rootView.findViewById(R.id.signUpLoginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ganti ke menu pilih lapangan
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ganti fragment ke signUp
            }
        });

        return rootView;
    }
}
