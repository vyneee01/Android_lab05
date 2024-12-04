package com.example.lab05;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<phone> {
    Activity context;
    int IdLayout;
    ArrayList<phone> myList;
    //tạo constructor để MainActivity gọi đến và truyền các tham số vào


    public MyArrayAdapter(MainActivity context, int  idLayout, ArrayList<phone> myList) {
        super(context, idLayout, myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }

    // Gọi hàm getView để sắp xếp dữu liệu

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Tạo để chứa layout
        LayoutInflater myflacter = context.getLayoutInflater();
        // Đặt layout lên để tạo thành view
        convertView = myflacter.inflate(IdLayout, null);
        // Lấy 1 phần tử trong mảng
        phone myphone = myList.get(position);
        //khai báo, tham chiếu Id và hiển thị lên ImageView
        ImageView img_phone = convertView.findViewById(R.id.img_phone);
        img_phone.setImageResource(myphone.getImage());
        // Khai báo , tham chiê id và hiển thị tên điện thoại lên textView
        TextView txt_phone = convertView.findViewById(R.id.txt_phone);
        txt_phone.setText(myphone.getNamephone());
        return convertView;
    }
}
