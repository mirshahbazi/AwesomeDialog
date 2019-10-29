package com.all.mam.popDg
/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.all.mam.popDialog.*
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnError.setOnClickListener { showErrorDialog() }

        btnInfo.setOnClickListener { showInfoDialog() }

        btnProgress.setOnClickListener { showProgressDialog() }

        btnWarning.setOnClickListener { showWarningDialog() }

        btnNotice.setOnClickListener { showNoticeDialog() }

        btnSuccess.setOnClickListener { showSuccessDialog() }
    }


    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }


    private fun showErrorDialog() {
        PopErrorDialog(this).setButtonText(getString(R.string.dialog_ok_button))
                .setMessage("سلام چطوری؟")
                .show()
    }

    private fun showInfoDialog() {
        PopInfoDialog(this).setPositiveButtonText(getString(R.string.dialog_ok_button))
                .setMessage("سلام چطوری؟")
                .show()
    }

    private fun showProgressDialog() {
        PopProgressDialog(this)
                .setMessage("سلام چطوری؟")
                .show()
    }

    private fun showWarningDialog() {
        PopWarningDialog(this).setButtonText(getString(R.string.dialog_ok_button))
                .setMessage("سلام چطوری؟")
                .show()
    }

    private fun showNoticeDialog() {
        PopNoticeDialog(this).setButtonText(getString(R.string.dialog_ok_button))
                .setMessage("سلام چطوری؟")
                .show()
    }

    private fun showSuccessDialog() {
        PopSuccessDialog(this).setPositiveButtonText(getString(R.string.dialog_ok_button)).show()
    }
}
