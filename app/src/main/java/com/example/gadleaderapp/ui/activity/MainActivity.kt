package com.example.gadleaderapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gadleaderapp.R
import com.example.gadleaderapp.ui.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init() {
        viewPager.adapter = PagerAdapter(supportFragmentManager, this)
        tabLayout.setupWithViewPager(viewPager)
        submitButton.setOnClickListener {
            startActivity(Intent(this, SubmissionActivity::class.java))
        }
    }
}