package com.example.cailizhen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnTouchListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.setOnTouchListener(this)
    }
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.__mk1_6ayaf_bes1e3imhc0a)
        } else if (event?.action == MotionEvent.ACTION_UP) {
            img.setImageResource(R.drawable._7a4db43dd089551028b4663)
        } else if (event?.action == MotionEvent.ACTION_MOVE) {
            img.setImageResource(R.drawable.fish_with_human_face_tik_tok_video)
        }
        return true
    }
}