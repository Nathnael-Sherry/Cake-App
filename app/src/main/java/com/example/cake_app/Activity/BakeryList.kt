package com.example.cake_app.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.cake_app.R

class BakeryList : AppCompatActivity() {

    lateinit var mylistview:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakery_list)

        mylistview = findViewById(R.id.bakery_listview)

        val names = arrayOf("Wincer Cake House","Cake City", "Nillavee Cakes", "Le Grenier", "Tiramisu Bakery", "Artcaffe Bakery", "Alexandre Bakery", "Baker Inn", "Cold Stone Creamery", "Delish Bakery", "Sugarpie Bakery", "Tunu Bakeries", "Dr Chef's Bakery", "Jojo cake house", "Minnie's Bakery", "Hope Cakes", "Js Baking House", "Evory CupCakes Bakery")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        mylistview.adapter = arrayAdapter

        mylistview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Item Selected"+names[i], Toast.LENGTH_SHORT).show()

            var gotocakemain = Intent(this, MainActivity::class.java)
            startActivity(gotocakemain)
        }

    }
}