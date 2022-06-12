package com.example.glassmorphism

import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window,false)
        setContentView(R.layout.activity_main)

       var lin: LinearLayout =findViewById(R.id.linearLayout)
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.S){
            lin.setRenderEffect(RenderEffect.createBlurEffect(25F,25F,Shader.TileMode.CLAMP))
        }
    }
}