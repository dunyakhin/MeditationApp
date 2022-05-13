package com.example.meditaton.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.meditaton.R;

public class ExercisesFragment extends Fragment {

//фрагмент отображающий 2 кнопки "медитация" и "тест Роршаха"
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View exerciseFragment=inflater.inflate(R.layout.fragment_exercises,container,false);

        return exerciseFragment;
    }
}