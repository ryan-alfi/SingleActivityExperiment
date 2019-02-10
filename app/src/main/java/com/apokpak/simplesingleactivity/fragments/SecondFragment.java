package com.apokpak.simplesingleactivity.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.apokpak.simplesingleactivity.FragmentNavigationListener;
import com.apokpak.simplesingleactivity.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {


    private FragmentNavigationListener navigationListener;
    private String msg;

    public SecondFragment() {
        // Required empty public constructor
    }

    public void setnavigationListener(FragmentNavigationListener fragmentNavigationListener){
        this.navigationListener = fragmentNavigationListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvMessege = view.findViewById(R.id.tv_messege);
        Button btnFragmentThree = view.findViewById(R.id.btn_frag_three);

        getDataBundle();
        setMessege(tvMessege);

        btnFragmentThree.setOnClickListener(this);
    }

    private void setMessege(TextView textView) {
        if (msg != null && !msg.isEmpty()) {
            textView.setText(msg);
        }
    }

    private void getDataBundle() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            msg = bundle.getString("data");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_frag_three:
                openFragementThree();
                break;
            default:
                break;
        }
    }

    private void openFragementThree() {
        String param1 = "Title for First Child";
        String param2 = "Title for Second Child";
        Bundle bundle = new Bundle();
        bundle.putString("param1", param1);
        bundle.putString("param2", param2);

        ThirdFragment fragmentTiga = new ThirdFragment();
        fragmentTiga.setArguments(bundle);
        navigationListener.openFragement(fragmentTiga);
    }
}
