[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RlKg9KwZ)
# Unidad 6 — Ejercicios (6.1 a 6.5)

Repositorio base para que el alumnado implemente los ejercicios de Moodle (Unidad 6).

## Índice de ejercicios

| Ejercicio | RA | Código (paquete) | Documentación (Markdown) |
|---|---|---|---|
| 6.1 Tipos de herencia, clases y subclases | RA7.a | `es.ies.ejercicios.u6.ej61` | [`docs/ejercicios/6.1.md`](docs/ejercicios/6.1.md) |
| 6.2 Forzado y bloqueo de herencia | RA7.b | `es.ies.ejercicios.u6.ej62` | [`docs/ejercicios/6.2.md`](docs/ejercicios/6.2.md) |
| 6.3 Incidencia de constructores | RA7.c | `es.ies.ejercicios.u6.ej63` | [`docs/ejercicios/6.3.md`](docs/ejercicios/6.3.md) |
| 6.4 Comentar y documentar el código | RA7.h | `es.ies.ejercicios.u6.ej64` | [`docs/ejercicios/6.4.md`](docs/ejercicios/6.4.md) |
| 6.5 Principios SOLID | RA7.d,e,f,g | `es.ies.ejercicios.u6.ej65` | [`docs/ejercicios/6.5.md`](docs/ejercicios/6.5.md) |

## Estructura del proyecto

- Código: `src/main/kotlin/` (un paquete por ejercicio).
- Documentación: `docs/ejercicios/` (un `.md` por ejercicio).

## Cómo empezar (IDE)

1. Abre el proyecto en IntelliJ IDEA.
2. Marca `src/main/kotlin` como *Sources Root* si tu IDEA no detecta Gradle.
3. Implementa cada ejercicio dentro de su paquete.
4. Documenta la resolución en el Markdown del ejercicio correspondiente.

### Realizado por: Daniel Felipe Oliveros Rojas

# --> Desarrollo

## I. Práctica

Sigue los pasos para cada una de las 2 estructuras elegidas (Especialización, Extensión, Especificación, Construcción). Usa Enlaces permanentes a código para ilustrar tus respuestas:

I.a) Para **cada una** de las 2 estructuras elegidas:

-   Piensa en **(1) una superclase** y **(2) dos subclases**.

-   Crea las clases en Kotlin.

**Explica tu propuesta de superclase y subclases para cada estructura, y el tipo de herencia que representa.**

**RESPUESTA:**   Las estructuras que escogí fueron las **Extensión**, **Especificación**  :

Primera propuesta:

__Especificación:__

La superclase

    clases abstracta

- GestionDePago

subclase
- PagoConEfectivo
- PagoConTarjeta
- PagoConCriptoMoneda

Segunda propuesta:

__Extensión__

La súper clase es :
- EnvioEstandar

La subclase
- EnvioPremium
- EnvioUrgente

I.b) Crea un ejemplo de uso con `main`:

-   Asigna a una variable de la **superclase** instancias de las **subclases** (polimorfismo).

-   Muestra salida por consola con “logs” (`println`) para que se vea el comportamiento y el flujo del programa.


RESPUESTA: Explica tu propuesta de ejemplo de uso, qué se imprime en cada caso y por qué.


-----> __Especificación__

Primer ejemplo:

Mi propuesta es que tenemos una clase abstracta **GestionDePago** que contiene un método llamado **metodoDePago** que  las subclases heredan y sobre escriben según el uso interno

		Para pago con cripto moneda: Solicita el numero bolsillo digital
		Para pago con efectivo: Muestra puntos de pago
		Para pago con tarjeta: pago solicita numero de tarjeta

- PagoConEfectivo
- PagoConTarjeta
- PagoConCriptoMoneda

ya que **GestionDePago** con tiene **metodoDePago** y este método es un método abstracto  las clases hijas están obligadas a implementarlo pero cada clase hija la usar de manera especifica
aquí podemos ver el uso de el polimorfismos :

https://github.com/IES-Rafael-Alberti/2526-u6-6-1-5-relacionejercicios-doliroj929/blob/1798aa92bb77f0ff616236ceadcb0f0e1d96cfd0/src/main/kotlin/es/ies/ejercicios/u6/ej61/Especificacion/mainEspecificacion.kt#L51-L62

Todas las instancias son de tipo : GestionDePago que es la súper clase

---------------------------

Segundo ejemplo:
**Extensión**

Mi propuesta es que tenemos una super clase **EnvioExtandar**  con un método  **verInformacionDeEnvio()** realiza la función de ver los datos del envió

https://github.com/IES-Rafael-Alberti/2526-u6-6-1-5-relacionejercicios-doliroj929/blob/80faa3d9beb4ca43aa78065d39002337677f253a/src/main/kotlin/es/ies/ejercicios/u6/ej61/Extension/mainExtension.kt#L5-L11

hay dos dos subclase

- EnvioPremium
- EnvioUrgente

https://github.com/IES-Rafael-Alberti/2526-u6-6-1-5-relacionejercicios-doliroj929/blob/0851937ee9c670240056e44592a34ec2ad23f6b3/src/main/kotlin/es/ies/ejercicios/u6/ej61/Extension/mainExtension.kt#L12-L27

estas dos clase extienden la funcionalidad del método **verInformacionDeEnvio()** en el caso de __EnvioPremium__ especifica la ubicación del envió y en el caso de __EnvioUrgente__ la prioridad la reacciona a "ALTA"
me diante la palabra reservada __super__ asiendo referencia  al metodo del la superclase o clase padre 


Salida por pantalla:
> numero de envio: 101 peso: 5.0 altura: 10.0 ancho: 10.0  Prioridad: normal
>
>numero de envio: 102 peso: 10.0 altura: 30.0 ancho: 30.0  Prioridad: normal  --> ubicaion exacta del envio <--
>
> numero de envio: 103 peso: 15.0 altura: 60.0 ancho: 60.0  Prioridad: ALTA

  



