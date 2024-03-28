package com.example.liamreeveswesley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         Task()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Task() {
        LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row(
                    modifier = Modifier,
                        horizontalArrangement = Arrangement.Center
                ) {
                    Text("Current location",
                        color = Color.Gray,
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.SansSerif,


                        )
                        Spacer(modifier = Modifier.width(10.dp))
//                    androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.fly,
//
//                        ),
//                        contentDescription = "",
//                        contentScale = ContentScale.FillWidth
//                        )
                    
                }
                Spacer(modifier = Modifier.height(10.dp))
                        Text("Denpasar, Bali",
                            color = Color.Black
                        )
                    Spacer(modifier = Modifier.height(22.dp))
                LazyRow {
                    item{
                        Row(
                            modifier = Modifier,
                                horizontalArrangement = Arrangement.Center
                        ) {


                            val hotel = LocalContext.current
                            Button(onClick = {hotel.startActivity(Intent(hotel, MainActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color.Black),
                                ) {

                                androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.b),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(30.dp)
                                    )

                                Text("Hotels",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal)
//                                Icon(painter = painterResource(id = R.drawable.parrot),
//                                    contentDescription ="" )

                            }
                            Spacer(modifier =Modifier.width(80.dp) )

                            val holiday = LocalContext.current
                            Button(onClick = { holiday.startActivity(Intent(holiday, MainActivity::class.java)) },
                                colors = ButtonDefaults.buttonColors(Color.Cyan),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, Color.Black),
                                


                                ) {
                                androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.c),
                                    contentDescription ="",
                                    modifier = Modifier
                                        .size(30.dp)
                                    )
                                Text("Holiday",
                                    color = Color.Black,
                                    fontFamily = FontFamily.SansSerif,
                                    fontSize = 20.sp,
                                )

                            }


                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(30.dp))
                Row {

                    val taxi = LocalContext.current
                    Button(onClick = {taxi.startActivity(Intent(taxi, MainActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color.Black),

                        ) {

                            androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.c),
                                contentDescription ="",
                                modifier = Modifier
                                    .size(30.dp),

                                )
                            Text("Taxi",
                                color = Color.Black,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 20.sp,
                                )

                    }
                    Spacer(modifier =Modifier.width(80.dp) )
                    val ticket = LocalContext.current
                    Button(onClick = {ticket.startActivity(Intent(ticket, MainActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color.Black),


                        ) {
                        androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.boat),
                            contentDescription ="" ,
                            modifier = Modifier
                                .size(30.dp)
                            )

                        Text("Ticket",
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 20.sp,
                        )

                    }
                }
                Spacer(modifier =Modifier.height(30.dp) )
                Row {
                    val Airplane = LocalContext.current
                    Button(onClick = {Airplane.startActivity(Intent(Airplane, MainActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color.Black),



                        ) {
                        
                      androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.plane), 
                          contentDescription ="" ,
                          modifier = Modifier
                              .size(30.dp)
                      )
                        Text("Airplane",
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 20.sp,
                        )

                    }
                    Spacer(modifier =Modifier.width(80.dp) )
                    val harbour = LocalContext.current
                    Button(onClick = {harbour.startActivity(Intent(harbour, MainActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, Color.Black),

                        ) {
                        androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.a),
                            contentDescription ="",
                            modifier = Modifier
                                .size(30.dp)
                            )
                        Text("Harbour",
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif,
                            fontSize = 20.sp,
                        )

                    }

                }
                    Spacer(modifier = Modifier.height(50.dp))
                Row {
                    Text("Popular in town",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,

                        )
                    Spacer(modifier = Modifier.width(200.dp))
                    Text("View all",
                        color = Color.Cyan,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                    )


//                }
//                            Row(
//                               modifier = Modifier
//
//                           ) {
//                               androidx.compose.foundation.Image(
//                                   painter = painterResource(id = R.drawable.desert),
//                                   contentDescription =" ",
//                                   modifier = Modifier
//                                       .size(width = 10.dp,
//                                           height = 10.dp)
//                               )
//                               val Island = LocalContext.current
//                               Button(onClick = {Island.startActivity(Intent(Island, MainActivity::class.java))},
//                                   colors = ButtonDefaults.buttonColors(Color.White),
//                                   shape = RoundedCornerShape(10.dp),
//                                   border = BorderStroke(1.dp, Color.Black),
//
//
//
//                                   ) {
//                                   Text("Nusa Penida",
//                                       color = Color.Black,
//                                       fontSize = 20.sp,
//                                       fontFamily = FontFamily.SansSerif,
//                                       )
//
//                               }
//
//
//                           }


               }










            }

        }
    } }
  




