package com.example.clothdemo.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.*
import com.example.clothdemo.Adapters.CategoryAdapter
import com.example.clothdemo.Adapters.CategoryRecycleAdapter
import com.example.clothdemo.Model.Category
import com.example.clothdemo.R
import com.example.clothdemo.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize custom Adapter
        adapter = CategoryRecycleAdapter(this, DataServices.categories)
        // bind Adapter to Layout View
        categoryListView.adapter = adapter
        // Layout Manager
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener{adapterView, view, position: Int, id: Long ->
//
//            val category = DataServices.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title}", Toast.LENGTH_LONG).show()
//        }


    }
}



