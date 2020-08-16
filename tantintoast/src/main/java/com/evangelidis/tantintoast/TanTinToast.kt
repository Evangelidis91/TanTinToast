package com.evangelidis.tantintoast

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.evangelidis.tantintoast.databinding.*

class TanTinToast {

    companion object {
        const val LONG = 1
        const val SHORT = 0
    }

    class Normal(private val context: Context) {
        private val binding = NormalToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Normal {
            binding.normalToastMessage.text = message
            return this
        }

        fun typeface(typeface: Int): Normal {
            binding.normalToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun textColor(color: Int): Normal {
            binding.normalToastMessage.setTextColor(context.resources.getColor(color))
            return this
        }

        fun time(millis: Int): Normal {
            toast.duration = millis
            return this
        }

        fun show(): Normal {
            toast.view = binding.root
            toast.show()
            return this
        }
    }

    class Error(private val context: Context) {
        private val binding = ErrorToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Error {
            binding.errorToastMessage.text = message
            return this
        }

        fun textSize(spSize: Int): Error {
            binding.errorToastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, spSize.toFloat())
            return this
        }

        fun typeface(typeface: Int): Error {
            binding.errorToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun time(millis: Int): Error {
            toast.duration = millis
            return this
        }

        fun show(): Error {
            toast.view = binding.root
            toast.show()
            return this
        }
    }

    class Info(private val context: Context) {
        private val binding = InfoToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Info {
            binding.infoToastMessage.text = message
            return this
        }

        fun textSize(spSize: Int): Info {
            binding.infoToastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, spSize.toFloat())
            return this
        }

        fun typeface(typeface: Int): Info {
            binding.infoToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun time(millis: Int): Info {
            toast.duration = millis
            return this
        }

        fun show(): Info {
            toast.view = binding.root
            toast.show()
            return this
        }
    }

    class Success(private val context: Context) {
        private val binding = SuccessToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Success {
            binding.successToastMessage.text = message
            return this
        }

        fun textSize(spSize: Int): Success {
            binding.successToastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, spSize.toFloat())
            return this
        }

        fun typeface(typeface: Int): Success {
            binding.successToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun time(millis: Int): Success {
            toast.duration = millis
            return this
        }

        fun show(): Success {
            toast.view = binding.root
            toast.show()
            return this
        }
    }

    class Custom(private val context: Context) {
        private val binding = CustomToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Custom {
            binding.customToastMessage.text = message
            return this
        }

        fun textSize(spSize: Int): Custom {
            binding.customToastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, spSize.toFloat())
            return this
        }

        fun icon(icon: Int): Custom {
            binding.customToastImage.apply {
                setBackgroundResource(icon)
                visibility = View.VISIBLE
            }
            return this
        }

        fun background(backgroundColor: Int): Custom {
            val layerDrawable: LayerDrawable =
                binding.customToastBackground.background as LayerDrawable
            val bgShape = layerDrawable.findDrawableByLayerId(R.id.shape_id) as GradientDrawable
            bgShape.setColor(ContextCompat.getColor(context, backgroundColor))
            return this
        }

        fun textColor(color: Int): Custom {
            binding.customToastMessage.setTextColor(context.resources.getColor(color))
            return this
        }

        fun typeface(typeface: Int): Custom {
            binding.customToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun time(millis: Int): Custom {
            toast.duration = millis
            return this
        }

        fun show(): Custom {
            toast.view = binding.root
            toast.show()
            return this
        }
    }

    class Warning(private val context: Context) {
        private val binding = WarningToastLayoutBinding.inflate(LayoutInflater.from(context))
        private val toast = Toast(context)

        fun text(message: String): Warning {
            binding.warningToastMessage.text = message
            return this
        }

        fun textSize(spSize: Int): Warning {
            binding.warningToastMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, spSize.toFloat())
            return this
        }

        fun typeface(typeface: Int): Warning {
            binding.warningToastMessage.typeface = ResourcesCompat.getFont(context, typeface)
            return this
        }

        fun time(millis: Int): Warning {
            toast.duration = millis
            return this
        }

        fun show(): Warning {
            toast.view = binding.root
            toast.show()
            return this
        }
    }
}