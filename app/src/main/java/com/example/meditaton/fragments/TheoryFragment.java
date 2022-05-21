package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.meditaton.MainActivity;
import com.example.meditaton.PlayViewModel;
import com.example.meditaton.R;

public class TheoryFragment extends Fragment {
    MainActivity mainActivity;
    Button howToBreathBtn, howOftenToMediateBtn,scienceProvesBtn, beGratitudeBtn, realityOfThoughtsBtn, resistanceToWorriesBtn, stomacheBreathBtn,thingsIsThingsBtn;

    //фрагмент отображающий список элементов Теория
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theoryFragment=inflater.inflate(R.layout.fragment_theory,container,false);
        howToBreathBtn=theoryFragment.findViewById(R.id.howToBreathBtn);
        howOftenToMediateBtn=theoryFragment.findViewById(R.id.howOftenToMediateBtn);
        scienceProvesBtn=theoryFragment.findViewById(R.id.scienceProvesBtn);
        beGratitudeBtn=theoryFragment.findViewById(R.id.beGratitudeBtn);
        realityOfThoughtsBtn=theoryFragment.findViewById(R.id.realityOfThoughtsBtn);
        resistanceToWorriesBtn=theoryFragment.findViewById(R.id.resistanceToWorriesBtn);
        stomacheBreathBtn=theoryFragment.findViewById(R.id.stomacheBreathBtn);
        thingsIsThingsBtn=theoryFragment.findViewById(R.id.thingsIsThingsBtn);
        mainActivity= (MainActivity) getActivity();
        return theoryFragment;

    }

    @Override
    public void onResume() {

        mainActivity.onTakeTitle(new String[]{
                howToBreathBtn.getText().toString(),
                howOftenToMediateBtn.getText().toString(),
                scienceProvesBtn.getText().toString(),
                beGratitudeBtn.getText().toString(),
                realityOfThoughtsBtn.getText().toString(),
                resistanceToWorriesBtn.getText().toString(),
                stomacheBreathBtn.getText().toString(),
                thingsIsThingsBtn.getText().toString()
        });


        super.onResume();
    }
}
