package com.medialink.deco17broadcastreceiver

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sms_receiver.*

class SmsReceiverActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_SMS_NO = "EXTRA_SMS_NO"
        const val EXTRA_SMS_MESSAGE = "EXTRA_SMS_MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)

        title = getString(R.string.incoming_message)
        btn_close.setOnClickListener(this)

        val senderNo = intent.getStringExtra(EXTRA_SMS_NO)
        val senderMessage = intent.getStringExtra(EXTRA_SMS_MESSAGE)

        tv_from.text = getString(R.string.coming_from) + " : " + senderNo
        tv_message.text = senderMessage

    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_close) {
            finish()
        }
    }
}
