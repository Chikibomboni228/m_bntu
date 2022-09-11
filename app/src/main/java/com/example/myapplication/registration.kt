package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
class registration : AppCompatActivity() {
    private var registration_student_number:EditText? = null
    private var registration_student_personal_number:EditText? = null
    private var registration_enter:Button? = null
    private var registration_cannot_enter: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)
        registration_enter = findViewById(R.id.registration_enter)
        registration_cannot_enter = findViewById(R.id.registration_cannot_enter)
        registration_student_number = findViewById(R.id.registration_student_number)
        registration_student_personal_number = findViewById(R.id.registration_student_personal_number)
        registration_student_number?.setOnFocusChangeListener(View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                registration_student_number?.setHint("")

            } else {
                registration_student_number?.setHint(R.string.registration_student_number)

            }
        })
        registration_student_personal_number?.setOnFocusChangeListener(View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                registration_student_personal_number?.setHint("")

            } else {
                registration_student_personal_number?.setHint(R.string.registration_student_personal_number)

            }
        })
    }

    override fun onStart() {
        super.onStart()
        registration_enter?.setOnClickListener {
            var registration_student_number_text:String = registration_student_number?.text.toString().trim()
            var registration_student_personal_number_text:String = registration_student_personal_number?.text.toString().trim()

        }
        registration_cannot_enter?.setOnClickListener {
            val registration_cannot_enter_dialog: AlertDialog? = AlertDialog.Builder(this@registration).setView(R.layout.registration_cannot_enter_dialog).show()
        }
    }

}