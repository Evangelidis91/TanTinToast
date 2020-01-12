package com.evangelidis.tantintoast

import android.content.Context
import android.graphics.Typeface
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast_layout.view.*
import kotlinx.android.synthetic.main.error_toast_layout.view.*
import kotlinx.android.synthetic.main.info_toast_layout.view.*
import kotlinx.android.synthetic.main.normal_toast_layout.view.*
import kotlinx.android.synthetic.main.success_toast_layout.view.*
import kotlinx.android.synthetic.main.warning_toast_layout.view.*

class TanTinToast {

    class NormalToast(private val context: Context){

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.normal_toast_layout, null)
        val toast = Toast(context.applicationContext)

        fun setText(message: String): NormalToast{
            layout.normal_toast_message.text = message
            return this
        }

        fun setTypeface(typeface: Typeface?): NormalToast{
            layout.normal_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): NormalToast{
            toast.duration = Toast.LENGTH_SHORT
            return this
        }

        fun show(): NormalToast{
            toast.view = layout
            toast.show()
            return this
        }
    }

    class ErrorToast(private val context: Context){

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.error_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun setText(message: String): ErrorToast{
            layout.error_toast_message.text = message
            return this
        }

        fun setTextSize(dpSize: Int): ErrorToast{
            layout.error_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun setTypeface(typeface: Typeface?): ErrorToast{
            layout.error_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): ErrorToast{
            toast.duration = millis
            return this
        }

        fun show(): ErrorToast{
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
            return this
        }
    }

    class InfoToast(private val context: Context){

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.info_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun setText(message: String): InfoToast{
            layout.info_toast_message.text = message
            return this
        }

        fun setTextSize(dpSize: Int): InfoToast{
            layout.info_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun setTypeface(typeface: Typeface?): InfoToast{
            layout.info_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): InfoToast{
            toast.duration = millis
            return this
        }

        fun show(): InfoToast{
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }

    class SuccessToast(private val context: Context){

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.success_toast_layout, null)

        private val toast = Toast(context.applicationContext)

        fun setText(message: String): SuccessToast{
            layout.success_toast_message.text = message
            return this
        }

        fun setTextSize(dpSize: Int): SuccessToast{
            layout.success_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun setTypeface(typeface: Typeface?): SuccessToast{
            layout.success_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): SuccessToast{
            toast.duration = millis
            return this
        }

        fun show(): SuccessToast{
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }

    class CustomToast(private val context: Context){

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.custom_toast_layout, null)
        val toast = Toast(context.applicationContext)

        fun setText(message: String): CustomToast{
            layout.custom_toast_message.text = message
            return this
        }

        fun setTextSize(dpSize: Int): CustomToast{
            layout.custom_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun setIcon(icon: Int): CustomToast{
            layout.custom_toast_image.visibility = View.VISIBLE
            layout.custom_toast_image.setBackgroundResource(icon)
            return this
        }

        fun setBackground(background: Int):CustomToast{
            layout.toast_toast_background.setBackgroundResource(background)
            return this
        }

        fun setTextColor(color: Int): CustomToast{
            layout.custom_toast_message.setTextColor(color)
            return this
        }

        fun setTypeface(typeface: Typeface?): CustomToast{
            layout.custom_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): CustomToast{
            toast.duration = millis
            return this
        }

        fun show(): CustomToast{
            toast.view = layout
            toast.show()
            return this
        }
    }

    class WarningToast(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.warning_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun setText(message: String): WarningToast {
            layout.warning_toast_message.text = message
            return this
        }

        fun setTextSize(dpSize: Int): WarningToast {
            layout.warning_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun setTypeface(typeface: Typeface?): WarningToast {
            layout.warning_toast_message.typeface = typeface
            return this
        }

        fun setTime(millis: Int): WarningToast {
            toast.duration = millis
            return this
        }

        fun show(): WarningToast {
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }
}