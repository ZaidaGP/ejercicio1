package Controller
//import Model.Persona
import View.Vista

class Controlador {

   // private var persona = Persona()
   // private var vista = Vista()


    public fun calcularIMC(peso:Float, altura:Float):  Int {
        var imc = (peso/(altura*altura))
        if(imc > 24.9){// sobrepeso
            return 1
        }
        if(imc > 18.5 && imc <= 24.9){//peso ideal
            return 0
        }
        return -1 //por debajo del peso ideal
    }

   public fun esMayorDeEdad(edad : Int):Boolean{

        if(edad> 18){
            return true
        }
        else{
            return false
        }
    }

    public fun comprobarSexo(sexo : Char): Char{

        if(sexo=='M'){
            return 'M'
        }
        else{
            return 'H'
        }
    }

    /*public fun correspondiente():Void{

    }*/




}