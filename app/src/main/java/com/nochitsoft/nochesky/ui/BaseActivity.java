package com.nochitsoft.nochesky.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.nochitsoft.nochesky.R;

/**
 * Base activity for all the activities in the app.
 * */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        if (savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, getFragment())
                    .commit();

            fragmentManager.beginTransaction()
                    .commit();
        }
    }

    protected abstract Fragment getFragment();

}
