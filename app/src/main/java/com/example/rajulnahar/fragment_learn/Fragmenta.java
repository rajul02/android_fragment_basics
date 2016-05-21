package com.example.rajulnahar.fragment_learn;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Rajul Nahar on 20-May-16.
 */
public class Fragmenta extends Fragment implements View.OnClickListener {
    Button b;
    int counter=0;
    communicator c;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        c= (communicator) getActivity();
        b=(Button) getActivity().findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b)
        {
        counter++;
        c.respond(counter + "Times");}
    }
}
