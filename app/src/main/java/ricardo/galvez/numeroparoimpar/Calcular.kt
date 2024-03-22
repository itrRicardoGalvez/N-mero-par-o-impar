package ricardo.galvez.numeroparoimpar

class Calcular {

    fun calcular (Numero: Int): String{
        var resultado: String

        if (Numero % 2 == 0){
            resultado = "es par"
        }
        else {
            resultado = "es impar"
        }
            return resultado
    }
}