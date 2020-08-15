package com.evangelidis.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.evangelidis.tantintoast.TanTinToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TanTinToast.Warning(this).show()

        TanTinToast.Success(this)
            .text("Success Toastgjhkf")
            .show()

    }
}
