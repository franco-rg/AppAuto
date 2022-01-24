package com.infocarsapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.infocarsapp.Holder.AutosHolder;
import com.infocarsapp.R;
import com.infocarsapp.vo.Autos;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AutosAdapter extends RecyclerView.Adapter<AutosHolder> {
    List<Autos> listVehicles;

    public AutosAdapter(List<Autos> listMemes){
        this.listVehicles = listMemes;
    }

    @NonNull
    @Override
    public AutosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_card,parent, false);
        return new AutosHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull AutosHolder holder, int position) {
        if(listVehicles!= null && position < listVehicles.size()){
            Autos vehicle = listVehicles.get(position);

            String idAuto = Integer.toString(vehicle.getId());
            String brandAuto = vehicle.getMarca();
            String nameAuto = vehicle.getNombre();
            String modelAuto = vehicle.getModelo();
            String dateAuto = vehicle.getFechaFabricacion();
            String imgAuto = vehicle.getImagen();

            holder.item_idAuto.setText(idAuto);
            holder.item_brandAuto.setText(brandAuto);
            holder.item_nameAuto.setText(nameAuto);
            holder.item_modelAuto.setText(modelAuto);
            holder.item_dateAuto.setText(dateAuto);
            Picasso.get().load(imgAuto).error(R.mipmap.ic_launcher).into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return listVehicles.size();
    }
}
