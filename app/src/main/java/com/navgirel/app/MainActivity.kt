package com.navgirel.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.navgirel.app.R.id.t

class MainActivity : AppCompatActivity() {


    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var tool: Toolbar
    lateinit var navview:NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout=findViewById(R.id.drawerlayout)
        coordinatorLayout=findViewById(R.id.coordinatorlayout)
        tool=findViewById(R.id.tool)
        navview=findViewById(R.id.navview)
        setupactionbar()

    }



fun setupactionbar(){
    setSupportActionBar(findViewById(R.id.tool))
    supportActionBar?.title="TOY STORE"

}

}