package com.example.bancomr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

//*Adicionando Imagems:
//        Adicionando as imagems ao android studio, não é necessario criar a pasta assets
//        Copie as imagens e va até a pasta "res" > clique no "drawable" e aperte CTRL + V, ele vai mostrar uma caixa informando em qual drawable quer por, escolha o primeiro e de OK e depois de "Refactor" e PRONTO !!!


//*Alterando o titulo da 1 tela na actions bar:
//        Para alterar o Titulo na Actions BAR
//        va na pasta "res" > "values" > "strings.xml" o titulo esta aqui é só alterar, lembrando quando alterar voce precisa fechar o emulador e abrir novamente para ver a mudança !!


//*Criando uma nova tela
//        criando uma nova tela para que quando clicar em alguma imagem seja direcionado para ela
//        vá na pasta "java" > clique com o botão direito no "com.example.bancomr" > "new" > "Activity" > "Empty Activity", de um nome pra tela e de finish
//        isso é feito para quando voce precisar navegar entre telas, ele cria tudo igual como se tivesse criado um novo projeto !!


        //deixando a imagem clicavel
        //com o Intent eu consigo navegar de uma tela para outra (intent: intenção)
        //this para dizer (MainActivity.kt), nossa activity atual
        //saldo é o nome que eu dei para a imagem (é o id dela)
        binding.saldo.setOnClickListener {
            val intent = Intent(this, Saldo::class.java)

            //iniciando o Intent
            startActivity(intent)

            //o finish é para finalizar a acvitivy atual para navegar para saldo
            finish()
        }

        binding.faturas.setOnClickListener {
            val intent = Intent(this, faturas::class.java )

            startActivity(intent)
            finish()
        }

        binding.transferencia.setOnClickListener {
            val intent = Intent(this, transferencia::class.java)

            startActivity(intent)
            finish()
        }

        binding.poupanca.setOnClickListener {
            val intent = Intent(this, poupanca::class.java)

            startActivity(intent)
            finish()
        }
    }
}