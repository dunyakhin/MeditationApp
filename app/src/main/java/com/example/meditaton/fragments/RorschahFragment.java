package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.meditaton.R;
//вот тут жестко нахардкодил, в этом фрагменте определяю все 100 радио-переключателей и объявляю счетчик result1
public class RorschahFragment extends Fragment implements View.OnClickListener {
    Button resultBtn, descripBtn;
RadioGroup group1,group2,group3,group4,group5,group6,group7,group8,group9,group10;
RadioButton firstRadioButton1,firstRadioButton2, firstRadioButton3, firstRadioButton4, firstRadioButton5, firstRadioButton6,firstRadioButton7,firstRadioButton8,firstRadioButton9, firstRadioButton10;
RadioButton thirdRadioButton1,thirdRadioButton2, thirdRadioButton3, thirdRadioButton4, thirdRadioButton5, thirdRadioButton6,thirdRadioButton7,thirdRadioButton8,thirdRadioButton9, thirdRadioButton10;
RadioButton secondRadioButton1,secondRadioButton2, secondRadioButton3, secondRadioButton4, secondRadioButton5, secondRadioButton6,secondRadioButton7,secondRadioButton8,secondRadioButton9, secondRadioButton10;
RadioButton fourthRadioButton1,fourthRadioButton2, fourthRadioButton3, fourthRadioButton4, fourthRadioButton5, fourthRadioButton6,fourthRadioButton7,fourthRadioButton8,fourthRadioButton9, fourthRadioButton10;
RadioButton fifthRadioButton1,fifthRadioButton2, fifthRadioButton3, fifthRadioButton4, fifthRadioButton5, fifthRadioButton6,fifthRadioButton7,fifthRadioButton8,fifthRadioButton9, fifthRadioButton10;
RadioButton sixthRadioButton1,sixthRadioButton2, sixthRadioButton3, sixthRadioButton4, sixthRadioButton5, sixthRadioButton6,sixthRadioButton7,sixthRadioButton8,sixthRadioButton9, sixthRadioButton10;
RadioButton seventhRadioButton1,seventhRadioButton2, seventhRadioButton3, seventhRadioButton4, seventhRadioButton5, seventhRadioButton6,seventhRadioButton7,seventhRadioButton8,seventhRadioButton9, seventhRadioButton10;
RadioButton eightRadioButton1,eightRadioButton2, eightRadioButton3, eightRadioButton4, eightRadioButton5, eightRadioButton6,eightRadioButton7,eightRadioButton8,eightRadioButton9, eightRadioButton10;
RadioButton ninthRadioButton1,ninthRadioButton2, ninthRadioButton3, ninthRadioButton4, ninthRadioButton5, ninthRadioButton6,ninthRadioButton7,ninthRadioButton8,ninthRadioButton9, ninthRadioButton10;
RadioButton tenthRadioButton1,tenthRadioButton2, tenthRadioButton3, tenthRadioButton4, tenthRadioButton5, tenthRadioButton6,tenthRadioButton7,tenthRadioButton8,tenthRadioButton9, tenthRadioButton10;
    public int result1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View testingFragment=inflater.inflate(R.layout.fragment_rorschah, container, false);

    group1=testingFragment.findViewById(R.id.group1);
    group2=testingFragment.findViewById(R.id.group2);
    group3 =testingFragment.findViewById(R.id.group3);
    group4 =testingFragment.findViewById(R.id.group4);
    group5 =testingFragment.findViewById(R.id.group5);
    group6 =testingFragment.findViewById(R.id.group6);
    group7 =testingFragment.findViewById(R.id.group7);
    group8 =testingFragment.findViewById(R.id.group8);
    group9 =testingFragment.findViewById(R.id.group9);
    group10 =testingFragment.findViewById(R.id.group10);

                firstRadioButton1=testingFragment.findViewById(R.id.firstRadioButton1);
                firstRadioButton2=testingFragment.findViewById(R.id.firstRadioButton2);
                firstRadioButton3=testingFragment.findViewById(R.id.firstRadioButton3);
                firstRadioButton4=testingFragment.findViewById(R.id.firstRadioButton4);
                firstRadioButton5=testingFragment.findViewById(R.id.firstRadioButton5);
                firstRadioButton6=testingFragment.findViewById(R.id.firstRadioButton6);
                firstRadioButton7=testingFragment.findViewById(R.id.firstRadioButton7);
                firstRadioButton8=testingFragment.findViewById(R.id.firstRadioButton8);
                firstRadioButton9=testingFragment.findViewById(R.id.firstRadioButton9);
                firstRadioButton10=testingFragment.findViewById(R.id.firstRadioButton10);

                secondRadioButton1=testingFragment.findViewById(R.id.secondRadioButton1);
                secondRadioButton2=testingFragment.findViewById(R.id.secondRadioButton2);
                secondRadioButton3=testingFragment.findViewById(R.id.secondRadioButton3);
                secondRadioButton4=testingFragment.findViewById(R.id.secondRadioButton4);
                secondRadioButton5=testingFragment.findViewById(R.id.secondRadioButton5);
                secondRadioButton6=testingFragment.findViewById(R.id.secondRadioButton6);
                secondRadioButton7=testingFragment.findViewById(R.id.secondRadioButton7);
                secondRadioButton8=testingFragment.findViewById(R.id.secondRadioButton8);
                secondRadioButton9=testingFragment.findViewById(R.id.secondRadioButton9);
                secondRadioButton10=testingFragment.findViewById(R.id.secondRadioButton10);

