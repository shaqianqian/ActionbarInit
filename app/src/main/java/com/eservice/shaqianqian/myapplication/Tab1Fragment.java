package com.eservice.shaqianqian.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Tab1Fragment extends Fragment {

    //ici on cree un fragement pour le tab<Album>
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.tab_layout, container, false);
        TextView ville = (TextView) view.findViewById(R.id.textView);
        ville.setText("Lille");
        return view;
    }


}
