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


class PopNoticeDialog(context: Context) : PopDialogBuilder<PopNoticeDialog>(context) {
    private var btDialogOk: Button = findView(R.id.btDialogOk)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)

    override val layout: Int
        get() = R.layout.dialog_notice

    init {

        setColoredCircle(R.color.dialogNoticeBackgroundColor)
        setDialogIconAndColor(R.drawable.ic_notice, R.color.white)
        setButtonBackgroundColor(R.color.dialogNoticeBackgroundColor)
        setCancelable(true)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopNoticeDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setNoticeButtonClick(selecteOk: Closure?): PopNoticeDialog {
        btDialogOk.setOnClickListener {
            selecteOk?.exec()
            hide()
        }
        return this
    }

    fun setButtonBackgroundColor(buttonBackground: Int): PopNoticeDialog {
        btDialogOk.background.setColorFilter(ContextCompat.getColor(context!!, buttonBackground), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setButtonTextColor(textColor: Int): PopNoticeDialog {
        btDialogOk.setTextColor(ContextCompat.getColor(context!!, textColor))
        return this
    }

    fun setButtonText(text: String): PopNoticeDialog {
        btDialogOk.text = text
        btDialogOk.visibility = View.VISIBLE
        return this
    }
}
