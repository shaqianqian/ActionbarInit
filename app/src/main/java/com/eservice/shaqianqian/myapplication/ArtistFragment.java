package com.eservice.shaqianqian.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ArtistFragment extends Fragment {

  //ici on cree un fragement pour le tab<Artist>
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.musique, container, false);
        TextView ville = (TextView) view.findViewById(R.id.textView);
        ville.setText("artist");
        return view;
    }


}
