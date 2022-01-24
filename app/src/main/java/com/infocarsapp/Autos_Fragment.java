package com.infocarsapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.infocarsapp.Adapter.AutosAdapter;
import com.infocarsapp.R;
import com.infocarsapp.api.ApiAutos;
import com.infocarsapp.vo.Autos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Autos_Fragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vehicle_grid, container, false);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiAutos.URL_REST).addConverterFactory(GsonConverterFactory.create()).build();
        ApiAutos apiVehicle = retrofit.create(ApiAutos.class);

        Call<List<Autos>> listVehiclesCall = apiVehicle.list();
        listVehiclesCall.enqueue(new Callback<List<Autos>>() {
            @Override
            public void onResponse(Call<List<Autos>> call, Response<List<Autos>> response) {
                if(!response.isSuccessful()){
                    Log.e("CallService.onResponse","Error" + response.code());
                } else{
                    List<Autos> vehicles = response.body();

                    RecyclerView recyclerView = view.findViewById(R.id.listVehiclesPrint);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, RecyclerView.VERTICAL, false));
                    Log.e("CallService.onResponse", "Error");

                    AutosAdapter adapter = new AutosAdapter(vehicles);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Autos>> call, Throwable t) {
                Log.e("CallService.onFailure", t.getLocalizedMessage());
            }
        });
        return view;
    }
}
