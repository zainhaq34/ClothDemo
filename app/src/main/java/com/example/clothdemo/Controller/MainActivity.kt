package com.example.clothdemo.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.clothdemo.Adapters.CategoryAdapter
import com.example.clothdemo.Model.Category
import com.example.clothdemo.R
import com.example.clothdemo.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize custom Adapter
        adapter = CategoryAdapter(this, DataServices.categories)
        // bind Adapter to Layout View
        categoryListView.adapter = adapter
    }
}
