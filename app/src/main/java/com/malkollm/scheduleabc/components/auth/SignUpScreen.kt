package com.malkollm.scheduleabc.components.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.navigation.NavController
import com.malkollm.scheduleabc.Screen
import com.malkollm.scheduleabc.ui.theme.Purple500
import com.malkollm.scheduleabc.ui.theme.ScheduleABCTheme

@Composable
fun SignUpScreen(
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
                CreateAccount(navController)
            }
        }
    }
}

@Composable
fun CreateAccount(navController: NavController) {
    Text(
        modifier = Modifier
            .padding(bottom = 20.dp),
        fontSize = 25.sp,
        text = "Создать профиль"
    )
    tfEmail()
    tfLastName()
    tfFirstName()
    tfMiddleName()
    MyContent()
    btnCreateAccount(navController)
}

//пока что запрос на создание профиля будет отправляться на почту администратору
@Composable
fun tfEmail() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
        onValueChange = {
        },
        enabled = false,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        label = { Text(text = "abc@gmail.com", fontSize = 20.sp) },
    )
}

@Composable
fun tfLastName() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        label = { Text(text = "Фамилия", fontSize = 20.sp) },
    )
}

@Composable
fun tfFirstName() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        label = { Text(text = "Имя", fontSize = 20.sp) },
    )
}

@Composable
fun tfMiddleName() {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp),
        shape = RoundedCornerShape(15),
        value = "",
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
        onValueChange = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        label = { Text(text = "Отчество", fontSize = 20.sp) },
    )
}

@Composable
fun btnCreateAccount(navController: NavController) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, bottom = 20.dp),
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
        Text("Отправить запрос", fontSize = 25.sp)
    }
}

@Composable
fun MyContent(){
    var mExpanded by remember { mutableStateOf(false) }
    val mCities = listOf("Ученик", "Учитель", "Родитель", "Прочий")
    var mSelectedText by remember { mutableStateOf("") }
    var mTextFieldSize by remember { mutableStateOf(Size.Zero)}

    val icon = if (mExpanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown

    Column(Modifier.padding(start = 15.dp, end = 15.dp, bottom = 20.dp)) {
        OutlinedTextField(
            value = mSelectedText,
            onValueChange = { mSelectedText = it },
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned { coordinates ->
                    mTextFieldSize = coordinates.size.toSize()
                },
            label = {Text("Кто вы?", fontSize = 20.sp)},
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "emailIcon") },
            trailingIcon = {
                Icon(icon,"contentDescription",
                    Modifier.clickable { mExpanded = !mExpanded })
            }
        )

        DropdownMenu(
            expanded = mExpanded,
            onDismissRequest = { mExpanded = false },
            modifier = Modifier
                .width(with(LocalDensity.current){mTextFieldSize.width.toDp()})
        ) {
            mCities.forEach { label ->
                DropdownMenuItem(onClick = {
                    mSelectedText = label
                    mExpanded = false
                }) {
                    Text(text = label)
                }
            }
        }
    }
}