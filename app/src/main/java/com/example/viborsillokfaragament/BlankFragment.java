package com.example.viborsillokfaragament;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viborsillokfaragament.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {
    FragmentBlankBinding binding;


    public BlankFragment() {

    }


    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

       return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.imageVk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoor(0);
            }

        });
        binding.cartochka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoor(1);
            }

        });
        binding.cartochka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoor(2);
            }

        });
        binding.cartochka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDoor(3);
            }

        });
    }

    public void openDoor(int choiseOfTheDoor) {

        Bundle bundle = new Bundle();
        bundle.putInt("door", choiseOfTheDoor);
        BlankFragment2 blankFragment2 = new BlankFragment2();
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        blankFragment2.setArguments(bundle);
        transaction.setReorderingAllowed(true);
        transaction.add(R.id.fragment_container_view, BlankFragment2.class, bundle);
        transaction.addToBackStack("");
        transaction.commit();
    }
}