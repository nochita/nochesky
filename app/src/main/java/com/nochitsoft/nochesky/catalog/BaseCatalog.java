package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.model.ObservableObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the base class of all the catalogs.
 * */
public abstract class BaseCatalog implements Serializable {

    /**
     * Loads the prepopulated data of the catalog.
     */
    public List<ObservableObject> load() {
        String[] data = populate();

        List<ObservableObject> catalog = new ArrayList<ObservableObject>();
        for(String obj : data){
            catalog.add(new ObservableObject(obj));
        }
        return catalog;
    }

    // TODO load from database
    /**
     * Populates the data into an array of strings
     *
     * */
    protected abstract String[] populate();

    /**
     * Returns the resource id of the string representing the name of the catalog
     */
    public abstract int getName();
}
