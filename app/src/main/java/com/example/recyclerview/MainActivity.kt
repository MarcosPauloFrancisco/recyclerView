package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val listaDeContatos = ArrayList<Contato>()
    val recycler = findViewById<RecyclerView>(R.id.recyclerview)
    var adapter : ContatoAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 1..30){
            listaDeContatos.add(Contato(nome = "Marcos Paulo Francisco", email = "marcospauloff10@gmail.com"))
        }

        adapter = ContatoAdapter(listaDeContatos, this)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }


}