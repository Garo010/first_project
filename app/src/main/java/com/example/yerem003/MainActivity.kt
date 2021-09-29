package com.example.yerem003

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.devofandroid.kotlinpractice.MyListAdapter

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListView()
        selectListViewItem()

    }

    fun setupListView() {
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()
        val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
        list.add(Model("Title One", "Description One...", R.mipmap.ic_launcher))
        list.add(Model("Title Two", "Description Two...", R.mipmap.ic_launcher_round))
        list.add(Model("Title Three", "Description Three...", R.mipmap.ic_launcher))
        list.add(Model("Title Four", "Description Four...", R.mipmap.ic_launcher_round))
        list.add(Model("Title Five", "Description Five...", R.mipmap.ic_launcher))

        listView.adapter = MyListAdapter(this, R.layout.row, list)
    }

    fun selectListViewItem() {

        listView.setOnItemClickListener { parent, view, position, id ->

            val editText = findViewById<ListView>(R.id.listView)
            val message = editText.toString()
            if (position == 0) {
               /* Toast.makeText(this@MainActivity, "Item One", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, Empty::class.java).apply {
                    putExtra(EXTRA_MESSAGE, message)
                }
                startActivity(intent)
                */

            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Item Two", Toast.LENGTH_SHORT).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Item Three", Toast.LENGTH_SHORT).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivity, "Item Four", Toast.LENGTH_SHORT).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "Item Five", Toast.LENGTH_SHORT).show()
            }
        }
    }
}