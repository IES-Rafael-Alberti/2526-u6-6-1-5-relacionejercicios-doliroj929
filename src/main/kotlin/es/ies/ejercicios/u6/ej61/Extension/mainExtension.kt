package es.ies.ejercicios.u6.ej61.Extension

//---------->Extension<----------------

//----------superclase----------
open class EnvioEstandar(val numeroDeEnvio:Int, val pesoEnvio:Double, val altura:Double, val ancho:Double, ) {
    open var prioridad: String = "normal"
    open fun verInformacionDeEnvio():String{
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho  Prioridad: $prioridad"
    }
}
//--------subclase----------
class EnvioPremium(numeroDeEnvio: Int, pesoEnvio: Double, altura: Double, ancho: Double,):EnvioEstandar(numeroDeEnvio,pesoEnvio,altura,ancho) {

    override var prioridad = "normal"

   override fun verInformacionDeEnvio(): String {
        return "${super.verInformacionDeEnvio()} + >> ubicaion exacta del envio << "
    }
}

class EnvioUrgente(numeroDeEnvio: Int,pesoEnvio: Double,altura: Double,ancho: Double):EnvioEstandar(numeroDeEnvio,pesoEnvio,altura,ancho){
    override var prioridad = "normal"
    override fun verInformacionDeEnvio():String{
        super.verInformacionDeEnvio()
        prioridad = "ALTA"
        return super.verInformacionDeEnvio()
    }
}

fun main() {

    val envio01 = EnvioEstandar(101,5.0,10.0,10.0)
    val envio02 = EnvioPremium(102,10.0,30.0,30.0)
    val envio03 = EnvioUrgente(103,15.0,60.0,60.0)

    println(envio01.verInformacionDeEnvio())
    println(envio02.verInformacionDeEnvio())
    println(envio03.verInformacionDeEnvio())

}