package com.unicon.chartview

import android.graphics.Color

class ChartViewStyle(
    var backgroundColor: Int = Color.DKGRAY, // цвет фона
    var chartColor: Int = Color.WHITE, // цвет графика
    var borderColor: Int = Color.RED, // цвет рамки
    var textBackgroundColor: Int = Color.CYAN, // цвет фона у текста
    var textColor: Int = Color.BLACK, // цвет текста

    var borderWidth: Float = 4f, // толщина рамки
    var strokeWidth: Float = 8f, // толщина линий на графике

    var showValues: Boolean = true, // рисовать значения точек на графике
    var showBorder: Boolean = true // рисовать рамку
)