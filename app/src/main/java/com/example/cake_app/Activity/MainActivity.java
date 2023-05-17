package com.example.cake_app.Activity;

import android.icu.util.ULocale;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cake_app.Domain.CategoryDomain;
import com.example.cake_app.R;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewRecommendedList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_main);

        recyclerViewCategory();
        
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.view1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList=new ArrayList<>();
        categoryList.add(new CategoryDomain("cake1", "cat_1"));
        categoryList.add(new CategoryDomain("cake2", "cat_2"));
        categoryList.add(new CategoryDomain("cake3", "cat_3"));
        categoryList.add(new CategoryDomain("cake4", "cat_4"));
        categoryList.add(new CategoryDomain("cake5", "cat_5"));

        adapter=

    }
}
