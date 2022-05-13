package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.meditaton.R;


public class DescriptionTestFragment extends Fragment {
TextView tv;//отражает сначала описание теста, а потом после прохождения выводит результат
Button startTest; //кнопка начать тестирование
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View descriptionFragment=inflater.inflate(R.layout.fragment_description_test, container, false);
        tv=descriptionFragment.findViewById(R.id.tv);
        startTest=descriptionFragment.findViewById(R.id.startTest);
       return descriptionFragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //говорю что этот фрагмент ожидает какой то результат, в нашем случае количество ответов которые мы получим по результатам теста
        getParentFragmentManager().setFragmentResultListener("true", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String key, @NonNull Bundle bundle) {
                int result = bundle.getInt("result");//получаю результат тестирования в виде целого числа
                tv.setText("Итак, вы выбрали "+ result +" ответа (ов) из тех, какие часто давали люди с психическими расстройствами.\n" +
                            "\n" +
                            "Означает ли это что-нибудь?\n" +
                            "\n" +
                            "Согласно оригинальной инструкции к тесту, 4 и более совпадающих ответа могут свидетельствовать о возможных психических нарушениях."); //отображаю результат тестирования на экране среди общего текста
                }


        });
    }
}