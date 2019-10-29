package com.all.mam.popDialog

import android.content.Context
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.widget.ProgressBar
import android.widget.RelativeLayout

/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */


class PopProgressDialog(context: Context) : PopDialogBuilder<PopProgressDialog>(context) {

    private var progressBar: ProgressBar = findView(R.id.dialog_progress_bar)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)

    override val layout: Int
        get() = R.layout.dialog_progress

    init {
        setColoredCircle(R.color.dialogProgressBackgroundColor)
        setProgressBarColor(R.color.white)
    }

    fun setDialogBodyBackgroundColor(color: Int): PopProgressDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }

    fun setProgressBarColor(color: Int): PopProgressDialog {
        progressBar.indeterminateDrawable?.setColorFilter(ContextCompat.getColor(context!!, color), PorterDuff.Mode.SRC_IN)
        return this
    }
}