                thirdRadioButton1=testingFragment.findViewById(R.id.thirdRadioButton1);
                thirdRadioButton2=testingFragment.findViewById(R.id.thirdRadioButton2);
                thirdRadioButton3=testingFragment.findViewById(R.id.thirdRadioButton3);
                thirdRadioButton4=testingFragment.findViewById(R.id.thirdRadioButton4);
                thirdRadioButton5=testingFragment.findViewById(R.id.thirdRadioButton5);
                thirdRadioButton6=testingFragment.findViewById(R.id.thirdRadioButton6);
                thirdRadioButton7=testingFragment.findViewById(R.id.thirdRadioButton7);
                thirdRadioButton8=testingFragment.findViewById(R.id.thirdRadioButton8);
                thirdRadioButton9=testingFragment.findViewById(R.id.thirdRadioButton9);
                thirdRadioButton10=testingFragment.findViewById(R.id.thirdRadioButton10);

                fourthRadioButton1=testingFragment.findViewById(R.id.forthRadioButton1);
                fourthRadioButton2=testingFragment.findViewById(R.id.forthRadioButton2);
                fourthRadioButton3=testingFragment.findViewById(R.id.forthRadioButton3);
                fourthRadioButton4=testingFragment.findViewById(R.id.forthRadioButton4);
                fourthRadioButton5=testingFragment.findViewById(R.id.forthRadioButton5);
                fourthRadioButton6=testingFragment.findViewById(R.id.forthRadioButton6);
                fourthRadioButton7=testingFragment.findViewById(R.id.forthRadioButton7);
                fourthRadioButton8=testingFragment.findViewById(R.id.forthRadioButton8);
                fourthRadioButton9=testingFragment.findViewById(R.id.forthRadioButton9);
                fourthRadioButton10=testingFragment.findViewById(R.id.forthRadioButton10);

                fifthRadioButton1=testingFragment.findViewById(R.id.fifthRadioButton1);
                fifthRadioButton2=testingFragment.findViewById(R.id.fifthRadioButton2);
                fifthRadioButton3=testingFragment.findViewById(R.id.fifthRadioButton3);
                fifthRadioButton4=testingFragment.findViewById(R.id.fifthRadioButton4);
                fifthRadioButton5=testingFragment.findViewById(R.id.fifthRadioButton5);
                fifthRadioButton6=testingFragment.findViewById(R.id.fifthRadioButton6);
                fifthRadioButton7=testingFragment.findViewById(R.id.fifthRadioButton7);
                fifthRadioButton8=testingFragment.findViewById(R.id.fifthRadioButton8);
                fifthRadioButton9=testingFragment.findViewById(R.id.fifthRadioButton9);
                fifthRadioButton10=testingFragment.findViewById(R.id.fifthRadioButton10);

                sixthRadioButton1=testingFragment.findViewById(R.id.sixthRadioButton1);
               sixthRadioButton2=testingFragment.findViewById(R.id.sixthRadioButton2);
               sixthRadioButton3=testingFragment.findViewById(R.id.sixthRadioButton3);
               sixthRadioButton4=testingFragment.findViewById(R.id.sixthRadioButton4);
               sixthRadioButton5=testingFragment.findViewById(R.id.sixthRadioButton5);
               sixthRadioButton6=testingFragment.findViewById(R.id.sixthRadioButton6);
               sixthRadioButton7=testingFragment.findViewById(R.id.sixthRadioButton7);
               sixthRadioButton8=testingFragment.findViewById(R.id.sixthRadioButton8);
               sixthRadioButton9=testingFragment.findViewById(R.id.sixthRadioButton9);
               sixthRadioButton10=testingFragment.findViewById(R.id.sixthRadioButton10);

                seventhRadioButton1=testingFragment.findViewById(R.id.seventhRadioButton1);
                seventhRadioButton2=testingFragment.findViewById(R.id.seventhRadioButton2);
                seventhRadioButton3=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton4=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton5=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton6=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton7=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton8=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton9=testingFragment.findViewById(R.id.seventhRadioButton3);
                seventhRadioButton10=testingFragment.findViewById(R.id.seventhRadioButton3);

                eightRadioButton1=testingFragment.findViewById(R.id.eightRadioButton1);
               eightRadioButton2=testingFragment.findViewById(R.id.eightRadioButton2);
               eightRadioButton3=testingFragment.findViewById(R.id.eightRadioButton3);
               eightRadioButton4=testingFragment.findViewById(R.id.eightRadioButton4);
               eightRadioButton5=testingFragment.findViewById(R.id.eightRadioButton5);
               eightRadioButton6=testingFragment.findViewById(R.id.eightRadioButton6);
               eightRadioButton7=testingFragment.findViewById(R.id.eightRadioButton7);
               eightRadioButton8=testingFragment.findViewById(R.id.eightRadioButton8);
               eightRadioButton9=testingFragment.findViewById(R.id.eightRadioButton9);
               eightRadioButton10=testingFragment.findViewById(R.id.eightRadioButton10);

