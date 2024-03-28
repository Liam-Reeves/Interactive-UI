//package com.example.liamreeveswesley
//
//import android.content.Intent
//import android.graphics.drawable.shapes.OvalShape
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme
//
//class ProductsActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Products()
//        }
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun Products() {
//    Column(
//            modifier = Modifier
//                .background(Color.Black)
//                .fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally
//
//    ) {
//
//            Row(
//
//            ) {
//                Text("Home", color = Color.Green)
//                 Spacer(modifier = Modifier.width(10.dp),)
//
//                Text("About", color = Color.Green)
//                 Spacer(modifier = Modifier.width(10.dp))
//
//                Text("Portfolio",color = Color.Green)
//                    Spacer(modifier = Modifier.width(10.dp))
//
//                Text("FAQs", color = Color.Green)
//                    Spacer(modifier = Modifier.width(10.dp))
//
//
//            }
//
//                 Text("Welcome to E-Safari", fontSize = 40.sp, fontFamily = FontFamily.Cursive, fontStyle = FontStyle.Italic, color = Color.Cyan)
//
//                Text("Order your desired vehicle online", color = Color.Green, fontSize = 30.sp, fontFamily = FontFamily.Monospace, fontStyle = FontStyle.Normal)
//
//
//                val order = LocalContext.current
//                Button(onClick = {
//
//                    order.startActivity(Intent(order, MainActivity::class.java))
//
//                },
//                    colors = ButtonDefaults.buttonColors(Color.Blue),
//
//                    shape = RoundedCornerShape(5.dp)
//
//
//
//                    ) {
//
//                        Text("Order Now", color = Color.Green)
//
//
//                }
//
//
//
//
//
//
//
//    }
//
//}
//
//
//
