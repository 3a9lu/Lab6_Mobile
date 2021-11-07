package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_show_pic)

        button.setOnClickListener {
            intent = Intent(this, PicActivity::class.java)
            intent.putExtra("picLink", "https://funart.pro/uploads/posts/2021-08/1627784202_23-funart-pro-p-medved-grizli-chernii-zhivotnie-krasivo-fo-33.jpg")
            startActivity(intent)
        }
    }
}
