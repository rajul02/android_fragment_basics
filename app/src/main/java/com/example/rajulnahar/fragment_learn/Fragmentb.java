package com.example.rajulnahar.fragment_learn;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajul Nahar on 20-May-16.
 */
public class Fragmentb extends Fragment {
    TextView t;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t=(TextView)getActivity().findViewById(R.id.textView3);

    }

    public void changetext( String data)
    {
        t.setText(data);
    }

}
