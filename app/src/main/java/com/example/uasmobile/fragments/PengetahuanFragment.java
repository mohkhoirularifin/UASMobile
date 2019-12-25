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
import com.example.uasmobile.nabi.Isa;
import com.example.uasmobile.nabi.Muhammad;
import com.example.uasmobile.nabi.Musa;
import com.example.uasmobile.nabi.Nuh;
import com.example.uasmobile.nabi.UlulAzmi;

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
        ImageButton ib3 = (ImageButton) v.findViewById(R.id.musa);
        ImageButton ib4 = (ImageButton) v.findViewById(R.id.isa);
        ImageButton ib5 = (ImageButton) v.findViewById(R.id.muhammad);
        ImageButton ib6 = (ImageButton) v.findViewById(R.id.ululazmi);

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
        ib3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(PengetahuanFragment.this.getActivity(), Musa.class);
                startActivity(int3);
            }

        });
        ib4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(PengetahuanFragment.this.getActivity(), Isa.class);
                startActivity(int4);
            }

        });
        ib5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(PengetahuanFragment.this.getActivity(), Muhammad.class);
                startActivity(int5);
            }

        });
        ib6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(PengetahuanFragment.this.getActivity(), UlulAzmi.class);
                startActivity(int6);
            }

        });
    }

}
