package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentdemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var person = intent.getSerializableExtra("EXTRA_PERSON")


        var text = person.toString()

        binding.tvText.text = text
    }
}