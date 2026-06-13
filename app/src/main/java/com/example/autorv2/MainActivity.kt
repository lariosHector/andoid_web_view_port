package com.example.autorv2

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

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
import androidx.compose.ui.viewinterop.AndroidView

import com.example.autorv2.ui.theme.AutorV2Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            AndroidView(
                factory = { context ->

                    WebView(context).apply {

                        settings.javaScriptEnabled = true
                        settings.domStorageEnabled = true

                        webViewClient = WebViewClient()

                        loadUrl("http://3.14.71.106:3000")
                    }
                }
            )
        }
    }
}