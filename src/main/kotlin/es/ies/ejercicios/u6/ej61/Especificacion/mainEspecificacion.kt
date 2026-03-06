package es.ies.ejercicios.u6.ej61.Especificacion

// ---------------> Especificación <-----------------------
// SuperClase
abstract class GestionDePago{
  open fun metodoDePago():String{
  return ""
 }
}

// SubClases
class PagoConTarjeta():GestionDePago() {
 var inforamcion = ""

 override fun metodoDePago(): String{
  inforamcion = "pago solicita numero de tarjeta"
  return inforamcion
 }

 override fun toString(): String {
  return inforamcion
 }
}

class PagoConEfectivo():GestionDePago(){
 var inforamcion = ""
 override fun metodoDePago(): String {
  inforamcion = "Muestra puntos de pago"
  return inforamcion
 }
 override fun toString(): String {
  return inforamcion
 }
}

class PagoConCritoMoneda():GestionDePago(){
 var inforamcion = ""
 override fun metodoDePago(): String{
  inforamcion = "Solicita el numero bolsillo digital"
  return inforamcion
 }

 override fun toString(): String {
  return inforamcion
 }
}

fun main() {
 println("Unidad 6 — Ejercicios 6.1 a 6.5")
 println("Implementa cada ejercicio en su paquete y documenta en docs/ejercicios/6.x.md")
 // Unidad 6 — Ejercicios 6.1

 val pago01 = PagoConCritoMoneda()
 val pago02 = PagoConEfectivo()
 val pago03 = PagoConTarjeta()

 pago01.metodoDePago()
 pago02.metodoDePago()
 pago03.metodoDePago()

 println("------ $pago01")
 println("-------$pago02")
 println("-------$pago03")

}

