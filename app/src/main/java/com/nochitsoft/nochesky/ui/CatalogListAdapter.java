package com.nochitsoft.nochesky.ui;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nochitsoft.nochesky.R;
import com.nochitsoft.nochesky.model.ObservableObject;

import java.util.List;

/**
 * Created by nochita on 06/05/2016.
 */
public class CatalogListAdapter extends RecyclerView.Adapter<CatalogListAdapter.ObservableObjectViewHolder> {

    private Context context;
    private List<ObservableObject> observableObjectList;

    public CatalogListAdapter(Context context, List<ObservableObject> observableObjectList){
        this.context = context;
        this.observableObjectList = observableObjectList;
    }

    @Override
    public ObservableObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.catalog_list_row, parent, false);

        return new ObservableObjectViewHolder(itemView, new ObservableObjectViewHolder.IMyViewHolderClicks() {
            @Override
            public void onObservableObjectClick(View caller) {
                ObservableObject observableObject = (ObservableObject) caller.getTag();

                AlertDialog alertDialog = new AlertDialog.Builder(context).create();
                alertDialog.setTitle(observableObject.getCatalog());
                alertDialog.setMessage(observableObject.getDetailLabel(context));
                alertDialog.show();
            }
        });
    }

    @Override
    public void onBindViewHolder(ObservableObjectViewHolder holder, int position) {
        ObservableObject observableObject = observableObjectList.get(position);
        holder.catalog.setText(observableObject.getCatalog());
        holder.type.setText(observableObject.getType());
        holder.cardView.setTag(observableObject);
    }

    @Override
    public int getItemCount() {
        return observableObjectList.size();
    }

    public static class ObservableObjectViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        public TextView catalog;
        public TextView type;
        public IMyViewHolderClicks listener;
        public CardView cardView;

        public ObservableObjectViewHolder(View itemView, IMyViewHolderClicks listener) {
            super(itemView);
            catalog = (TextView) itemView.findViewById(R.id.catalog_row_catalog);
            type = (TextView) itemView.findViewById(R.id.catalog_row_type);
            cardView = (CardView) itemView.findViewById(R.id.card_view_row);

            this.listener = listener;
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onObservableObjectClick(v);
        }

        public interface IMyViewHolderClicks {
            public void onObservableObjectClick(View caller);
        }

    }
}
