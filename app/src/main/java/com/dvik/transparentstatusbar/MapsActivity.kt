package com.dvik.transparentstatusbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MapsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        makeStatusBarTransparent()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.content_container)) { _, insets ->
            findViewById<FloatingActionButton>(R.id.fab1).setMarginTop(insets.systemWindowInsetTop)
            findViewById<FloatingActionButton>(R.id.fab2).setMarginTop(insets.systemWindowInsetTop)
            insets.consumeSystemWindowInsets()
        }

    }


}
