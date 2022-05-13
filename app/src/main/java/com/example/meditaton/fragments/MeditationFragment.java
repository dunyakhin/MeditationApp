package com.example.meditaton.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.meditaton.PlayViewModel;
import com.example.meditaton.R;

import java.util.ArrayList;
import java.util.List;

public class MeditationFragment extends Fragment implements AdapterView.OnItemSelectedListener {
Spinner spinnerMin, spinnerSound; //спиннеры с возможностью выбора минут и звука
ImageButton play, stop; //кнопки стоп и пауза
ArrayAdapter <String> adapter;
PlayViewModel viewModel;
ViewModelProvider provider;
TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View meditation=inflater.inflate(R.layout.fragment_meditation,container,false);
        tv=meditation.findViewById(R.id.textView);

        //спиннер для минут
        spinnerMin=meditation.findViewById(R.id.spinnerMinutes);
        spinnerSound=meditation.findViewById(R.id.spinnerSound);
        String [] minutes=new String [] {"2 минуты","5 минут", "10 минут"};
        adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, minutes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMin.setAdapter(adapter);
        spinnerMin.setPrompt("Время");

        //спиннер для мелодий, , выбор варианта
        spinnerSound=meditation.findViewById(R.id.spinnerSound);
        String [] sounds=new String[]{"Дождь", "Огонь", "Звуки леса"};
        adapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, sounds);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerSound.setAdapter(adapter);
        spinnerSound.setPrompt("Тип звука");

        //создаю экземпляр ViewModel
        viewModel=new PlayViewModel(getActivity().getApplication());
        provider=new ViewModelProvider(this);
        viewModel=provider.get(PlayViewModel.class);
        provider.get(PlayViewModel.class);


        //нахожу кнопки
        play=meditation.findViewById(R.id.playBtn);
        stop=meditation.findViewById(R.id.stopBtn);
        //обозначаю что при запуске окна кнопка play активна, stop не активна
        play.setEnabled(true);
        stop.setEnabled(false);

        //нажимаю на кнопку play
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //после того как play нажата: play становится не активной, а stop активной
                //спиннеры тоже становятся не активными
                play.setEnabled(false);
                stop.setEnabled(true);
                spinnerSound.setEnabled(false);
                spinnerMin.setEnabled(false);
                //запускаю проигрывание музыки и таймер в зависимости от выбранной музыки и времени
                viewModel.onPlay(spinnerSound.getSelectedItem().toString(), spinnerMin.getSelectedItem().toString());

                //подключаю наблюдатель LiveData, реализованной во ViewModel
                provider.get(PlayViewModel.class).timerData.observe(getActivity(), new Observer() {
                   //тут описываю логику если время таймера заканчивается, то есть
                    //если содержимое livedata становится
                   // равное ничему (когда заканчивается время таймера), изменяется
                   // активность кнопок и спиннеров
                   //останавливаю воспроизведение музыки дергая метод onStop() описанный
                   //во ViewModel
                    @Override
                    public void onChanged(Object o) {
                        tv.setText(o.toString());
                        if(o.toString()==""){
                            play.setEnabled(true);
                            stop.setEnabled(false);
                            spinnerSound.setEnabled(true);
                            spinnerMin.setEnabled(true);
                            viewModel.onStop(spinnerSound.getSelectedItem().toString());
                        }else{

                        }
                    }
                });

                }
        });

                //если наживаю на кнопку Stop
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //кнопку play активирую
                play.setEnabled(true);
                //кнопку stop деактивирую
                stop.setEnabled(false);
                // спиннеры снова активирую
                spinnerSound.setEnabled(true);
                spinnerMin.setEnabled(true);
                //останавливаю воспроизведение музыки дергая метод onStop() описанный
                //во ViewModel
                viewModel.onStop(spinnerSound.getSelectedItem().toString());
                //отключаю наблюдение за изменением таймера, отключаю таймер
                viewModel.timerData.removeObservers(getActivity());
                tv.setText(" ");

            }
        });
        return meditation;



    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    //если фрагмент с медитацией закрывается то воспроизведение музыки останавливается
    @Override
    public void onPause() {
        viewModel.onStop(spinnerSound.getSelectedItem().toString());

        super.onPause();

    }

}