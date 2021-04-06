package com.example.bancomr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityFaturas2Binding

class faturas : AppCompatActivity() {

    private lateinit var binding: ActivityFaturas2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturas2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //para sumir com a action bar para colocarmos nossa toolbar
        supportActionBar!!.hide()

        var toolbar = binding.toolbarFaturas

        //titulo
        toolbar.title = "Faturas"

        //colocando com no text no sdk21 o codigo original em outros sdk acima de 23 é esse: toolbar.setTitleTextColor(R.color.white)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            toolbar.setTitleTextColor(getColor(R.color.white))
        }


        //colocando margin na toolbar para o texto ficar centralizado no sdk21 o codigo original em outros sdk acima de 23 é esse: toolbar.setTitleTextColor(R.color.white)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            toolbar.setTitleMargin(300, 0, 300, 0)
        }


        //colocando o background na toolbar no sdk21 o codigo original em outros sdk acima de 23 é esse: toolbar.setTitleTextColor(R.color.white)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            toolbar.setBackgroundColor(getColor(R.color.light_blue))
        }


        //colocando nosso icone de voltar no toolbar
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))


        //fazendo o icone de voltar ter ação
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            //o finish é para quando voltar para a tela de activity, vamos finalizar a activity atual que é de saldo
            finish()
        }


    }
}