package com.unicon.chartview

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class ChartView(_context: Context, _attrs: AttributeSet) : View(_context, _attrs) {
    private var ctx = _context
    private var attrs = _attrs

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    var chartColor = Color.RED
    var borderColor = Color.BLACK

    var borderWidth = 4.0f
    var strokeWidth = 8f

    var scale = 12f

    var values: ArrayList<Int> = ArrayList()

    override fun onDraw(canvas: Canvas) {
        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawRect(Rect(0, 0, width, height), paint)

        // не рисовать если мало точек
        if(values.size < 2) return super.onDraw(canvas)

        paint.strokeWidth = strokeWidth

        var old = values[0]
        var x = 0
        do {
            paint.color = chartColor
            canvas.drawLine(
                (width / (values.size - 1)) * x + 0f,
                height - (old * scale),
                (width / (values.size - 1)) * (x + 1f),
                height - (values[x + 1] * scale),
                paint
            )

            x += 1
            old = values[x]
        } while (x < values.size - 1)

        super.onDraw(canvas)
    }
}