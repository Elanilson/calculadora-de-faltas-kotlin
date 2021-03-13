package com.apkdoandroid.calculadoradefaltakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apkdoandroid.calculadoradefaltakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            val num1 = binding.editNota1
            val num2 = binding.editNota2
            val num3 = binding.editNota3
            val num4 = binding.editNota4
            val faltas = binding.editNumeroFaltas
            val resultado = binding.textViewResultado

            val nota1 = num1.text.toString().toDouble()
            val nota2 = num2.text.toString().toDouble()
            val nota3 = num3.text.toString().toDouble()
            val nota4 = num4.text.toString().toDouble()
            val nfaltas = faltas.text.toString().toInt()

            val media  = (nota1 + nota2 + nota3 + nota4) / 4

            if(media >=5 && nfaltas <=20){
                resultado.setText("Aluno foi aprovado \n  Média final ${media}")
                resultado.setTextColor(resources.getColor(R.color.verde))


            }else if(nfaltas >= 20){
                resultado.setText("O Aluno foi reprovado por faltas \n Média final ${media}")
                resultado.setTextColor(resources.getColor(R.color.vermelho))
            }else if (media < 5){
                resultado.setText("O Aluno foi reprovado por nota \n Média final ${media}")
                resultado.setTextColor(resources.getColor(R.color.vermelho))

            }
        }
    }
}