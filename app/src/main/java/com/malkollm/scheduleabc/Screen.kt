package com.malkollm.scheduleabc

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Login: Screen(route = "login_screen")
    object Detail: Screen(route = "detail_screen")
}
