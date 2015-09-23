package com.boca.boca.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boca.boca.R;

/**
 * Created by yanfa on 9/20/2015.
 */
public class PaymentFragment extends Fragment {

    public PaymentFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_payment, container, false);


        return rootView;
    }
}
