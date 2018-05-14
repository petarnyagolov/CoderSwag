package com.example.pepoco.coderswag.Controller

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.pepoco.coderswag.Adapters.CategoryAdapter
import com.example.pepoco.coderswag.Model.Category
import com.example.pepoco.coderswag.R
import com.example.pepoco.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter
        categoryListView.setOnItemClickListener { adapterView, view, position, id ->  }
        
    }
    
}
