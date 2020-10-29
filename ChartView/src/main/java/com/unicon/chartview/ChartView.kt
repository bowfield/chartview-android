package com.unicon.chartview

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import java.util.*
import kotlin.collections.ArrayList

class ChartView(_context: Context, _attrs: AttributeSet) : View(_context, _attrs) {
    val backColor = Color.WHITE
    val chartColor = Color.RED
    val borderColor = Color.BLACK

    val borderWidth = 4.0f
    val strokeWidth = 8f

    val values: ArrayList<Int> = ArrayList() // значения графика

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(canvas: Canvas) { // отрисовка
        paint.color = backColor
        paint.style = Paint.Style.FILL
        canvas.drawRect(0f, 0f, width + 0f, height + 0f, paint) // зарисовать фон

        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth
        canvas.drawRect(0f, 0f, width + 0f, height + 0f, paint) // нарисовать рамку

        // не рисовать если мало точек
        if(values.size < 2) return super.onDraw(canvas)

        paint.strokeWidth = strokeWidth
        paint.color = chartColor // цвет графика

        var old = values[0]
        var x = 0
        do {
            canvas.drawLine(
                (width / (values.size - 1)) * x + 0f,
                height - (height / (Collections.max(values))) * (old * 1f),
                (width / (values.size - 1)) * (x + 1f),
                height - (height / (Collections.max(values))) * (values[x + 1] * 1f),
                paint
            )

            x += 1
            old = values[x]
        } while (x < values.size - 1)
    }

    /* Отправить сигнал на перерисовку графика */
    fun update() {
        invalidate()
    }
}