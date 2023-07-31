package com.example.listviewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.listviewtutorial.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String> arrNames=new ArrayList<>();
        arrNames.add("Raja");
        arrNames.add("Ram");
        arrNames.add("Mohan");
        arrNames.add("Roy");
        arrNames.add("Hari");
        arrNames.add("Bhole");
        arrNames.add("Rajat");
        arrNames.add("Raju");
        arrNames.add("Raghu");
        arrNames.add("Ravendra");
        arrNames.add("Raghav");
        arrNames.add("Ragada");
        arrNames.add("Rohan");
        arrNames.add("Rajat");
        arrNames.add("Raju");
        arrNames.add("Raghu");
        arrNames.add("Ravendra");
        arrNames.add("Raghav");
        arrNames.add("Ragada");
        arrNames.add("Rohan");
        ArrayAdapter<String> adapter=new ArrayAdapter(this,R.layout.simple_list_item_1,arrNames);
        binding.listview.setAdapter(adapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if(i==0)
                        Toast.makeText(MainActivity.this, "Working!!!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}