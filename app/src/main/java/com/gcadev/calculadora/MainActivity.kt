package com.gcadev.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /*Objetos visuales que tengo que recuperar*/
    private var edtnumero1: EditText? = null
    private var edtnumero2: EditText? = null
    private var btnsumar: Button? = null
    private var btnrestar: Button? = null
    private var btnmultiplicar: Button? = null
    private var btndividir: Button? = null

    /*FIN*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtnumero1 = findViewById<View>(R.id.edtNumero1) as EditText
        edtnumero2 = findViewById<View>(R.id.edtNumero2) as EditText
        btnsumar = findViewById(R.id.btnSumar)
        btnsumar!!.setOnClickListener { /*AQUI*/
            val cadena1 = edtnumero1!!.text.toString()
            val cadena2 = edtnumero2!!.text.toString()
            val numero1 = cadena1.toFloat()
            val numero2 = cadena2.toFloat()
            val resultado = numero1 + numero2
            Toast.makeText(this@MainActivity, "El resultado de la suma es $resultado", Toast.LENGTH_SHORT).show()
        }
        edtnumero1 = findViewById<View>(R.id.edtNumero1) as EditText
        edtnumero2 = findViewById<View>(R.id.edtNumero2) as EditText
        btnrestar = findViewById(R.id.btnRestar)
        btnrestar!!.setOnClickListener { /*AQUI*/
            val cadena1 = edtnumero1!!.text.toString()
            val cadena2 = edtnumero2!!.text.toString()
            val numero1 = cadena1.toFloat()
            val numero2 = cadena2.toFloat()
            val resultado = numero1 - numero2
            Toast.makeText(this@MainActivity, "El resultado de la resta es $resultado", Toast.LENGTH_SHORT).show()
        }
        edtnumero1 = findViewById<View>(R.id.edtNumero1) as EditText
        edtnumero2 = findViewById<View>(R.id.edtNumero2) as EditText
        btnmultiplicar = findViewById(R.id.btnMultiplicar)
        btnmultiplicar!!.setOnClickListener { /*AQUI*/
            val cadena1 = edtnumero1!!.text.toString()
            val cadena2 = edtnumero2!!.text.toString()
            val numero1 = cadena1.toFloat()
            val numero2 = cadena2.toFloat()
            val resultado = numero1 * numero2
            Toast.makeText(this@MainActivity, "El resultado de la multiplicación es $resultado", Toast.LENGTH_SHORT).show()
        }
        edtnumero1 = findViewById<View>(R.id.edtNumero1) as EditText
        edtnumero2 = findViewById<View>(R.id.edtNumero2) as EditText
        btndividir = findViewById(R.id.btnDividir)
        btndividir!!.setOnClickListener { /*AQUI*/
            val cadena1 = edtnumero1!!.text.toString()
            val cadena2 = edtnumero2!!.text.toString()
            val numero1 = cadena1.toFloat()
            val numero2 = cadena2.toFloat()
            val resultado = numero1 / numero2
            Toast.makeText(this@MainActivity, "El resultado de la división es $resultado", Toast.LENGTH_SHORT).show()
        }
    }
}