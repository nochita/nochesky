package com.nochita.nochesky.model;

import com.nochita.nochesky.R;

public enum CatalogType {
    GALAXY(R.array.galaxyCatalog, R.string.galaxies),
    GLOBULAR_CLUSTER(R.array.globularClusterCatalog, R.string.globular_cluster),
    MESSIER(R.array.messierCatalog, R.string.messier),
    NEBULA(R.array.nebulaCatalog, R.string.nebulae),
    OPEN_CLUSTER(R.array.openClusterCatalog, R.string.open_cluster);

    private int arrayResId;
    private int nameResId;

    CatalogType(int arrayResId, int nameResId){
        this.arrayResId = arrayResId;
        this.nameResId = nameResId;
    }

    public int getArrayResId() {
        return arrayResId;
    }

    public int getNameResId() {
        return nameResId;
    }
}
