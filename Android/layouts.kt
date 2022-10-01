package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Welcome to Compose Camp","-Team GDSC")
                }
            }
        }
    }
}

@Composable
fun Greeting(greet:String,name: String) {
    /*Text(text = greet, modifier = Modifier.padding(top = 60.dp,start=10.dp), fontSize = 30.sp )
    Text(text = name, modifier = Modifier.padding(top = 110.dp, start = 250.dp),fontSize=25.sp)
     */
    //using row
    /*Row() {
        //content will be organised in a rw format
        Text(text = greet,fontSize=30.sp)
        Text(text = name,)
    }*/
    //using Column

    /*Column{
        Text(text = greet,)
        Text(text = name, modifier = Modifier.padding(start = 150.dp))
    }*/
    //we can use row in a column or column in a row
    Row{
        Column{
            Text(text = greet,)
            Text(text = name, modifier = Modifier.padding(start = 150.dp))
        }
        Text("By Shiva")
    }
}

@Preview(showBackground = true,
showSystemUi = true,)
@Composable
fun InitialPreview() {
    DemoTheme {
        Greeting("Welcome to Compose Camp","-Team GDSC")
    }
}