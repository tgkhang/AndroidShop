package com.example.shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shop.ui.theme.ShopTheme

//TO DO on resume, on start, 

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Bundle in android is a key value map used to pass data between activity, fragment to save state
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //some config


        setContent {
            ShopTheme {


            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShopTheme {

    }
}