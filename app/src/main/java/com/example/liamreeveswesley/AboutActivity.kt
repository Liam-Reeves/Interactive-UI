package com.example.liamreeveswesley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun About() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text("Your Trusted Partner", color = Color.Red)


        val cable = LocalContext.current
        Button(onClick = {
            cable.startActivity(Intent(cable, MainActivity::class.java))

        },
            ) {
            Text("Home Screen")
            
        }
    }

}

