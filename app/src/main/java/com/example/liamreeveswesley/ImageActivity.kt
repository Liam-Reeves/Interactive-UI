package com.example.liamreeveswesley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme

class ContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Image() {
    Column(

        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,


    ) {
        Image(painter = painterResource(id =R.drawable.baricho ) , contentDescription ="",
            modifier = Modifier
                .size(300.dp),
//                colorFilter = ColorFilter.tint(Color.Green)

        )

        Row {

            Text("Home", color = Color.Yellow , fontFamily = FontFamily.Cursive , fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.width(10.dp))

            Text("Products", color = Color.Yellow , fontFamily = FontFamily.Cursive , fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.width(10.dp))


            Text("About", color = Color.Yellow , fontFamily = FontFamily.Cursive , fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.width(10.dp))

            Text("Contact", color = Color.Yellow , fontFamily = FontFamily.Cursive , fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.height(10.dp))

        }

        Text("CourseCorrect", color = Color.Cyan, fontSize = 40.sp)
        Text("Your Trusted Tutor",  color = Color.Cyan, fontSize = 34.sp)


        val tutor = LocalContext.current
        Button(onClick = {tutor.startActivity(Intent(tutor, MainActivity::class.java))},
                colors = ButtonDefaults.buttonColors(Color.Cyan)

            ) {
                Text(text = "Start", color = Color.Black)

        }
        var jj = LocalContext.current
        var kk = AnnotatedString("CLick Me")
        ClickableText(text = kk, onClick =  {
            jj.startActivity(Intent(jj, MainActivity::class.java))
            
        })
            
        }

    }




