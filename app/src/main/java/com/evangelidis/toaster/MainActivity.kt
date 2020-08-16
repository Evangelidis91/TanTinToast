package com.evangelidis.toaster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evangelidis.tantintoast.TanTinToast
import com.evangelidis.toaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            errorButton.setOnClickListener { displayErrorMessage() }
            customButton.setOnClickListener { displayCustomMessage() }
            infoButton.setOnClickListener { displayInfoMessage() }
            warningButton.setOnClickListener { displayWarningMessage() }
            normalButton.setOnClickListener { displayNormalMessage() }
            successButton.setOnClickListener { displaySuccessMessage() }
        }
    }

    private fun displaySuccessMessage() {
        TanTinToast.Success(this)
            .text("Success Toast")
            .show()
    }

    private fun displayNormalMessage() {
        TanTinToast.Normal(this)
            .text("Normal Toast")
            .show()
    }

    private fun displayWarningMessage() {
        TanTinToast.Warning(this)
            .text("Warning Toast")
            .time(TanTinToast.SHORT)
            .show()
    }

    private fun displayInfoMessage() {
        TanTinToast.Info(this)
            .text("Info Toast")
            .show()
    }

    private fun displayCustomMessage() {
        TanTinToast.Custom(this)
            .text("Custom Toast")
            .icon(R.drawable.ic_error)
            .background(R.color.colorPrimaryDark)
            .textColor(R.color.colorAccent)
            .time(TanTinToast.LONG)
            .typeface(R.font.montserrat)
            .show()
    }

    private fun displayErrorMessage() {
        TanTinToast.Error(this)
            .text("Error Toast")
            .time(TanTinToast.LONG)
            .show()
    }
}