                ninthRadioButton1=testingFragment.findViewById(R.id.ninethRadioButton1);
                ninthRadioButton2=testingFragment.findViewById(R.id.ninethRadioButton2);
                ninthRadioButton3=testingFragment.findViewById(R.id.ninethRadioButton3);
                ninthRadioButton4=testingFragment.findViewById(R.id.ninethRadioButton4);
                ninthRadioButton5=testingFragment.findViewById(R.id.ninethRadioButton5);
                ninthRadioButton6=testingFragment.findViewById(R.id.ninethRadioButton6);
                ninthRadioButton7=testingFragment.findViewById(R.id.ninethRadioButton7);
                ninthRadioButton8=testingFragment.findViewById(R.id.ninethRadioButton8);
                ninthRadioButton9=testingFragment.findViewById(R.id.ninethRadioButton9);
                ninthRadioButton10=testingFragment.findViewById(R.id.ninethRadioButton10);

                tenthRadioButton1=testingFragment.findViewById(R.id.tenthRadioButton1);
               tenthRadioButton2=testingFragment.findViewById(R.id.tenthRadioButton2);
               tenthRadioButton3=testingFragment.findViewById(R.id.tenthRadioButton3);
               tenthRadioButton4=testingFragment.findViewById(R.id.tenthRadioButton4);
               tenthRadioButton5=testingFragment.findViewById(R.id.tenthRadioButton5);
               tenthRadioButton6=testingFragment.findViewById(R.id.tenthRadioButton6);
               tenthRadioButton7=testingFragment.findViewById(R.id.tenthRadioButton7);
               tenthRadioButton8=testingFragment.findViewById(R.id.tenthRadioButton8);
               tenthRadioButton9=testingFragment.findViewById(R.id.tenthRadioButton9);
               tenthRadioButton10=testingFragment.findViewById(R.id.tenthRadioButton10);
            descripBtn=testingFragment.findViewById(R.id.descripBtn);
            descripBtn.setOnClickListener(this);
        return testingFragment;
    }

    //в момент когда фрагмент исчезает с экрана, то есть нажимается кнопка показать результат, проверяем что пользователь выбрал в тесте
    //и если это ответы которые несут негативный окрас к счетчику result1 прибавляем 1 за каждый негативный ответ
    //после этого передаём итоговый результат этого счетчика в DescriptionTestFragment, который его ждет и отображает уже у себя среди текста
    @Override
    public void onStop() {
        result1 = 0;
        if (firstRadioButton2.isChecked() || firstRadioButton6.isChecked() || firstRadioButton8.isChecked() || firstRadioButton9.isChecked()) {
            result1++;
        } else {
        }
        if (secondRadioButton1.isChecked() || secondRadioButton4.isChecked() || secondRadioButton6.isChecked() || secondRadioButton9.isChecked()) {
            result1++;
        } else {
        }
        if (thirdRadioButton2.isChecked() || thirdRadioButton4.isChecked() || thirdRadioButton5.isChecked() || thirdRadioButton7.isChecked()) {
            result1++;
        } else {
        }
        if (fourthRadioButton2.isChecked() || fourthRadioButton3.isChecked() || fourthRadioButton5.isChecked() || fourthRadioButton9.isChecked()) {
            result1++;
        } else {
        }
        if (fifthRadioButton2.isChecked() || fifthRadioButton4.isChecked() || fifthRadioButton7.isChecked() || fifthRadioButton8.isChecked()) {
            result1++;
        } else {
        }
        if (sixthRadioButton2.isChecked() || sixthRadioButton3.isChecked() || sixthRadioButton6.isChecked() || sixthRadioButton9.isChecked()) {
            result1++;
        } else {
        }
        if (seventhRadioButton1.isChecked() || seventhRadioButton4.isChecked() || seventhRadioButton6.isChecked() || seventhRadioButton8.isChecked()) {
            result1++;
        } else {
        }
        if (eightRadioButton2.isChecked() || eightRadioButton3.isChecked() || eightRadioButton6.isChecked() || eightRadioButton9.isChecked()) {
            result1++;
        } else {
        }
        if (ninthRadioButton1.isChecked() || ninthRadioButton4.isChecked() || ninthRadioButton5.isChecked() || ninthRadioButton8.isChecked()) {
            result1++;
        } else {
        }
        if (tenthRadioButton2.isChecked() || tenthRadioButton4.isChecked() || tenthRadioButton5.isChecked() || tenthRadioButton7.isChecked()) {
            result1++;
        } else {
        }
        //как раз передаю результат наружу
        Bundle result = new Bundle();
        result.putInt("result", result1);
        getParentFragmentManager().setFragmentResult("true", result);
        super.onStop();

    }
    //возвращаюсь к DescriptionTest который уже получил итоговый result1
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.descripBtn:
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.popBackStackImmediate();
                break;
        }

        }
    }




