package com.example.liamreeveswesley

import android.content.Intent
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liamreeveswesley.ui.theme.LiamReevesWesleyTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.red),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
                )
        }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
            Text(text = "Register Now",
                color = Color.Green,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                modifier = Modifier


                )

        var name by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = name,
                onValueChange ={name =it},
                label = { Text("Enter your Name")},
                textStyle = TextStyle(Color.Cyan),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Cyan,
                    focusedLabelColor = Color.Cyan,
                    cursorColor = Color.Cyan,

                )
            )
            Spacer(modifier = Modifier.height(10.dp))

        var email by remember {
            mutableStateOf(TextFieldValue(""))

        }
        OutlinedTextField(value = email,
                 onValueChange ={email =it},
                 label = { Text("Enter your Email")},
                 textStyle = TextStyle(Color.Cyan),
                 keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Cyan,
                    focusedLabelColor = Color.Cyan,
                    cursorColor = Color.Cyan,

                )

        )
            Spacer(modifier = Modifier.height(10.dp))

        var phonenumber by remember {
            mutableStateOf(TextFieldValue(""))
        }

        OutlinedTextField(value = phonenumber,
                        onValueChange ={phonenumber =it},
                        label = { Text("Enter your Phone Number")},
                        leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription ="")},
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                                 unfocusedBorderColor = Color.Green,
                                 unfocusedLabelColor = Color.Green,
                                 focusedBorderColor = Color.Cyan,
                                focusedLabelColor = Color.Cyan,
                                cursorColor = Color.Cyan,
                )
            )
            Spacer(modifier = Modifier.height(10.dp))

        var location by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = location,
                        onValueChange = {location =it},
                        label = { Text("Enter your Location")},
                        leadingIcon = { Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")},
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Green,
                    unfocusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Cyan,
                    focusedLabelColor = Color.Cyan,
                    cursorColor = Color.Cyan,

                )
        )
            Spacer(modifier = Modifier.height(10.dp))



        var school by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(value = school,
                    onValueChange = {school = it},
                    label = { Text("Enter your School") },
                    leadingIcon ={ Icon(imageVector = Icons.Default.LocationOn, contentDescription ="" )},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Green,
                unfocusedLabelColor = Color.Green,
                focusedBorderColor = Color.Cyan,
                focusedLabelColor = Color.Cyan,
                cursorColor = Color.Cyan,

                )


              )
            Spacer(modifier = Modifier.height(10.dp))

                    










        
    }
   
}




