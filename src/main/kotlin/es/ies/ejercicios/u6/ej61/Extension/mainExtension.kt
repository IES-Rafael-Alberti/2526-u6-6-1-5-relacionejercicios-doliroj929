package es.ies.ejercicios.u6.ej61.Extension

open class EnvioExpress(val numeroDeEnvio:Int,val pesoEnvio:Double,val altura:Double,val ancho:Double) {
    open fun verInformacionDeEnvio():String{
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho"
    }
    override fun toString(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho + ubicaion exacta del envio"
    }
}

class EnvioPremium(numeroDeEnvio: Int, pesoEnvio: Double, altura: Double, ancho: Double): EnvioExpress(numeroDeEnvio,pesoEnvio,altura,ancho) {

   override fun verInformacionDeEnvio(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho"
    }

    fun verUbicacionDeEnvio():String{
     return "El envio numero $numeroDeEnvio  -ubicaion exacta del envio- "
    }

    override fun toString(): String {
        return "numero de envio: $numeroDeEnvio peso: $pesoEnvio altura: $altura ancho: $ancho + ubicaion exacta del envio"
    }
}


fun main() {

    val envio01 = EnvioExpress(101,10.0,10.0,10.0)
    val envio02 = EnvioPremium(102,30.0,30.0,30.0)

    envio02.verUbicacionDeEnvio()



    println(envio01.verInformacionDeEnvio())
    println(envio02.verInformacionDeEnvio())
    println(envio02.verUbicacionDeEnvio())


}