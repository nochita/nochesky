package com.nochita.nochesky.di;

import com.nochita.nochesky.contract.LoadCatalogContract;

import dagger.Component;

@Component(modules = LoadCatalogModule.class)
public interface LoadCatalogComponent {

    LoadCatalogContract.Presenter inject();

}
