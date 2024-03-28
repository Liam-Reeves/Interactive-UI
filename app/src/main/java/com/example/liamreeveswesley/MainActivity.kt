package com.example.liamreeveswesley

import android.content.Intent
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Home() {
    Column(
        Modifier
        //            .background(
        //                Color.Green
        //            )

            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Row() {
            Text("Chats")
            Spacer(modifier = Modifier.width(10.dp))

            Text("Updates")
            Spacer(modifier = Modifier.width(10.dp))


            Text("Communities")
            Spacer(modifier = Modifier.width(10.dp))

            Text("Calls")
            Spacer(modifier = Modifier.height(10.dp))


        }

//        Text("Powered by Reeves Tech Solutions",
//            fontSize = 37.sp,
//            modifier = Modifier
//                .background(Color.Red)
//           )

//
//            Text("Welcome To E-Fix", color = Color.Green, fontSize = 40.sp)
//
//            Text("Never Give up in coding", color = Color.Red, fontSize = 40.sp)


//            val about = LocalContext.current
//            Button(onClick = {
//                about.startActivity(Intent(about,
//                    ))
//            },
//                    colors = ButtonDefaults.buttonColors(Color.Green),
//
//                    shape = RoundedCornerShape(10.dp),
//
//                    border = BorderStroke(1.dp, Color.Red)
//
//                ) {
//                    Text("Safari Portal", color = Color.Magenta)
//
//            }
//                Spacer(modifier = Modifier.height(20.dp))
//
//                val aa = LocalContext.current
//                val bb = AnnotatedString("Click here to go home")
//
//                ClickableText(text = bb, onClick =  {
//                    aa.startActivity(Intent(aa, ImageActivity::class.java))
//        val aa = LocalContext.current
//        val bb = AnnotatedString("Register")
//
//        ClickableText(text = bb, onClick =  {
//            aa.startActivity(Intent(aa, InputActivity::class.java))

        val qq = LocalContext.current
        Text("Input",
            modifier =Modifier
                .clickable {
                    qq.startActivity(Intent(qq, AssignmentActivity::class.java))
                }

            )






    }}