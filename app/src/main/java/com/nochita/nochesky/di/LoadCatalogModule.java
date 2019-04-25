package com.nochita.nochesky.di;

import com.nochita.nochesky.contract.LoadCatalogContract;
import com.nochita.nochesky.presenter.LoadCatalogPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class LoadCatalogModule {

    private LoadCatalogContract.Presenter loadCatalogPresenter;

    @Provides
    public LoadCatalogContract.Presenter providesPresenter(){
        return new LoadCatalogPresenter();
    }
}
