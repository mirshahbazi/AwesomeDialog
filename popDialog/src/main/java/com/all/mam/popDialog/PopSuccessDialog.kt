package com.all.mam.popDialog

import android.content.Context
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout

import com.all.mam.popDialog.interfaces.Closure

/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */


class PopSuccessDialog(context: Context) : PopDialogBuilder<PopSuccessDialog>(context) {

    private var positiveButton: Button? = findView(R.id.btDialogYes)
    private var negativeButton: Button? = findView(R.id.btDialogNo)
    private var doneButton: Button? = findView(R.id.btDialogDone)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)


    override val layout: Int
        get() = R.layout.dialog_success

    init {
        setColoredCircle(R.color.dialogSuccessBackgroundColor)
        setDialogIconAndColor(R.drawable.ic_success, R.color.white)
        setNegativeButtonbackgroundColor(R.color.dialogSuccessBackgroundColor)
        setPositiveButtonbackgroundColor(R.color.dialogSuccessBackgroundColor)
        setDoneButtonbackgroundColor(R.color.dialogSuccessBackgroundColor)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopSuccessDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setPositiveButtonClick(selectedYes: Closure?): PopSuccessDialog {
        positiveButton!!.setOnClickListener {
            selectedYes?.exec()
            hide()
        }
        return this
    }

    fun setNegativeButtonClick(selectedNo: Closure?): PopSuccessDialog {
        negativeButton!!.setOnClickListener {
            selectedNo?.exec()
            hide()
        }
        return this
    }

    fun setDoneButtonClick(selectedDone: Closure?): PopSuccessDialog {
        doneButton!!.setOnClickListener {
            selectedDone?.exec()
            hide()
        }
        return this
    }

    fun showPositiveButton(show: Boolean): PopSuccessDialog {
        if (positiveButton != null) {
            positiveButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun showNegativeButton(show: Boolean): PopSuccessDialog {
        if (negativeButton != null) {
            negativeButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun showDoneButton(show: Boolean): PopSuccessDialog {
        if (doneButton != null) {
            doneButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun setPositiveButtonbackgroundColor(buttonBackground: Int): PopSuccessDialog {
        if (positiveButton != null) {
            positiveButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }
        return this
    }

    fun setPositiveButtonTextColor(textColor: Int): PopSuccessDialog {
        if (positiveButton != null) {
            positiveButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
        }
        return this
    }

    fun setPositiveButtonText(text: String): PopSuccessDialog {
        if (positiveButton != null) {
            positiveButton!!.text = text
            positiveButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun setNegativeButtonbackgroundColor(buttonBackground: Int): PopSuccessDialog {
        if (negativeButton != null) {
            negativeButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }
        return this
    }

    fun setNegativeButtonText(text: String): PopSuccessDialog {
        if (negativeButton != null) {
            negativeButton!!.text = text
            negativeButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun setNegativeButtonTextColor(textColor: Int): PopSuccessDialog {
        if (negativeButton != null) {
            negativeButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
        }
        return this
    }

    fun setDoneButtonbackgroundColor(buttonBackground: Int): PopSuccessDialog {
        if (doneButton != null) {
            doneButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }
        return this
    }

    fun setDoneButtonText(text: String): PopSuccessDialog {
        if (doneButton != null) {
            doneButton!!.text = text
            doneButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun setDoneButtonTextColor(textColor: Int): PopSuccessDialog {
        if (doneButton != null) {
            doneButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
        }
        return this
    }
}
