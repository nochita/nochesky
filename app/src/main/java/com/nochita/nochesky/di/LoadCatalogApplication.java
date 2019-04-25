package com.nochita.nochesky.di;

import android.app.Application;

public class LoadCatalogApplication extends Application {

    private LoadCatalogComponent loadCatalogComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public LoadCatalogComponent getLoadCatalogComponent(){
        return loadCatalogComponent;
    }
}
