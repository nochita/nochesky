package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.model.ObservableObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseCatalog implements Serializable {

    public List<ObservableObject> load() {
        String[] data = populate();

        List<ObservableObject> catalog = new ArrayList<ObservableObject>();
        for(String obj : data){
            catalog.add(new ObservableObject(obj));
        }
        return catalog;
    }

    // TODO load from database
    protected abstract String[] populate();

    public abstract int getName();
}
