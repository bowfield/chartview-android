package com.unicon.chartviewtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chartview.chartColor = Color.BLACK // цвет графика
        chartview.borderColor = Color.GREEN // цвет рамки
        chartview.borderWidth = 6f // толщина рамки
        chartview.scale = 10f // маштаб

        chartview.values.add(10) // добавить значение
        chartview.values.add(5) // добавить значение
        chartview.values.add(14) // добавить значение
    }
}