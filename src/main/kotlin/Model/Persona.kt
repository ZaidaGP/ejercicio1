package Model

//constructor por defecto
 class Persona  {

    var nombre : String = ""
    var edad : Int = 0
    var cedula : String = ""
    var sexo : Char = '\u0000'
    var peso : Float = 0.0f
    var altura: Float = 0.0f
        get() = field        // getter
        set(value) {         // setter
            field = value
        }


    constructor(nombre_p: String, edad_p :Int, cedula_p : String, sexo_p : Char, peso_p: Float, altura_p: Float){
        nombre = nombre_p
        edad = edad_p
        cedula = cedula_p
        sexo = sexo_p
        peso = peso_p
        altura = altura_p
    }
    constructor(nombre: String, edad :Int, sexo : Char)
    {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor(nombre: String, edad :Int, cedula : String ,sexo : Char, peso : Float)
    {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.cedula = cedula
        this.peso = peso
    }

    constructor()

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad, cedula='$cedula', sexo=$sexo, peso=$peso, altura=$altura)"
    }


}