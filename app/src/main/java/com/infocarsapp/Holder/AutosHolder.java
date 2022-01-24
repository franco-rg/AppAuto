package com.infocarsapp.Holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.infocarsapp.R;

public class AutosHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public Context context;
    public TextView item_idAuto;
    public TextView item_brandAuto;
    public TextView item_nameAuto;
    public TextView item_modelAuto;
    public TextView item_dateAuto;
    public TextView item_imgAuto;
    public ImageView imageView;

    public AutosHolder(@NonNull View itemView) {
        super(itemView);
        itemView.getContext();
        context =itemView.getContext();

        item_idAuto = itemView.findViewById(R.id.idAutoPrint);
        item_brandAuto = itemView.findViewById(R.id.brandAutoPrint);
        item_nameAuto = itemView.findViewById(R.id.nameAutoPrint);
        item_modelAuto = itemView.findViewById(R.id.modelAutoPrint);
        item_dateAuto = itemView.findViewById(R.id.dateAutoPrint);
        imageView = (ImageView) itemView.findViewById(R.id.imgAutoPrint);
        item_imgAuto = itemView.findViewById(R.id.imgTextAutoPrint);
    }

    @Override
    public void onClick(View v) {
    }
}
