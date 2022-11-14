package com.malkollm.scheduleabc.components.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.malkollm.scheduleabc.Screen
import com.malkollm.scheduleabc.ui.theme.Purple500
import com.malkollm.scheduleabc.ui.theme.ScheduleABCTheme

@Composable
fun ResetPassScreen(
    navController: NavController
) {
    ScheduleABCTheme {
        Surface(
            color = MaterialTheme.colors.background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PasswordReset(navController)
            }
        }
    }
}

@Composable
fun PasswordReset(navController: NavController) {
    Text(
        modifier = Modifier
            .padding(bottom = 20.dp),
        fontSize = 25.sp,
        text = "Восстановить пароль"
    )
    tfEmailReset()
    btnReset(navController)
}

@Composable
fun tfEmailReset() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, bottom = 20.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        label = { Text(text = "Email", fontSize = 20.sp) },
    )
}

@Composable
fun btnReset(navController: NavController) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        onClick = {
            navController.navigate(route = Screen.Login.route)
        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Purple500,
            contentColor = Color.White
        )
    )
    {
        Text("Сбросить", fontSize = 25.sp)
    }
}