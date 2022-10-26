package com.kln.quizmuhamadzulfikar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customer = findViewById<EditText>(R.id.customerName)
        val paket = findViewById<RadioGroup>(R.id.paket)
        val beras = findViewById<CheckBox>(R.id.beras)
        val gula = findViewById<CheckBox>(R.id.gula)
        val mie = findViewById<CheckBox>(R.id.mie)
        val minyak = findViewById<CheckBox>(R.id.minyak)
        val teh = findViewById<CheckBox>(R.id.teh)
        val button = findViewById<Button>(R.id.pesan)
        val hasil = findViewById<TextView>(R.id.hasil)


        button.setOnClickListener{
            val isRadioChecked = paket.checkedRadioButtonId
            val makanan = findViewById<RadioButton>(isRadioChecked)

            val isBerasChecked = beras.isChecked
            val isGulaChecked = gula.isChecked
            val isMieChecked = mie.isChecked
            val isMinyakChecked = minyak.isChecked
            val isTehChecked = teh.isChecked

            val isBeras = isBerasChecked ?: "beras"
            val isgula = isBerasChecked ?: "Gula"
            val ismie = isBerasChecked ?: "Minyak"
            val isminyak = isBerasChecked ?: "Mie Instant"
            val isteh = isBerasChecked ?: "Teh"

            val order = "anda memesan : \n " + "${makanan.text}" + isBeras + isgula + ismie + isminyak +isteh

            hasil.text = order
        }
    }
}