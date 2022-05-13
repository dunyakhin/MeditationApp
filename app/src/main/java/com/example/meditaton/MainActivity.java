package com.example.meditaton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.meditaton.fragments.DescriptionTestFragment;
import com.example.meditaton.fragments.ExercisesFragment;
import com.example.meditaton.fragments.MeditationFragment;
import com.example.meditaton.fragments.OthersLiterature;
import com.example.meditaton.fragments.ReadTheoryFragment;
import com.example.meditaton.fragments.RorschahFragment;
import com.example.meditaton.fragments.TheoryFragment;

public class MainActivity extends AppCompatActivity{
    ImageButton closeBtn, backButton1, backButton2, backbutton3, backbutton4, backbutton5;
    Button startTest,theory,exercises, others, meditation,test, howToBreathBtn, howOftenToMediateBtn,scienceProvesBtn, beGratitudeBtn, realityOfThoughtsBtn, resistanceToWorriesBtn, stomacheBreathBtn,thingsIsThingsBtn;
    PlayViewModel viewModel;
    ViewModelProvider provider;
    ArrayAdapter<String> adapter;
    Bundle bundle = new Bundle();
    DataBaseHelper dataBaseHelper;

   public static String titleOfBtn="title";
   public  int i=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        howToBreathBtn=findViewById(R.id.howToBreathBtn);
        howOftenToMediateBtn=findViewById(R.id.howOftenToMediateBtn);
        scienceProvesBtn=findViewById(R.id.scienceProvesBtn);
        beGratitudeBtn=findViewById(R.id.beGratitudeBtn);
        realityOfThoughtsBtn=findViewById(R.id.realityOfThoughtsBtn);
        resistanceToWorriesBtn=findViewById(R.id.resistanceToWorriesBtn);
        stomacheBreathBtn=findViewById(R.id.stomacheBreathBtn);
        thingsIsThingsBtn=findViewById(R.id.thingsIsThingsBtn);
        others=findViewById(R.id.othersBtn);


        theory = findViewById(R.id.theoryBtn);
        exercises = findViewById(R.id.exercisesBtn);
        meditation = findViewById(R.id.meditationBtn);
        test = findViewById(R.id.testBtn);
        closeBtn = findViewById(R.id.closeBtn);
        backButton1 = findViewById(R.id.backButton1);
        backButton2 = findViewById(R.id.backButton2);
        backbutton3=findViewById(R.id.backButton3);
        backbutton4=findViewById(R.id.backButton4);
        backbutton5=findViewById(R.id.backButton5);
        startTest=findViewById(R.id.startTest);

        viewModel=new PlayViewModel(getApplication());
        provider=new ViewModelProvider(this);
        viewModel=provider.get(PlayViewModel.class);
        provider.get(PlayViewModel.class);
        dataBaseHelper=new DataBaseHelper(this);
        dataBaseHelper.createDB();

    }


    //этот метод получает заголовок кнопки списка Теория который был нажат и затем передаёт этот заголовок для его поиска по бд
   public void onTakeTitle(String titleOfBtn){

                bundle.putString("title",titleOfBtn);
                bundle.putString("title1",titleOfBtn);
                bundle.putString("title2",titleOfBtn);
                bundle.putString("title3",titleOfBtn);
                bundle.putString("title4",titleOfBtn);
                bundle.putString("title5",titleOfBtn);
                bundle.putString("title6",titleOfBtn);
                bundle.putString("title7",titleOfBtn);

        }



        //метод обрабатывающий нажатия на кнопки и переключающий фрагменты
            public void onChange(View view) {

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                Fragment fragment;


                switch (view.getId()) {
                    case R.id.exercisesBtn:
                        ft.replace(R.id.main_fragment, new ExercisesFragment());
                        ft.addToBackStack(null);
                        break;
                    case R.id.theoryBtn:
                        ft.replace(R.id.main_fragment, new TheoryFragment());
                        ft.addToBackStack(null);
                        break;
                    case R.id.meditationBtn:
                        ft.replace(R.id.fragmentTestOrMedit, new MeditationFragment());
                        ft.addToBackStack(null);
                        break;
                    case R.id.closeBtn:
                       fm.popBackStackImmediate();
                       fm.isDestroyed();
                        break;
                    case R.id.backButton1:
                        fm.popBackStackImmediate();
                        break;
                    case R.id.backButton2:
                        fm.popBackStackImmediate();
                        break;
                    case R.id.backButton3:
                        fm.popBackStackImmediate();
                        break;
                    case R.id.backButton4:
                        fm.popBackStackImmediate();
                        break;
                    case R.id.backButton5:
                        fm.popBackStackImmediate();
                        break;
                    case R.id.testBtn:
                        ft.replace(R.id.RorOrMedFragment,new DescriptionTestFragment());
                        ft.addToBackStack(null);
                        break;
                    case R.id.startTest:
                        ft.replace(R.id.descrip_fragment, new RorschahFragment());
                        ft.addToBackStack(null);
                        break;
                    case R.id.othersBtn:
                        ft.replace(R.id.main_fragment, new OthersLiterature());
                        ft.addToBackStack(null);
                        break;
                    case R.id.howToBreathBtn:
                        fragment=new ReadTheoryFragment();
                        //вот тут кладу заголовок первой нажатой кнопки "как правильно дышать"
                        fm.setFragmentResult("title", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.howOftenToMediateBtn:
                        fragment=new ReadTheoryFragment();
                        //здесь передаю заголовок второй нажатой кнопки "как часто медитировать"
                        fm.setFragmentResult("title1", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.scienceProvesBtn:
                        fragment=new ReadTheoryFragment();
                        //по аналогии с предыдущими
                        fm.setFragmentResult("title2", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.beGratitudeBtn:
                        fragment=new ReadTheoryFragment();
                        fm.setFragmentResult("title3", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.realityOfThoughtsBtn:
                        fragment=new ReadTheoryFragment();
                        fm.setFragmentResult("title4", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.resistanceToWorriesBtn:
                        fragment=new ReadTheoryFragment();
                        fm.setFragmentResult("title5", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.stomacheBreathBtn:
                        fragment=new ReadTheoryFragment();
                        fm.setFragmentResult("title6", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;
                    case R.id.thingsIsThingsBtn:
                        fragment=new ReadTheoryFragment();
                        fm.setFragmentResult("title7", bundle);
                        ft.replace(R.id.theory_fragment, fragment);
                        ft.addToBackStack(null);
                        break;



                }
                ft.commit();
            }



}


