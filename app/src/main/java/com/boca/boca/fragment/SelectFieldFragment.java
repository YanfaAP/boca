package com.boca.boca.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.boca.boca.R;

/**
 * Created by yanfa on 9/20/2015.
 */
public class SelectFieldFragment extends Fragment {

    public SelectFieldFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_field_select, container, false);


        return rootView;
    }
}
