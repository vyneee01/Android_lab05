package com.example.lab05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.ip16,R.drawable.ip15,R.drawable.ip14,R.drawable.ip13,R.drawable.ip12,R.drawable.ip11};
    String namephone[]={"Iphone 16 ProMax","Iphone 15 ProMax","Iphone 14 ProMax","Iphone 13 ProMax","Iphone 12 ProMax","Iphone 11 ProMax"};
    //Khai báo listView
    ArrayList<phone> myList;
    MyArrayAdapter myadapter;
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lv1= findViewById(R.id.lv1);
        myList = new ArrayList<>();// Tạo mới mảng rỗng
        for (int i =0 ; i <namephone.length;i++){
            myList.add(new phone(image[i],namephone[i]));
        }
        myadapter = new MyArrayAdapter(MainActivity.this , R.layout.layout_item, myList);
        lv1.setAdapter(myadapter);

        // Xử lý click
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent myintent = new Intent(MainActivity.this , SubActivity.class);
                myintent.putExtra("name",namephone[i]);
                startActivity(myintent);
            }
        });
    }


    //anh xa

}