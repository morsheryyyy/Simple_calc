package com.kovalenko.simple_calc

import android.content.Intent
import com.kovalenko.simple_calc.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var answer = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plusButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "+"
                val number = binding.editText.text.toString().toFloat()
                answer += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.minusButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "-"
                val number = binding.editText.text.toString().toFloat()
                answer += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.multiplyButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "*"
                val number = binding.editText.text.toString().toFloat()
                answer += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.divideButton.setOnClickListener {
            if (binding.editText.text.isNotEmpty()) {
                val sign = "-"
                val number = binding.editText.text.toString().toFloat()
                answer += "$number$sign"
                binding.resultTextView.text = "${binding.resultTextView.text} $number $sign"
            } else {
                Toast.makeText(this@MainActivity, "Напишіть число!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.clearButton.setOnClickListener {
            answer = ""
            binding.resultTextView.text = ""
        }
        binding.calculateButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            if (binding.editText.text.isNotEmpty()) {
                val lastNumber = binding.editText.text.toString().toFloat()

                answer += "$lastNumber"

                intent.putExtra("answer", answer)
                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Напишіть ваше друге число", Toast.LENGTH_SHORT).show()
            }
        }

    }
}