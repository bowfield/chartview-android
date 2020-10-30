package com.unicon.chartview

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import java.util.*
import kotlin.collections.ArrayList

class ChartView(_context: Context, _attrs: AttributeSet) : View(_context, _attrs) {
    var style = ChartViewStyle()

    val values: ArrayList<Int> = ArrayList() // значения графика

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    override fun onDraw(canvas: Canvas) { // отрисовка
        paint.textSize = 20f

        paint.color = style.backgroundColor
        paint.style = Paint.Style.FILL
        canvas.drawRect(0f, 0f, width + 0f, height + 0f, paint) // зарисовать фон

        if(style.showBorder) {
            paint.color = style.borderColor
            paint.style = Paint.Style.STROKE
            paint.strokeWidth = style.borderWidth
            canvas.drawRect(0f, 0f, width + 0f, height + 0f, paint) // нарисовать рамку
        }

        // не рисовать если мало точек
        if(values.size < 2) return super.onDraw(canvas)

        var old = values[0]
        var x = 0
        do {
            paint.strokeWidth = style.strokeWidth
            paint.color = style.chartColor // цвет графика

            canvas.drawLine(
                (width / (values.size - 1)) * x + 0f,
                height - (height / (Collections.max(values))) * (old * 1f),
                (width / (values.size - 1)) * (x + 1f),
                height - (height / (Collections.max(values))) * (values[x + 1] * 1f),
                paint
            )

            if(style.showValues) {
                paint.style = Paint.Style.FILL
                paint.color = style.textBackgroundColor

                canvas.drawRect(
                    (width / (values.size - 1)) * x - 2f,
                    height - (height / (Collections.max(values))) * (old * 1f) + 5f,
                    (width / (values.size - 1)) * x + 20f + 5f,
                    height - (height / (Collections.max(values))) * (old * 1f) - 20f,
                    paint
                )

                paint.color = style.textColor
                paint.strokeWidth = 1f
                canvas.drawText(
                    "${values[x]}",
                    (width / (values.size - 1)) * x + 0f,
                    height - (height / (Collections.max(values))) * (old * 1f),
                    paint
                )
            }

            x += 1
            old = values[x]
        } while (x < values.size - 1)
    }

    /* Отправить сигнал на перерисовку графика */
    fun update() {
        invalidate()
    }
}