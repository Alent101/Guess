package com.alent.guess

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_record.*

class RecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)
        val count = intent.getIntExtra("COUNTER", -1)
        tv_counter.setText(count.toString())
        //onClickListener
        btn_save.setOnClickListener { view ->
            val nick = ed_nickname.text.toString()
            getSharedPreferences("guess", Context.MODE_PRIVATE)
                .edit()
                .putInt("REC_COUNTER", count)
                .putString("REC_NICKNAME", nick)
                .apply()
        }
    }
}
