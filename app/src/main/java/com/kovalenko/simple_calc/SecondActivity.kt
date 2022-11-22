package com.kovalenko.simple_calc
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder
import android.os.Bundle
import com.kovalenko.simple_calc.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.extras?.getString("answer")
        try {
            binding.resultTextView.text = ExpressionBuilder(result).build().evaluate().toString()
        } catch (e: Exception) {
            binding.resultTextView.text = "Результат неможливий!"
        }
    }
}