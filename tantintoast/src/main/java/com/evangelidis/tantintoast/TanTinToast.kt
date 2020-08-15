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

    class Normal(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.normal_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Normal {
            layout.normal_toast_message.text = message
            return this
        }

        fun typeface(typeface: Typeface?): Normal {
            layout.normal_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Normal {
            toast.duration = millis
            return this
        }

        fun show(): Normal {
            toast.view = layout
            toast.show()
            return this
        }
    }

    class Error(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.error_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Error {
            layout.error_toast_message.text = message
            return this
        }

        fun textSize(dpSize: Int): Error {
            layout.error_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun typeface(typeface: Typeface?): Error {
            layout.error_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Error {
            toast.duration = millis
            return this
        }

        fun show(): Error {
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
            return this
        }
    }

    class Info(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.info_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Info {
            layout.info_toast_message.text = message
            return this
        }

        fun textSize(dpSize: Int): Info {
            layout.info_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun typeface(typeface: Typeface?): Info {
            layout.info_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Info {
            toast.duration = millis
            return this
        }

        fun show(): Info {
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }

    class Success(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.success_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Success {
            layout.success_toast_message.text = message
            return this
        }

        fun textSize(dpSize: Int): Success {
            layout.success_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun typeface(typeface: Typeface?): Success {
            layout.success_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Success {
            toast.duration = millis
            return this
        }

        fun show(): Success {
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }

    class Custom(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.custom_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Custom {
            layout.custom_toast_message.text = message
            return this
        }

        fun textSize(dpSize: Int): Custom {
            layout.custom_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun icon(icon: Int): Custom {
            layout.custom_toast_image.visibility = View.VISIBLE
            layout.custom_toast_image.setBackgroundResource(icon)
            return this
        }

        fun background(background: Int): Custom {
            layout.toast_toast_background.setBackgroundResource(background)
            return this
        }

        fun textColor(color: Int): Custom {
            layout.custom_toast_message.setTextColor(color)
            return this
        }

        fun typeface(typeface: Typeface?): Custom {
            layout.custom_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Custom {
            toast.duration = millis
            return this
        }

        fun show(): Custom {
            toast.view = layout
            toast.show()
            return this
        }
    }

    class Warning(private val context: Context) {

        private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        private val layout = layoutInflater.inflate(R.layout.warning_toast_layout, null)
        private val toast = Toast(context.applicationContext)

        fun text(message: String): Warning {
            layout.warning_toast_message.text = message
            return this
        }

        fun textSize(dpSize: Int): Warning {
            layout.warning_toast_message.setTextSize(TypedValue.COMPLEX_UNIT_SP, dpSize.toFloat())
            return this
        }

        fun typeface(typeface: Typeface?): Warning {
            layout.warning_toast_message.typeface = typeface
            return this
        }

        fun time(millis: Int): Warning {
            toast.duration = millis
            return this
        }

        fun show(): Warning {
            toast.view = layout //setting the view of custom toast layout
            toast.show()
            return this
        }
    }
}