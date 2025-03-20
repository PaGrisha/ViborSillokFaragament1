package com.example.viborsillokfaragament;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class BlankFragment2 extends Fragment {



    public BlankFragment2() {

    }

    public static BlankFragment2 newInstance(String param1, String param2) {
        BlankFragment2 fragment = new BlankFragment2();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        int choice = 0;
        if (bundle != null) {
            choice = bundle.getInt("door");
        }
        String soxranil = getWater(choice);

        Toast.makeText(requireContext(), soxranil, Toast.LENGTH_LONG).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }




    public String getWater(int position) {
        String[] xlebs = getResources().getStringArray(R.array.sillllllki_ponimaesh_besplatno);
        return xlebs[position];
    }
}