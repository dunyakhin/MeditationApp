package com.example.meditaton.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.meditaton.R;

//список доп литературы

public class OthersLiterature extends Fragment {
Button mainQuestionBtn, redPiluleBtn, momAndChildBtn,iWantAHumanBtn,powerOfDisasterBtn;
Intent book;
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View literFragment= inflater.inflate(R.layout.fragment_others_literature, container, false);

    //по нажатию на элемент списка доп литературы
    //открывается ссылка в браузере моб. устройства
    //ниже описываю нажатие на каждый элемент доп литературы

        mainQuestionBtn=literFragment.findViewById(R.id.mainQuestionBtn);
        mainQuestionBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        book=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.litres.ru/andrey-kurpatov/glavnye-voprosy-zhizni-universalnye-pravila/chitat-onlayn/"));
        startActivity(book);
    }
});
redPiluleBtn=literFragment.findViewById(R.id.redPiluleBtn);
redPiluleBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        book=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.litres.ru/andrey-kurpatov/krasnaya-tabletka-posmotri-pravde-v-glaza/"));
        startActivity(book);
    }
});
momAndChildBtn=literFragment.findViewById(R.id.momAndChildBtn);
momAndChildBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        book=new Intent(Intent.ACTION_VIEW, Uri.parse("https://zen.yandex.ru/media/andreykurpatov/kak-emocionalnoe-sostoianie-materi-vliiaet-na-rebenka-627523d89d24f4044d357355"));
        startActivity(book);
    }
});
iWantAHumanBtn=literFragment.findViewById(R.id.iWantAHumanBtn);
iWantAHumanBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        book=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.psychologies.ru/story/menya-tyanet-k-cheloveku-no-ostanavlivaet-strakh-pokazatsya-navyazchivoi/"));
        startActivity(book);
    }
});
powerOfDisasterBtn=literFragment.findViewById(R.id.powerOfDisasterBtn);
powerOfDisasterBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        book=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.psychologies.ru/standpoint/sila-gorya-zachem-nujno-oplakivat-poteri/"));
        startActivity(book);
    }
});
        return literFragment;

    }
}