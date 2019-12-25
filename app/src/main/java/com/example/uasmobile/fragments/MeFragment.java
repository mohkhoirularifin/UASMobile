package com.example.uasmobile.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.uasmobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private View v;

    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_me,container, false);
        addListenerOnButton();
        return v;
    }

    public void addListenerOnButton() {

        ImageButton ib1 = (ImageButton) v.findViewById(R.id.fb);
        ImageButton ib2 = (ImageButton) v.findViewById(R.id.tw);
        ImageButton ib3 = (ImageButton) v.findViewById(R.id.ig);

        ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int1 = new Intent();
                int1.setAction(Intent.ACTION_VIEW);
                int1.addCategory(Intent.CATEGORY_BROWSABLE);
                int1.setData(Uri.parse("https://www.facebook.com/khoierulz.chpandean"));
                startActivity(int1);
            }

        });
        ib2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int2 = new Intent();
                int2.setAction(Intent.ACTION_VIEW);
                int2.addCategory(Intent.CATEGORY_BROWSABLE);
                int2.setData(Uri.parse("https://twitter.com/moh_khoirul_a_"));
                startActivity(int2);
            }

        });
        ib3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent int3 = new Intent();
                int3.setAction(Intent.ACTION_VIEW);
                int3.addCategory(Intent.CATEGORY_BROWSABLE);
                int3.setData(Uri.parse("https://www.instagram.com/moh.khoirularifin_/"));
                startActivity(int3);
            }

        });
    }

}
