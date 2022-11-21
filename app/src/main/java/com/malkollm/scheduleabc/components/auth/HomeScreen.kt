package com.malkollm.scheduleabc.components.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.malkollm.scheduleabc.Screen
import com.malkollm.scheduleabc.ui.theme.Gray200
import com.malkollm.scheduleabc.ui.theme.Purple200

@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Schedule.route)
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
        Header()
        Spacer(modifier = Modifier.padding(bottom = 25.dp))
        Lesson()
    }
}

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Purple200)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp)
        ) {
            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = "Понедельник",
                fontSize = 20.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.padding(end = 5.dp))
            Text(
                text = "16.11.2022",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun Lesson() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Gray200)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                Modifier.weight(0.5f),
//                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "8:30",
                    fontSize = 14.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.padding(bottom = 5.dp))
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "9:15",
                    fontSize = 14.sp,
                    color = Color.Black
                )
            }
            Column(
                modifier = Modifier.padding(start = 15.dp).weight(0.5f)
            ) {
                Divider(
                    color = Color.Blue,
                    modifier = Modifier
                        .height(55.dp)
                        .width(7.dp)
                )
            }
            Column (
                Modifier.weight(1.5f)
            ){
                Text(
//                    modifier = Modifier.padding(start = 15.dp),
                    text = "Физика",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.padding(bottom = 5.dp))
                Text(
//                    modifier = Modifier.padding(start = 15.dp),
                    text = "Лаборатория",
                    fontSize = 16.sp,
                    color = Color.Black
                )
            }
            Column(
                Modifier.weight(2.5f),
                horizontalAlignment = Alignment.End
            ) {
                Icon(
                    modifier = Modifier.padding(end = 10.dp),
                    imageVector = Icons.Default.Done,
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.padding(bottom = 10.dp))
                Text(
                    modifier = Modifier.padding(end = 5.dp),
                    text = "Марсель Саматович",
                    fontSize = 16.sp,
                    color = Color.Black
                )
            }
        }
    }
}