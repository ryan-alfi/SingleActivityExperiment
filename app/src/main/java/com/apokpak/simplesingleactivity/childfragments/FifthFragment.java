package com.apokpak.simplesingleactivity.childfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apokpak.simplesingleactivity.R;


/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FifthFragment extends Fragment {


    public FifthFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }
}
