package com.nochita.nochesky.contract;

import android.content.Context;

import com.nochita.nochesky.model.CatalogType;
import com.nochita.nochesky.ui.CatalogListAdapter;

public interface LoadCatalogContract {

    interface View {
        void showCatalog(CatalogListAdapter adapter);
        void showTitle(int titleResId);
    }

    interface Presenter {
        void setView(View viewInterface);
        void populate(CatalogType catalogType, Context context);
    }
}
