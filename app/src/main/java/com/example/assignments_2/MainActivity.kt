package com.example.assignments_2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignments_2.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener{
            var rnd: Random = Random()
            var color = Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255))
            binding.mainActivity.setBackgroundColor(color)
        }

        binding.btnImage.setOnClickListener {
            var rnd: Random = Random()
            var color = Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255))
            it.setBackgroundColor(color)
        }
    }
}