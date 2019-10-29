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


class PopWarningDialog(context: Context) : PopDialogBuilder<PopWarningDialog>(context) {
    private var btDialogOk: Button = findView(R.id.btDialogOk)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)

    override val layout: Int
        get() = R.layout.dialog_warning

    init {
        setColoredCircle(R.color.dialogWarningBackgroundColor)
        setDialogIconAndColor(R.drawable.ic_dialog_warning, R.color.black)
        setButtonBackgroundColor(R.color.dialogWarningBackgroundColor)
        setCancelable(true)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopWarningDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }


    fun setWarningButtonClick(selecteOk: Closure?): PopWarningDialog {
        btDialogOk.setOnClickListener {
            selecteOk?.exec()
            hide()
        }
        return this
    }

    fun setButtonBackgroundColor(buttonBackground: Int): PopWarningDialog {
        btDialogOk.background?.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setButtonTextColor(textColor: Int): PopWarningDialog {
        btDialogOk.setTextColor(ContextCompat.getColor(context!!, textColor))
        return this
    }

    fun setButtonText(text: String): PopWarningDialog {
        btDialogOk.text = text
        btDialogOk.visibility = View.VISIBLE
        return this
    }
}
