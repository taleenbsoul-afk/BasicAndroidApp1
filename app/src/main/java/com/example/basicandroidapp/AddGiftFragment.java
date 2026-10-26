package com.example.basicandroidapp;

import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddGiftFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddGiftFragment extends Fragment {

    FirebaseServices fbs;
    private Object gender;
    private Object ageRange;
    private Object budget;
    private Object interest;

    public static AddGiftFragment newInstance(String param1, String param2) {
        AddGiftFragment fragment = new AddGiftFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }
    private final ActivityResultLauncher<String> pickImage=
            registerForActivityResult(new ActivityResultContracts.GetContent(), uri-> {
                if (uri != null) {
                    Object Uri = null;
                    Object selectImageUri = Uri;

                    logo.setImageURI(uri);
                }
            });

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_gift, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        init();

    }

    private void init() {
        fbs = FirebaseServices.getInstance();
        gender = view.findViewById(R.id.gender);
        ageRange= view.findViewById(R.id.ageRange);
        interest = view.findViewById(R.id.interest);
        budget= view.findViewById(R.id.budget);
        logo= view.findViewById(R.id.logo);
        btnAdd= view.findViewById(R.id.btnAdd);



    }


}