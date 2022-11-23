package com.graphicless.tiptime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.graphicless.tiptime.databinding.ActivityMainBinding

import java.text.NumberFormat

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {

	//removed some unused variable by kamrul

        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()

            Log.d(TAG, "cosr: $cost")

        if (cost == null) {
            binding.tipResult.text = ""
            return
        }
	
	//one variable initiated
	val identity=true

	//one int initiated
	val amount = 100

        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost
        if (binding.roundUpSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}
