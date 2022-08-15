package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StartANewPlan extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);
        Button btn = findViewById(R.id.imageButton);

        btn.setOnClickListener(this::additem);
        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(itemsAdapter);
        setupListViewListener();
    }

    private void setupListViewListener() {
        listView.setOnItemLongClickListener((adapterView, view, i, l) -> {
            Context context = getApplicationContext();
            Toast.makeText(context, "Item has been removed", Toast.LENGTH_LONG).show();
            items.remove(i);
            itemsAdapter.notifyDataSetChanged();
            return true;
        });
    }

    private void additem(View view) {
        EditText input = findViewById(R.id.editText2);
        String itemText = input.getText().toString();



        if(!(itemText.equals(""))){
            itemsAdapter.add(itemText);
            input.setText("");

        }
        else {
            Toast.makeText(getApplicationContext(), "please enter text", Toast.LENGTH_LONG).show();
        }

    }
}