package com.nochita.nochesky.ui;

import android.support.v4.app.Fragment;

import com.nochita.nochesky.catalog.BaseCatalog;

public class CatalogListActivity extends BaseActivity {

    public static final String EXTRA_CATALOG = "EXTRA_CATALOG";

    @Override
    protected Fragment getFragment() {
        BaseCatalog catalog = (BaseCatalog) getIntent().getSerializableExtra(EXTRA_CATALOG);
        return CatalogListFragment.newInstance(catalog);
    }

}
