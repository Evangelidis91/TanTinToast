package com.evangelidis.toaster

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.evangelidis.tantintoast.TanTinToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TanTinToast.SuccessToast(this)
            .setText("Success Toast ")
            .show()
    }
}
