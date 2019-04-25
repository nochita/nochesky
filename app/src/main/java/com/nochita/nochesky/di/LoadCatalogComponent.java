package com.nochita.nochesky.di;

import com.nochita.nochesky.contract.LoadCatalogContract;
import com.nochita.nochesky.ui.CatalogListFragment;

import dagger.Component;

@Component(modules = LoadCatalogModule.class)
public interface LoadCatalogComponent {

//    void inject(CatalogListFragment catalogListFragment);
    LoadCatalogContract.Presenter inject();

}
