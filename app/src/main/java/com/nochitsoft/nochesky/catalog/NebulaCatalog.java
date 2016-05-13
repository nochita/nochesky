package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.R;

/**
 * Created by nochita on 2016-05-10.
 */
public class NebulaCatalog extends BaseCatalog {

    @Override
    protected int getCatalogArrayResourceId() {
        return R.array.nebulaCatalog;
    }

    public int getCatalogName() {
        return R.string.nebulae;
    }

}
