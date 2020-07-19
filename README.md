## ChartView - Библиотека для рисования графиков в Android
![Пример](http://)

### Установка
Добавить файл [ChartView.kt](https://github.com/qbaddev/chartview-android/master/src/.../ChartView.kt) в проект

### Использование Layout
```xml
<com.unicon.ChartView
  android:layout_width="match_parent"
  android:layout_height="200dp"
  android:id="@+id/chartview"
  android:layout_margin="16dp"/>
```

### Использование Kotlin
```kotlin
chartview.chartColor = Color.RED // цвет графика
chartview.borderColor = Color.GREEN // цвет рамки
chartview.borderWidth = 6f // толщина рамки
chartview.scale = 10f // маштаб
chartview.values.add(10) // добавить значение
```
