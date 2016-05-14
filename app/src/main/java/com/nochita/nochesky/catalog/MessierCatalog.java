package com.nochita.nochesky.catalog;

import com.nochita.nochesky.R;

/**
 * Created by nochita on 2016-04-13.
 */
public class MessierCatalog extends BaseCatalog {

    @Override
    protected int getCatalogArrayResourceId() {
        return R.array.messierCatalog;
    }

    public int getCatalogName() {
        return R.string.messier;
    }

}
