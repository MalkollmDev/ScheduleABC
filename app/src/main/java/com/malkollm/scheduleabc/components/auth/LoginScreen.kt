package com.malkollm.scheduleabc.components.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.malkollm.scheduleabc.ui.theme.Purple500
import com.malkollm.scheduleabc.ui.theme.ScheduleABCTheme

@Composable
fun LoginScreen(
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
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Text(
        modifier = Modifier
            .padding(bottom = 20.dp),
        fontSize = 25.sp,
        text = "Авторизуйтесь"
    )
    TextFieldWithIcons()
    ButtonWithoutBorder()
    ButtonLogIn()
    ButtonOutlined()
}

@Composable
fun TextFieldWithIcons() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
        onValueChange = {
        },
        label = { Text(text = "Логин или email", fontSize = 20.sp) },
    )
}

@Composable
fun ButtonWithoutBorder() {
    TextButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        onClick = {}
    ) {
        Text(
            "Не помню",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Right,
            fontSize = 15.sp
        )
    }

}

@Composable
fun ButtonLogIn() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, bottom = 20.dp),
        shape = RoundedCornerShape(15),
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Purple500,
            contentColor = Color.White
        )
    )
    {
        Text("Войти", fontSize = 25.sp)
    }
}

@Composable
fun ButtonOutlined() {
    OutlinedButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        onClick = { },
        border = BorderStroke(1.dp, Color.Gray),
        shape = RoundedCornerShape(15), // = 50% percent
        // or shape = CircleShape
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Black
        )
    ) {
        Text(text = "Создать аккаунт", fontSize = 20.sp)
    }
}