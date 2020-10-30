## ChartView - Библиотека для рисования графиков в Android
[![](https://jitpack.io/v/qbaddev/chartview-android.svg)](https://jitpack.io/#qbaddev/chartview-android) [![Open Source? Yes!](https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github)](https://github.com/ktxdev/chartview-android)<br>
![График](https://github.com/qbaddev/chartview-android/blob/master/image.jpg)

### Установка
Добавить в build.gradle который лежит в корне
```gradle
allprojects {
	repositories {
		//...
		maven { url 'https://jitpack.io' }
	}
}
```

Добавить зависимость
```gradle
dependencies {
	implementation 'com.github.qbaddev:chartview-android:1.8'
}
```


### Использование Layout
```xml
<com.unicon.chartview.ChartView
  android:layout_width="match_parent"
  android:layout_height="200dp"
  android:id="@+id/chartview"
  android:layout_margin="16dp"/>
```

### Использование Kotlin
```kotlin
// задать собственный стиль
chartview.style = ChartViewStyle(
    backgroundColor = Color.DKGRAY, // цвет фона
    chartColor = Color.WHITE, // цвет графика
    borderColor = Color.RED, // цвет рамки
    textBackgroundColor = Color.CYAN, // цвет фона у текста
    textColor = Color.BLACK, // цвет текста

    borderWidth = 4f, // толщина рамки
    strokeWidth = 8f, // толщина линий на графике

    showValues = true, // рисовать значения точек на графике
    showBorder = true // рисовать рамку
)

или

chartview.style.showBorder = false


chartview.values.add(10) // добавить значение (минимум 3)
chartview.update() // перерисовать график
```

### TODO
- [x] Рисование графиков
- [x] Горизонтальное маштабирование
- [x] Вертикальное маштабирование
- [x] Публикация в jitpack.io
- [ ] Мультиграфик
