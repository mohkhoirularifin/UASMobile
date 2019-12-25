package com.example.uasmobile.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.uasmobile.R;
import com.example.uasmobile.nabi.Ibrahim;
import com.example.uasmobile.nabi.Nuh;

/**
 * A simple {@link Fragment} subclass.
 */
public class PengetahuanFragment extends Fragment {

    private View v;

    public PengetahuanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_pengetahuan,container, false);
        addListenerOnButton();
        return v;
    }

    public void addListenerOnButton() {

        ImageButton ib1 = (ImageButton) v.findViewById(R.id.nuh);
        ImageButton ib2 = (ImageButton) v.findViewById(R.id.ibrahim);

        ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(PengetahuanFragment.this.getActivity(), Nuh.class);
                startActivity(int1);
            }

        });
        ib2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(PengetahuanFragment.this.getActivity(), Ibrahim.class);
                startActivity(int2);
            }

        });
    }

}
