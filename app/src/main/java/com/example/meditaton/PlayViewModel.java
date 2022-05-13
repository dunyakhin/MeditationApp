package com.example.meditaton;

import android.app.Application;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.format.DateUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.meditaton.fragments.MeditationFragment;

public class PlayViewModel extends AndroidViewModel {
    //создаю 3 медиа плеера для воспроизведения 3 типов музыки
    MediaPlayer player1=MediaPlayer.create(getApplication(),R.raw.rain);
    MediaPlayer player2=MediaPlayer.create(getApplication(),R.raw.flame);
    MediaPlayer player3=MediaPlayer.create(getApplication(),R.raw.forrest);
    public MutableLiveData timerData=new MutableLiveData<String>();
    public long timer;
    public CountDownTimer cdt;
    public PlayViewModel(@NonNull Application application) {
        super(application);
        player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

            }
        });
    }
    //описываю в методе onPlay(звук_который_выбран_в_спиннере, время_выбранное_в_спиннере)
    //запуск музыки с таймером. Потом вызываю этот метод в MeditationFragment когда нажата кнопка Play
    public void onPlay(String sound, String time){
        switch(sound){
            case "Дождь":
                player1.start();
                startTimer(time);
                break;
            case "Огонь":
                player2.start();
                startTimer(time);
                break;
            case "Звуки леса":
                player3.start();
                startTimer(time);
                break;

        }

    }


//описываю в методе OnStop() остановку музыки и таймером, потом вызываю его в
    //MeditationFragment когда нажата кнопка stop или фрагмент с плеером и таймером закрывается
    public void onStop(String sound){
        try{
            cdt.cancel();
        } catch (Exception e) {
            e.printStackTrace();
        }
        timerData.postValue(" ");
        switch(sound){
            case "Дождь":
                player1.stop();
                try {
                    player1.prepare();
                    player1.seekTo(0);
                }
                catch (Throwable t) {
                }
                break;

            case "Огонь":
                player2.stop();
                try {
                    player2.prepare();
                    player2.seekTo(0);
                }
                catch (Throwable t) {
                }
                break;
            case "Звуки леса":
                player3.stop();
                try {
                    player3.prepare();
                    player3.seekTo(0);
                }
                catch (Throwable t) {
                }
                break;
        }

    }





//описываю работу таймера, назначаю время
    public void startTimer(String time){
        int millsinfuture;
        if(time=="2 минуты"){
            millsinfuture=120000;
        }else if(time=="5 минут"){
            millsinfuture=300000;
        }else {
            millsinfuture = 600000;
        }

        cdt=new CountDownTimer(millsinfuture,1000) {
            @Override
            public void onTick(long l) {
               timer=l/1000;
               timerData.setValue(DateUtils.formatElapsedTime(timer));

            }
            @Override
            public void onFinish() {
                timerData.setValue("");
            }
        }.start();
    }

}
