package com.example.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener{
            var name = binding.etName.text.toString()
            var age = binding.etAge.text.toString().toInt()
            var country = binding.etCountry.text.toString()
            var person = Person(name,age,country)

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON",person)

                startActivity(it)
            }
        }
    }
}