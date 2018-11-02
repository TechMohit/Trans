package com.example.varadhi.trans;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Createroute extends Fragment {

    public static Fragment newInstance(String s) {
        return new  Createroute ();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(),"test",Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_createroute, container, false);

    }

}
