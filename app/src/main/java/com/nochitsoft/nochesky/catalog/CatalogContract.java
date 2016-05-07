package com.nochitsoft.nochesky.catalog;

import android.provider.BaseColumns;

/**
 * Created by nochita on 2016-04-08.
 */
public final class CatalogContract {
        // To prevent someone from accidentally instantiating the contract class,
        // give it an empty constructor.
        public CatalogContract() {}

        /* Inner class that defines the table contents */
        public static abstract class Catalog implements BaseColumns {
            public static final String TABLE_NAME = "catalog";
            public static final String COLUMN_NAME_ID = "catalog_Id";
            public static final String COLUMN_NAME_COMMON_NAME = "common_name";
            public static final String COLUMN_NAME_CONSTELLATION = "constellation";
            public static final String COLUMN_NAME_TYPE = "type";
            public static final String COLUMN_NAME_MAGNITUDE = "magnitude";
        }
}
