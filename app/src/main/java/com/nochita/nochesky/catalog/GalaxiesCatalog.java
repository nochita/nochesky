package com.nochita.nochesky.catalog;

import com.nochita.nochesky.R;

/**
 * Created by nochita on 10/05/2016.
 */
public class GalaxiesCatalog extends BaseCatalog {

    @Override
    protected int getCatalogArrayResourceId() {
        return R.array.galaxyCatalog;
    }

    public int getCatalogName() {
        return R.string.galaxies;
    }
}
