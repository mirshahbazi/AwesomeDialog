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


class PopInfoDialog(context: Context) : PopDialogBuilder<PopInfoDialog>(context) {

    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)
    private var positiveButton: Button? = null
    private var negativeButton: Button? = null
    private var neutralButton: Button? = null


    override val layout: Int
        get() = R.layout.dialog_info

    init {
        setColoredCircle(R.color.dialogInfoBackgroundColor)
        setDialogIconAndColor(R.drawable.ic_dialog_info, R.color.white)
        setPositiveButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
        setNegativeButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
        setNeutralButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
        setCancelable(true)
    }

    init {
        positiveButton = findView(R.id.btDialogYes)
        negativeButton = findView(R.id.btDialogNo)
        neutralButton = findView(R.id.btDialogNeutral)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopInfoDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)

        return this
    }

    fun setPositiveButtonClick(selectedYes: Closure?): PopInfoDialog {
        positiveButton!!.setOnClickListener {
            selectedYes?.exec()
            hide()
        }
        return this
    }

    fun setNegativeButtonClick(selectedNo: Closure?): PopInfoDialog {
        negativeButton!!.setOnClickListener {
            selectedNo?.exec()
            hide()
        }
        return this
    }

    fun setNeutralButtonClick(selectedNeutral: Closure?): PopInfoDialog {
        neutralButton!!.setOnClickListener {
            selectedNeutral?.exec()
            hide()
        }
        return this
    }


    fun setPositiveButtonbackgroundColor(buttonBackground: Int): PopInfoDialog {
        if (positiveButton != null) {
            positiveButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }

        return this
    }

    fun setPositiveButtonTextColor(textColor: Int): PopInfoDialog {
        if (positiveButton != null) {
            positiveButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
        }
        return this
    }

    fun setPositiveButtonText(text: String): PopInfoDialog {
        if (positiveButton != null) {
            positiveButton!!.text = text
            positiveButton!!.visibility = View.VISIBLE
        }

        return this
    }

    fun setNegativeButtonbackgroundColor(buttonBackground: Int): PopInfoDialog {
        if (negativeButton != null) {
            negativeButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }

        return this
    }

    fun setNegativeButtonText(text: String): PopInfoDialog {
        if (negativeButton != null) {
            negativeButton!!.text = text
        }
        return this
    }

    fun setNegativeButtonTextColor(textColor: Int): PopInfoDialog {
        if (negativeButton != null) {
            negativeButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
            negativeButton!!.visibility = View.VISIBLE
        }
        return this
    }

    fun setNeutralButtonbackgroundColor(buttonBackground: Int): PopInfoDialog {
        if (neutralButton != null) {
            neutralButton!!.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        }
        return this
    }

    fun setNeutralButtonText(text: String): PopInfoDialog {
        if (neutralButton != null) {
            neutralButton!!.text = text
        }
        return this
    }

    fun setNeutralButtonTextColor(textColor: Int): PopInfoDialog {
        if (neutralButton != null) {
            neutralButton!!.setTextColor(ContextCompat.getColor(context!!, textColor))
            neutralButton!!.visibility = View.VISIBLE
        }
        return this
    }
}
