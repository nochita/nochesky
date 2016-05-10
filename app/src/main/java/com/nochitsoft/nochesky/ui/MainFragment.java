package com.nochitsoft.nochesky.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.catalog.BaseCatalog;
import com.nochitsoft.nochesky.catalog.GalaxiesCatalog;
import com.nochitsoft.nochesky.catalog.GlobularClusterCatalog;
import com.nochitsoft.nochesky.catalog.MessierCatalog;
import com.nochitsoft.nochesky.catalog.NebulaCatalog;
import com.nochitsoft.nochesky.catalog.OpenClusterCatalog;

public class MainFragment extends Fragment {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.see_messier_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(new MessierCatalog());
            }
        });

        view.findViewById(R.id.see_open_cluster_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(new OpenClusterCatalog());
            }
        });

        view.findViewById(R.id.see_globular_cluster_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(new GlobularClusterCatalog());
            }
        });

        view.findViewById(R.id.see_galaxy_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(new GalaxiesCatalog());
            }
        });

        view.findViewById(R.id.see_nebula_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(new NebulaCatalog());
            }
        });
    }

    private void doStartCatalogActivity(BaseCatalog catalog){
        Intent intent = new Intent(getContext(), CatalogListActivity.class);
        intent.putExtra(CatalogListActivity.EXTRA_CATALOG, catalog);
        startActivity(intent);
    }

}
