package com.aaamab.recyclerviewapp.ui.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aaamab.recyclerviewapp.R;
import com.aaamab.recyclerviewapp.adapters.ListAdapter;

import java.util.ArrayList;


public class ListScreen extends AppCompatActivity {

    ArrayList<String> listData ;
    ListAdapter listAdapter ;
    RecyclerView listRec ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        initialViews();

        listData = new ArrayList<>() ;


        listData.add("Mohamed");
        listData.add("AbdAllah");
        listData.add("Ahmed");
        listData.add("Youssef");
        listData.add("Khaled");
        listData.add("Abd Elrahman");

        listAdapter = new ListAdapter(listData ,ListScreen.this);
        listRec.setLayoutManager(new LinearLayoutManager(this));
        listRec.setAdapter(listAdapter);


    }

    private void initialViews() {
        listRec = findViewById(R.id.listRec);
    }
}