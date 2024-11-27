package com.lab3.data
import androidx.annotation.DrawableRes
import com.lab3.R
/**
 * ItemsData - singleton class (only one instance) can be the example of shared data source
 * You can get the data from this ItemsData object from any place in the code.
 */
object ItemsData {
    val itemsList = listOf(
        Item(1, "Гуцульська хата-музей", "Автентична гуцульська хата в Карпатах, де можна побачити життя та побут гуцулів минулих століть.", R.drawable.image1),
        Item(2, "Озеро Синевир", "Найбільше озеро Карпат, відоме як \"Морське око\" України, з мальовничими краєвидами та легендами.", R.drawable.image2),
        Item(3, "Печера Оптимістична", "Найдовша гіпсова печера у світі, розташована на Тернопільщині, яка приваблює спелеологів.", R.drawable.image3),
        Item(4, "Долина нарцисів", "Унікальний природний заповідник у Закарпатті, де щороку навесні квітнуть тисячі нарцисів.", R.drawable.image4),
        Item(5, "Тустань", "Древня наскельна фортеця в Карпатах, яка була важливим оборонним пунктом та частиною торгового шляху.", R.drawable.image5),
        Item(6, "Соляні шахти Стебника", "Історичний об’єкт у Львівській області, який розповідає про багатовіковий видобуток солі.", R.drawable.image6),
    )
}



// Item class
class Item(val id: Int, val title: String, val description: String, @DrawableRes val imageRes: Int)
