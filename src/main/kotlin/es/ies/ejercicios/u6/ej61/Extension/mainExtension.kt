package es.ies.ejercicios.u6.ej61.Extension

open class EnvioEstandar(val numeroDeEnvio:Int, val pesoEnvio:Double, val altura:Double, val ancho:Double, ) {

    open var prioridad: String = "normal"

    open fun verInformacionDeEnvio():String{
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho  Prioridad: $prioridad"
    }

    open fun verPrioridad():String {
        return prioridad
    }
    override fun toString(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho  Prioridad: $prioridad"
    }
}

class EnvioPremium(numeroDeEnvio: Int, pesoEnvio: Double, altura: Double, ancho: Double,):EnvioEstandar(numeroDeEnvio,pesoEnvio,altura,ancho) {

    override var prioridad = "normal"

   override fun verInformacionDeEnvio(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho prioridad: $prioridad"
    }

    fun verUbicacionDeEnvio():String{
     return "El envio numero $numeroDeEnvio  >> ubicaion exacta del envio << "
    }

    override fun toString(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho + ubicaion exacta del envio"
    }
}

class EnvioUrgente(numeroDeEnvio: Int,pesoEnvio: Double,altura: Double,ancho: Double):EnvioEstandar(numeroDeEnvio,pesoEnvio,altura,ancho){
    override var prioridad = "ALTA"

    override fun verInformacionDeEnvio(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho prioridad: $prioridad"
    }

    override fun verPrioridad(): String {
        return prioridad
    }

    override fun toString(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho prioridad: $prioridad"
    }
}

fun main() {

    val envio01 = EnvioEstandar(101,5.0,10.0,10.0)
    val envio02 = EnvioPremium(102,10.0,30.0,30.0)
    val envio03 = EnvioUrgente(103,15.0,60.0,60.0)

    envio02.verUbicacionDeEnvio()

    println(envio01.verInformacionDeEnvio())

    println(envio02.verInformacionDeEnvio())
    println(envio02.verUbicacionDeEnvio())

    println({envio03.verInformacionDeEnvio()})
    println("La prioridad del envio ${envio03.numeroDeEnvio} es ${envio03.verPrioridad()}")

}