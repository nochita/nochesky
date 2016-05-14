package com.nochita.nochesky.ui;

import android.support.v4.app.Fragment;

public class MainActivity extends BaseActivity {

    @Override
    protected Fragment getFragment() {
        return MainFragment.newInstance();
    }

}
