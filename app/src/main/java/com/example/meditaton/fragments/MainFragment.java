package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.meditaton.R;

public class MainFragment extends Fragment{
//фрагмент с первым экраном
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View main=inflater.inflate(R.layout.fragment_main, container,false);

return main;
    }

}