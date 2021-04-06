package com.example.bancomr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivitySaldoBinding
import com.example.bancomr.databinding.ActivityTransferenciaBinding

class transferencia : AppCompatActivity() {

    //TOME CUIDADO AQUI NÂO È MAIN, È SALDO OU SEJA ActivityTransferenciabinding !!!!
    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //removendo a actions bar nessa tela de saldo, para podermos colocar a nossa tools bar
        //com isso ele vai tirar somente dessa tela Saldo
        //e poderemos criar nossa tools bar para por icone e titulo
        //a toolsbar vai ser igual a actions bar, porém é nos que vamos cria-la com nossa personalização
        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferencia
        //titulo
        toolbar.title = "Transferência"

        //para adicionar cor ao titulo ele não aceita o sdk 21, ele aceita o sdk 23 para frente
        //mais para colocarmos ao 21, clique no getColor que vai estar em vermelho e clique na lampada vermelha a esquerda
        //e selecione a segunda opção que tem o if

        //codigo original \/
        //toolbar.setTitleTextColor(R.color.white)

        //codigo depois de clicar na lampada vermelha na 2 opção \/
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            toolbar.setTitleTextColor(getColor(R.color.white))
        }

        //ou para evitar esse codigo acima, va no build.gradle(module.example) e no "minSdkVersion" coloque a api 23

        //centralizar o titulo
        //mesma situação da cor do titulo, ele aceita a por margin no titulo a partir da SDK 24
        //clique no setTitleMargin que vai estar em vermelho e vai aparecer a lampada vermelha, selecione a 2 opção que é do if
        //antes o codigo estava assim \/
//        toolbar.setTitleMargin(400, 0, 400, 0)

        //depois clicando na lampada vermelha ele fica assim \/
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            toolbar.setTitleMargin(220, 0, 220, 0)
        }

        //colocando background na toolbar
        //mesma coisa dos exemplos acima, só aceita getColor na sdk 24 pra cima, então faça o mesmo processo
        //antes o codigo estava assim \/
//        toolbar.setBackgroundColor(getColor(R.color.light_blue))

        //depois ficou assim clicando na lampa e selecionando a 2 opção
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            toolbar.setBackgroundColor(getColor(R.color.light_blue))
        }

        //colocando o icone que criamos na toolbar
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))

        //colocando um evento de click no icone
        //o this aqui é a mesma coisa que Saldo
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            //o finish é para quando voltar para a tela de activity, vamos finalizar a activity atual que é de saldo
            finish()
        }

        //OBSERVAÇÂO IMPORTANTE, SE A SDK FOR MAIOR QUE 24 È SÒ POR O CODIGO COMO ESTAVA ANTES IGUAL NOS EXEMPLOS "antes o codigo estava assim"
    }
}