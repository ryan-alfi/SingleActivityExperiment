package com.apokpak.simplesingleactivity.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.apokpak.simplesingleactivity.FragmentNavigationListener;
import com.apokpak.simplesingleactivity.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {


    private FragmentNavigationListener navigationListener;

    public FirstFragment() {
        // Required empty public constructor
    }

    public void setnavigationListener(FragmentNavigationListener fragmentNavigationListener){
        this.navigationListener = fragmentNavigationListener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.btn_frag_two);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frag_two:
                goingToSecondFragment();
                break;
            default:
                System.out.printf("nothing to do");
                break;
        }
    }

    private void goingToSecondFragment() {
        Bundle myBundle = new Bundle();
        myBundle.putString("data", "This data persed from first fragment");
        navigationListener.open2Fragment(myBundle);
    }
}
