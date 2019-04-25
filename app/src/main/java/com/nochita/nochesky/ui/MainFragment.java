package com.nochita.nochesky.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nochita.nochesky.R;
import com.nochita.nochesky.model.CatalogType;

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
                doStartCatalogActivity(CatalogType.MESSIER);
            }
        });

        view.findViewById(R.id.see_open_cluster_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(CatalogType.OPEN_CLUSTER);
            }
        });

        view.findViewById(R.id.see_globular_cluster_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(CatalogType.GLOBULAR_CLUSTER);
            }
        });

        view.findViewById(R.id.see_galaxy_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(CatalogType.GALAXY);
            }
        });

        view.findViewById(R.id.see_nebula_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doStartCatalogActivity(CatalogType.NEBULA);
            }
        });
    }

    private void doStartCatalogActivity(CatalogType catalog){
        Intent intent = new Intent(getContext(), CatalogListActivity.class);
        intent.putExtra(CatalogListActivity.EXTRA_CATALOG, catalog);
        startActivity(intent);
    }

}
