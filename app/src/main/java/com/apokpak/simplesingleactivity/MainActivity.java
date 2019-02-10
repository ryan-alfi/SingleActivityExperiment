package com.apokpak.simplesingleactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apokpak.simplesingleactivity.fragments.FirstFragment;
import com.apokpak.simplesingleactivity.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements FragmentNavigationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openFirstFragment(new Bundle());
    }

    private void openFirstFragment(Bundle bundle) {
        FirstFragment fragmentSatu = new FirstFragment();
        fragmentSatu.setnavigationListener(this);
        fragmentSatu.setArguments(bundle);
        commitFragment(fragmentSatu);
    }

    private void openSecondFragment(Bundle bundle) {
        SecondFragment fragmentDua = new SecondFragment();
        fragmentDua.setnavigationListener(this);
        fragmentDua.setArguments(bundle);
        commitFragment(fragmentDua);
    }

    private void commitFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void openFragement(Fragment fragment) {
        commitFragment(fragment);
    }

    @Override
    public void open1Fragment(Bundle bundle) {
        openFirstFragment(bundle);
    }

    @Override
    public void open2Fragment(Bundle bundle) {
        openSecondFragment(bundle);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
