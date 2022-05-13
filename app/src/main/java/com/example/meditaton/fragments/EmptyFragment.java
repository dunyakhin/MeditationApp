package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meditaton.PlayViewModel;
import com.example.meditaton.R;


public class EmptyFragment extends Fragment {
//фрагмент заглушка на место которого потом встает фрагмент с плеером-медитацией

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_empty, container, false);
    }


}