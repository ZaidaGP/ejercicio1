package View
import  Controller.Controlador
import Model.Persona
class Vista {

    //private var persona1= Persona()
    //private var persona2= Persona()
   // private var persona3= Persona()


     var control = Controlador()

    fun menu(){

        print("Digite su nombre: ")
        var nombre : String =readLine().toString()

        print("Digite su edad: ")
        var edad : Int = readLine()?.toInt()!!

        print("Digite su sexo: ")
        var sexo : Char =readLine()!![0]
        //persona1.sexo =sexo
        print("Digite su peso: ")
        var peso : Float = readLine()?.toFloat()!!

        print("Digite su altura: ")
        var altura : Float= readLine()?.toFloat()!!




        var persona1= Persona(nombre,edad, "208060116",sexo, peso, altura)
        println(persona1.toString())

        var persona2= Persona(nombre,edad,sexo)
        println(persona2.toString())

        var persona3= Persona(nombre,edad,"208060116",sexo,peso,altura)
        persona3.nombre= "Zaida"
        persona3.edad = 21
        persona3.sexo = 'M'
        persona3.peso = 45.0f
        persona3.altura = 1.61f
        println(persona3.toString())

        var imc = control.calcularIMC(persona1.peso,persona1.altura)
        println(persona1.nombre+" su IMC es: " +imc)

        var imc2= control.calcularIMC(persona2.peso,persona2.altura)
        println(persona2.nombre+" su IMC es: " +imc2)

        var imc3= control.calcularIMC(persona3.peso,persona3.altura)
        println(persona3.nombre+" su IMC es: " +imc3)


        var mayorEdad = control.esMayorDeEdad(persona1.edad)
        println(mayorEdad)

        var mayorEdad2 = control.esMayorDeEdad(persona2.edad)
        println(mayorEdad2)

        var mayorEdad3 = control.esMayorDeEdad(persona3.edad)
        println(mayorEdad3)


        var sexo1 = control.comprobarSexo(persona1.sexo)
        println(sexo1)

        var sexo2 = control.comprobarSexo(persona2.sexo)
        println(sexo2)

        var sexo3 = control.comprobarSexo(persona3.sexo)
        println(sexo3)





    }


}