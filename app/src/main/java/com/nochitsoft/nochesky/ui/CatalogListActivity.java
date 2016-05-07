package com.nochitsoft.nochesky.ui;

import android.support.v4.app.Fragment;

public class CatalogListActivity extends BaseActivity {

    @Override
    protected Fragment getFragment() {
        return CatalogListFragment.newInstance();
    }

}
