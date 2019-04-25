package com.nochita.nochesky.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nochita.nochesky.R;
import com.nochita.nochesky.contract.LoadCatalogContract;
import com.nochita.nochesky.di.DaggerLoadCatalogComponent;
import com.nochita.nochesky.di.LoadCatalogModule;
import com.nochita.nochesky.model.CatalogType;

import javax.inject.Inject;

public class CatalogListFragment extends Fragment implements LoadCatalogContract.View {

    private static final String ARG_CATALOG = "ARG_CATALOG";
    private RecyclerView recyclerView;
    private CatalogListAdapter adapter;
    private CatalogType catalogType;

    @Inject
    LoadCatalogContract.Presenter presenter;

    public static CatalogListFragment newInstance(CatalogType catalog) {
        CatalogListFragment fragment = new CatalogListFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_CATALOG, catalog);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        catalogType = (CatalogType) args.getSerializable(ARG_CATALOG);

        presenter = DaggerLoadCatalogComponent.builder()
                .loadCatalogModule(new LoadCatalogModule())
                .build()
                .inject();
//        ((LoadCatalogApplication)getActivity().getApplication()).getLoadCatalogComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_catalog_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        presenter.setView(this);
        presenter.populate(catalogType, getActivity());
    }

    @Override
    public void showCatalog(CatalogListAdapter adapter) {
        this.adapter = adapter;
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showTitle(int titleResId) {
        getActivity().setTitle(titleResId);
    }
}
