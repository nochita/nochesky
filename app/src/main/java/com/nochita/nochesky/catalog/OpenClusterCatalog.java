package com.nochita.nochesky.catalog;

import com.nochita.nochesky.R;

/**
 * Created by nochita on 10/05/2016.
 */
public class OpenClusterCatalog extends BaseCatalog {

    @Override
    protected int getCatalogArrayResourceId() {
        return R.array.openClusterCatalog;
    }

    public int getCatalogName() {
        return R.string.open_cluster;
    }

}
