package myevents.almansa.unir.es.myevents.utils

import android.app.Activity
import android.widget.Toast

fun Activity.toast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()
}