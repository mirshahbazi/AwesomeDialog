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

class PopErrorDialog(context: Context) : PopDialogBuilder<PopErrorDialog>(context) {
    private var btDialogOk: Button = findView(R.id.btDialogOk)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)

    override val layout: Int
        get() = R.layout.dialog_error

    init {
        setColoredCircle(R.color.dialogErrorBackgroundColor)
        setDialogIconAndColor(R.drawable.ic_dialog_error, R.color.white)
        setButtonBackgroundColor(R.color.dialogErrorBackgroundColor)
        setCancelable(true)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopErrorDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setErrorButtonClick(selecteOk: Closure?): PopErrorDialog {
        btDialogOk.setOnClickListener {
            selecteOk?.exec()
            hide()
        }
        return this
    }

    fun setButtonBackgroundColor(buttonBackground: Int): PopErrorDialog {
        btDialogOk.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setButtonTextColor(textColor: Int): PopErrorDialog {
        btDialogOk.setTextColor(ContextCompat.getColor(context!!, textColor))
        return this
    }

    fun setButtonText(text: String): PopErrorDialog {
        btDialogOk.text = text
        btDialogOk.visibility = View.VISIBLE
        return this
    }
}
