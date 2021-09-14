package com.aaamab.recyclerviewapp.ui.List;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aaamab.recyclerviewapp.R;

import java.util.ArrayList;


public class ListScreen extends AppCompatActivity {

    ArrayList<String> listData ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        listData = new ArrayList<>() ;


        listData.add("Mohamed");
        listData.add("AbdAllah");
        listData.add("Ahmed");
        listData.add("Youssef");

    }
}