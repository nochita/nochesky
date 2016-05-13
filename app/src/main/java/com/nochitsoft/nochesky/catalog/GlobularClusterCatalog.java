package com.nochitsoft.nochesky.catalog;

import android.content.Context;

import com.nochitsoft.nochesky.R;

/**
 * Created by nochita on 10/05/2016.
 */
public class GlobularClusterCatalog extends BaseCatalog {

    @Override
    protected int getCatalogArrayResourceId() {
        return R.array.globularClusterCatalog;
    }

    public int getCatalogName() {
        return R.string.globular_cluster;
    }

}
