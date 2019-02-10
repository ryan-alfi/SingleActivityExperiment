package com.apokpak.simplesingleactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public interface FragmentNavigationListener {
    void openFragement(Bundle bundle, Fragment fragment);
    void open1Fragment(Bundle bundle);
    void open2Fragment(Bundle bundle);
}
