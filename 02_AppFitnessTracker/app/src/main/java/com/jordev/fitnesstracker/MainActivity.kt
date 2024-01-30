package com.jordev.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //private lateinit var btnImc: LinearLayout
    private lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 01) O layout XML
        // 02) A onde a recyclerView vai aparecer(Tela principal, tela cheia)
        // 03) Logica - Conectar o xml da celula dentro do recyclerView + a sua quantidade de elementos
        rvMain = findViewById(R.id.rv_main)

        /*// Verifica se a atividade tem uma barra de ação
        val actionBar = supportActionBar
        // Oculta a barra de ação
        actionBar?.hide()

       btnImc = findViewById(R.id.btn_imc)
        btnImc.setOnClickListener {
            // Navegar para proxima tela
            val intent = Intent(this, ImcActivity::class.java)
            startActivity(intent)
        }*/
    }


}