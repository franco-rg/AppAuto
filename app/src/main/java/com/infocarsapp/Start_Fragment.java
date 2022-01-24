package com.infocarsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.infocarsapp.R;

public class Start_Fragment extends Fragment {

    Button toUserView;
    Button toListCars;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vehicle_start_view, container, false);

        toUserView = view.findViewById(R.id.nextButtonUser);
        toListCars = view.findViewById(R.id.nextButtonList);

        toListCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Navigation) getActivity()).navigateTo(new Autos_Fragment(), false);
            }
        });

        toUserView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), Usuario_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}