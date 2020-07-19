## ChartView - Библиотека для рисования графиков в Android
![График](https://github.com/qbaddev/chartview-android/blob/master/image.jpg)

### Установка
Добавить файл [ChartView.kt](https://github.com/qbaddev/chartview-android/blob/master/ChartView.kt) в проект

### Использование Layout
```xml
<ChartView
  android:layout_width="match_parent"
  android:layout_height="200dp"
  android:id="@+id/chartview"
  android:layout_margin="16dp"/>
```

### Использование Kotlin
```kotlin
chartview.chartColor = Color.BLACK // цвет графика
chartview.borderColor = Color.GREEN // цвет рамки
chartview.borderWidth = 6f // толщина рамки
chartview.scale = 10f // маштаб
chartview.values.add(10) // добавить значение
```

### TODO
- [x] Рисование графиков
- [x] Горизонтальное маштабирование
- [ ] Вертикальное маштабирование
- [ ] Публикация в jitpack.io
- [ ] Мультиграфик
