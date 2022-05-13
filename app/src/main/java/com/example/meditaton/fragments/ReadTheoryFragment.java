package com.example.meditaton.fragments;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.meditaton.DataBaseHelper;
import com.example.meditaton.MainActivity;
import com.example.meditaton.PlayViewModel;
import com.example.meditaton.R;

public class ReadTheoryFragment extends Fragment {
    TextView titleTV, textTV;
    DataBaseHelper dataBaseHelper;
    SQLiteDatabase db;
    Cursor userCursor;

    MainActivity mainActivity;
    String title;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View readTheoryFragment=inflater.inflate(R.layout.fragment_read_theory, container, false);
        titleTV=readTheoryFragment.findViewById(R.id.titleTV);
        textTV=readTheoryFragment.findViewById(R.id.textTV);
        dataBaseHelper = new DataBaseHelper(getContext());
        db = dataBaseHelper.open();

        mainActivity= (MainActivity) getActivity();


        //получаю заголовок который мне передали из MainActivity и присваиваю его title, потом я буду по этому title искать текст в базе данных
        getParentFragmentManager().setFragmentResultListener("title", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                //вызываю метод mainActivity onTakeTitle() в который кладу наименование нажатой кнопки из списка Теория
                //данный метод передает заголовок в MainActivity, где уже в MainActivity я кладу этот заголовок в title1, title2 и тд в зависимости от нажатой кнопки
                mainActivity.onTakeTitle("Как следует дышать во время медитации");
                title=result.getString("title");
            }
        });
        getParentFragmentManager().setFragmentResultListener("title1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Как часто нужно медитировать");
                title=result.getString("title");

            }
        });
        getParentFragmentManager().setFragmentResultListener("title2", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Существуют ли научные доказательства пользы медитации");
                title=result.getString("title");
            }
        });
        getParentFragmentManager().setFragmentResultListener("title3", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Быть благодарным");
                title=result.getString("title");
            }
        });
        getParentFragmentManager().setFragmentResultListener("title4", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Реальны ли твои мысли");
                title=result.getString("title");
            }
        });
        getParentFragmentManager().setFragmentResultListener("title5", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Устойчивость к тревожности");
                title=result.getString("title");
            }
        });
        getParentFragmentManager().setFragmentResultListener("title6", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Дыхание животом");
                title=result.getString("title");

            }
        });
        getParentFragmentManager().setFragmentResultListener("title7", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                mainActivity.onTakeTitle("Принятие вещей такими какие они есть");
                title=result.getString("title");

            }
        });

        return readTheoryFragment;


    }

    @Override
    public void onResume() {
        super.onResume();
            // получаем элемент по заголовку title из бд
        userCursor = db.query(DataBaseHelper.TABLE, new String[]{DataBaseHelper.COLUMN_TEXT}, "title=?", new String[]{ title }, null, null, null, null);
        if(userCursor.moveToFirst()) {
            titleTV.setText(title);
            int textIndex = userCursor.getColumnIndex(DataBaseHelper.COLUMN_TEXT);
            textTV.setText(userCursor.getString(textIndex));
        }else{

        }


        }



}