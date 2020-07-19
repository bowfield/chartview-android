## ChartView - Библиотека для рисования графиков в Android
[![](https://jitpack.io/v/qbaddev/chartview-android.svg)](https://jitpack.io/#qbaddev/chartview-android)<br>
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
	implementation 'com.github.qbaddev:chartview-android:-SNAPSHOT'
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
chartview.chartColor = Color.BLACK // цвет графика
chartview.borderColor = Color.GREEN // цвет рамки
chartview.borderWidth = 6f // толщина рамки
chartview.scale = 10f // маштаб
chartview.values.add(10) // добавить значение (минимум 3)
```

### TODO
- [x] Рисование графиков
- [x] Горизонтальное маштабирование
- [ ] Вертикальное маштабирование
- [ ] Публикация в jitpack.io
- [ ] Мультиграфик
