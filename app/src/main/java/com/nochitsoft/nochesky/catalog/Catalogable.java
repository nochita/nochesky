package com.nochitsoft.nochesky.catalog;

import com.nochitsoft.nochesky.model.ObservableObject;

import java.util.List;

/**
 * Created by nochita on 2016-04-13.
 */
public interface Catalogable {
    public int getQuantity();
    public String getName();
    public List<ObservableObject> load();
}
