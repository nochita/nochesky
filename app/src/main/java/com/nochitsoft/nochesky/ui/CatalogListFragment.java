package com.nochitsoft.nochesky.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.catalog.BaseCatalog;
import com.nochitsoft.nochesky.catalog.MessierCatalog;

public class CatalogListFragment extends Fragment {

    private static final String ARG_CATALOG = "ARG_CATALOG";
    private RecyclerView recyclerView;
    private CatalogListAdapter adapter;
    private BaseCatalog catalog;

    public static CatalogListFragment newInstance(BaseCatalog catalog) {
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
        catalog = (BaseCatalog) args.getSerializable(ARG_CATALOG);
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

        adapter = new CatalogListAdapter(getActivity(), catalog.load());

        getActivity().setTitle(catalog.getName());

        recyclerView.setAdapter(adapter);
    }
}
