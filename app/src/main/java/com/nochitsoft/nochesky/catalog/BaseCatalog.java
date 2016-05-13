package com.nochitsoft.nochesky.catalog;

import android.content.Context;

import com.nochitsoft.nochesky.model.ObservableObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the base class of all the catalogs.
 * */
public abstract class BaseCatalog implements Serializable {

    /**
     * Loads the prepopulated data and returns the catalog.
     * @param context the context
     * @return a list of Observable Objects that represents a catalog
     */
    public List<ObservableObject> load(Context context) {
        String[] data = context.getResources().getStringArray(getCatalogArrayResourceId());

         /* this loop is to transform the string with the data with pipe separator to a
          list of Observable Objects*/
        List<ObservableObject> catalog = new ArrayList<ObservableObject>();
        for(String obj : data){
            catalog.add(new ObservableObject(obj));
        }
        return catalog;
    }

    /**
     * Returns the resource id of the array containing the catalog information.
     * */
    protected abstract int getCatalogArrayResourceId();

    /**
     * Returns the resource id of the string representing the name of the catalog.
     */
    public abstract int getCatalogName();
}
