package by.neco_lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import by.neco_lesson_2.R

class MainActivity : AppCompatActivity() {
    private var tvText: TextView? = null
    private var number: Byte = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        tvText?.setText(number.toString())
    }
}