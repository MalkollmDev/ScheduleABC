package com.malkollm.scheduleabc

sealed class Screen(val route: String){
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "signup_screen")
    object ResetPass: Screen(route = "reset_screen")
    object Home: Screen(route = "home_screen")
    object Schedule: Screen(route = "schedule_screen")
    object Detail: Screen(route = "detail_screen")
}
