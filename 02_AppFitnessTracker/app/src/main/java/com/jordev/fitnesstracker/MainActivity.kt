package com.jordev.fitnesstracker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //private lateinit var btnImc: LinearLayout
    private lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainItems = mutableListOf<MainItem>()
        mainItems.add(
            MainItem(
                id = 1,
                drawable = R.drawable.ic_self_improvement,
                textStringId = R.string.label_imc,
                color = Color.GREEN
            )
        )
        mainItems.add(
            MainItem(
                id = 2,
                drawable = R.drawable.ic_self_improvement,
                textStringId = R.string.label_tmb,
                color = Color.GREEN
            )
        )
        // 01) O layout XML
        // 02) A onde a recyclerView vai aparecer(Tela principal, tela cheia)
        // 03) Logica - Conectar o xml da celula dentro do recyclerView + a sua quantidade de elementos
        val adapter = MainAdapter(mainItems)
        rvMain = findViewById(R.id.rv_main)
        rvMain.adapter = adapter
        rvMain.layoutManager = LinearLayoutManager(this)

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

    private inner class MainAdapter(private val mainItems: List<MainItem>) : RecyclerView.Adapter<MainViewHolder>(){

        // 01) Qual é o layout XML da celula especifica(item)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
            val view = layoutInflater.inflate(R.layout.main_item, parent, false)
            return MainViewHolder(view)
        }

        // 02) Disparado toda vez que houver uma rolagem na tela e for necessario trocar o conteudo
        //     da celula
        override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
            val itemCurrent = mainItems[position]
            holder.bind(itemCurrent)
        }

        // 03) Informar quantas celulas essa listagem terá
        override fun getItemCount(): Int {
            return mainItems.size
        }

    }

    // É a classe da celula em si!
    private class  MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: MainItem){
            val buttonTest: Button = itemView.findViewById(R.id.btn_item)
            buttonTest.setText(item.textStringId)
            //val text = item.textStringId
        }
    }

}