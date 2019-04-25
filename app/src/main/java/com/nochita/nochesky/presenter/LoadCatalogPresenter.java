package com.nochita.nochesky.presenter;

import android.content.Context;

import com.nochita.nochesky.contract.LoadCatalogContract;
import com.nochita.nochesky.model.CatalogType;
import com.nochita.nochesky.model.ObservableObject;
import com.nochita.nochesky.ui.CatalogListAdapter;

import java.util.ArrayList;
import java.util.List;

public class LoadCatalogPresenter implements LoadCatalogContract.Presenter {

    private LoadCatalogContract.View view;

    @Override
    public void setView(LoadCatalogContract.View viewInterface) {
        this.view = viewInterface;
    }

    @Override
    public void populate(CatalogType catalogType, Context context) {
        String[] data = context.getResources().getStringArray(catalogType.getArrayResId());

         /* this loop is to transform the string with the data with pipe separator to a
          list of Observable Objects*/
        List<ObservableObject> catalog = new ArrayList<ObservableObject>();
        for(String obj : data){
            catalog.add(new ObservableObject(obj));
        }

        view.showTitle(catalogType.getNameResId());

        view.showCatalog(new CatalogListAdapter(context, catalog));
    }

}
