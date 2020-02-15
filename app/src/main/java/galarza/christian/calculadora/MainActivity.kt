package galarza.christian.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uno:Button=findViewById(R.id.uno) as Button
        val dos:Button=findViewById(R.id.dos) as Button
        val tres:Button=findViewById(R.id.tres) as Button
        val cuatro:Button=findViewById(R.id.cuatro) as Button
        val cinco:Button=findViewById(R.id.cinco) as Button
        val seis:Button=findViewById(R.id.seis) as Button
        val siete:Button=findViewById(R.id.siete) as Button
        val ocho:Button=findViewById(R.id.ocho) as Button
        val nueve:Button=findViewById(R.id.nueve) as Button
        val cero:Button=findViewById(R.id.cero) as Button
        val dot:Button=findViewById(R.id.punto) as Button
        val suma:Button=findViewById(R.id.mas) as Button
        val resta:Button=findViewById(R.id.menos) as Button
        val division:Button=findViewById(R.id.division) as Button
        val multiplicacion:Button=findViewById(R.id.por) as Button
        val resolve:Button=findViewById(R.id.resolver) as Button
        val delete:Button=findViewById(R.id.borrar) as Button

        val numero1:TextView=findViewById(R.id.num1) as TextView
        val numero2:TextView=findViewById(R.id.num2) as TextView

        var nume1:String
        var nume2:String
        var lastOperador:Char
        var resultado:Float=0.0f

        uno.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("1")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("1")
                    }else{
                        numero2.setText(nume2+"1")
                    }
                }else{
                    numero1.setText(nume1+"1")
                }
            }
        }
        dos.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("2")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("2")
                    }else{
                        numero2.setText(nume2+"2")
                    }
                }else{
                    numero1.setText(nume1+"2")
                }
            }
        }
        tres.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("3")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("3")
                    }else{
                        numero2.setText(nume2+"3")
                    }
                }else{
                    numero1.setText(nume1+"3")
                }
            }
        }
        cuatro.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("4")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("4")
                    }else{
                        numero2.setText(nume2+"4")
                    }
                }else{
                    numero1.setText(nume1+"4")
                }
            }
        }
        cinco.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("5")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("5")
                    }else{
                        numero2.setText(nume2+"5")
                    }
                }else{
                    numero1.setText(nume1+"5")
                }
            }
        }
        seis.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("6")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("6")
                    }else{
                        numero2.setText(nume2+"6")
                    }
                }else{
                    numero1.setText(nume1+"6")
                }
            }
        }
        siete.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("7")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("7")
                    }else{
                        numero2.setText(nume2+"7")
                    }
                }else{
                    numero1.setText(nume1+"7")
                }
            }
        }
        ocho.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("8")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("8")
                    }else{
                        numero2.setText(nume2+"8")
                    }
                }else{
                    numero1.setText(nume1+"8")
                }
            }
        }
        nueve.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("9")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("9")
                    }else{
                        numero2.setText(nume2+"9")
                    }
                }else{
                    numero1.setText(nume1+"9")
                }
            }
        }
        cero.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                numero1.setText("0")
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        numero2.setText("0")
                    }else{
                        numero2.setText(nume2+"0")
                    }
                }else{
                    numero1.setText(nume1+"0")
                }
            }
        }
        dot.setOnClickListener{
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(nume1.equals("0")){
                if (nume1.contains('.')){
                    numero1.setText(nume1+"")
                }else{
                    numero1.setText(nume1+".")
                }
            }else{
                if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                    if(nume2.equals("0")){
                        if (nume2.contains('.')){
                            numero2.setText(nume2+"")
                        }else{
                            numero2.setText(nume2+".")
                        }
                    }else{
                        if(nume2.contains('.')){
                            numero2.setText(nume2+"")
                        }else{
                            numero2.setText(nume2+".")
                        }
                    }
                }else{
                    if (nume1.contains('.')){
                        numero1.setText(nume1+"")
                    }else{
                        numero1.setText(nume1+".")
                    }
                }
            }
        }
        suma.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                numero1.setText(nume1.replace(lastOperador,'+'))
            }else{
                numero1.setText(nume1+"+")
            }
        }
        resta.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                numero1.setText(nume1.replace(lastOperador,'-'))
            }else{
                numero1.setText(nume1+"-")
            }
        }
        multiplicacion.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                numero1.setText(nume1.replace(lastOperador,'*'))
            }else{
                numero1.setText(nume1+"*")
            }
        }
        division.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                numero1.setText(nume1.replace(lastOperador,'/'))
            }else{
                numero1.setText(nume1+"/")
            }
        }
        resolve.setOnClickListener {
            nume1 = numero1.text.toString()
            nume2 = numero2.text.toString()
            lastOperador = nume1.last()
            if(lastOperador.equals('+')||lastOperador.equals('-')||lastOperador.equals('*')||lastOperador.equals('/')){
                nume1.dropLast(1).toFloat()
                when(lastOperador){
                    '+'->resultado=nume1.dropLast(1).toFloat()+nume2.toFloat()
                    '-'->resultado=nume1.dropLast(1).toFloat()-nume2.toFloat()
                    '*'->resultado=nume1.dropLast(1).toFloat()*nume2.toFloat()
                    '/'->resultado=nume1.dropLast(1).toFloat()/nume2.toFloat()
                }
                numero1.setText("$resultado")
                numero2.setText("0")
            }else{

            }
        }
        delete.setOnClickListener {
            numero1.setText("0")
            numero2.setText("0")
        }

    }
}


