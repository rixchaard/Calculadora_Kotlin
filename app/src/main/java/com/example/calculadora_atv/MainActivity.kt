package com.example.calculadora_atv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import com.example.calculadora_atv.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // O binding é aplicado no Gradle script, assim, quando inserido no KT,
        // ele puxa as VAL mais fácil, sem a necessidade de ficar colocando <button> e citando ID

        val calculo = binding.calculo

        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }
        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }
        binding.quatr.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }

        //////////// OPERADORES ////////////////

        binding.parente1.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        binding.parente2.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        binding.div.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        binding.multi.setOnClickListener {
            calculo.text = "${calculo.text}x"
        }
        binding.sub.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        binding.soma.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }


        /////////// APAGAR E CE ///////////////////
        binding.apagar.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        binding.C.setOnClickListener {
            calculo.text = " "
            binding.resultado.text = ""
        }

        ///////////////////////////////////////////

        binding.igual.setOnClickListener {
            val resultadoCalc = Expression(calculo.text.toString()).calculate()

            if (resultadoCalc.isNaN()){

                binding.resultado.text ="Resultado inválido"
            }else{
                binding.resultado.text = resultadoCalc.toString()
            }



        }



    }
}