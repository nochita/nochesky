package com.nochita.nochesky.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.nochita.nochesky.catalog.BaseCatalog;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class CatalogListActivity extends BaseActivity {

    public static final String EXTRA_CATALOG = "EXTRA_CATALOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);
    }

    @Override
    protected Fragment getFragment() {
        BaseCatalog catalog = (BaseCatalog) getIntent().getSerializableExtra(EXTRA_CATALOG);
        return CatalogListFragment.newInstance(catalog);
    }

}
