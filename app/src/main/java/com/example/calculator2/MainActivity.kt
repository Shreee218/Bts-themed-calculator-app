package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator2.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnAC.setOnClickListener {
            binding.IN.text=""
            binding.res.text=""
        }
        binding.btn1.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"1"
        }
        binding.btn2.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"2"
        }
        binding.btn3.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"3"
        }
        binding.btn4.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"4"
        }
        binding.btn5.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"5"
        }
        binding.btn6.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"6"
        }
        binding.btn7.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"7"
        }
        binding.btn8.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"8"
        }
        binding.btn9.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"9"
        }
        binding.btn0.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"0"
        }
        binding.btnAdd.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"+"
        }
        binding.btnSub.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"-"
        }
        binding.btnDiv.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"/"
        }
        binding.btnMul.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"*"
        }
        binding.btnDot.setOnClickListener {
            binding.IN.text=binding.IN.text.toString()+"."
        }
        binding.btnBC.setOnClickListener {
            val removedLast = binding.IN.text.toString().dropLast(1)
            binding.IN.text = removedLast
        }
        binding.btnEq.setOnClickListener {
            val exp=binding.IN.text.toString()
            val result= Expression(exp).calculate()
            if (result.isNaN()) {
                // Show Error Message
                binding.res.text = ""
            } else {
                // Show Result
                //binding.res.text = DecimalFormat("0.######").format(binding.res).toString()
                binding.res.text=result.toString()
            }
        }

    }
}