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
import com.nochitsoft.nochesky.catalog.MessierCatalog;

public class CatalogListFragment extends Fragment {

    private RecyclerView recyclerView;
    private CatalogListAdapter adapter;

    public static CatalogListFragment newInstance() {
        return new CatalogListFragment();
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

        // TODO load from database
        adapter = new CatalogListAdapter(getActivity(), new MessierCatalog().load());

        recyclerView.setAdapter(adapter);
    }
}
