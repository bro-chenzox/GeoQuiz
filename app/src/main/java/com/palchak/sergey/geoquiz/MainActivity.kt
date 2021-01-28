package com.palchak.sergey.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.doOnLayout
import com.palchak.sergey.geoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        trueButton = binding.trueButton
        falseButton = binding.falseButton

        trueButton.setOnClickListener {
            println("True button has been clicked!")
        }

        falseButton.setOnClickListener {
            println("False button has been clicked!")
        }
    }
}