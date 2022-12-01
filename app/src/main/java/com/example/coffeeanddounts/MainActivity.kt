package com.example.coffeeanddounts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = coffeefragment()
        val secondFragment = dountfragment()
        val fragment1:Button =findViewById(R.id.bt1)
        val fragment2:Button =findViewById(R.id.bt2)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fra, firstFragment)
            commit()    }
        fragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fra, firstFragment)
                commit()
            }
        }
        fragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fra, secondFragment)
                commit()
            }
        }
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu to use in the action bar
     val inflater = menuInflater
     inflater.inflate(R.menu.my_first_coffee, menu)
     return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()

        }
       return true;
    }
}









