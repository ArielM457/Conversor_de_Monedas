# Conversor_de_Monedas


Descripción
Este programa es una aplicación en Java que permite a los usuarios convertir entre diferentes monedas. Utiliza una API de tasas de cambio para obtener las conversiones actualizadas en tiempo real. El programa está diseñado siguiendo los principios de la Programación Orientada a Objetos (POO).

## Funcionalidades
Selección de una moneda de origen.
Introducción de un monto a convertir.
Selección de una moneda de destino.
Cálculo del monto convertido basado en las tasas de cambio actualizadas.
## Monedas disponibles para conversión:
ARS - Peso argentino
BOB - Boliviano
BRL - Real brasileño
CLP - Peso chileno
COP - Peso colombiano
USD - Dólar estadounidense


## Requisitos
Java Development Kit (JDK) 11 o superior.
Acceso a internet (para conectarse a la API).
Una clave de API válida de ExchangeRate-API.

## Instalación
Clona este repositorio o descarga los archivos del proyecto.
Asegúrate de que Java está instalado en tu sistema. Puedes verificarlo ejecutando:
bash
Copiar
Editar
java -version

Abre el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse o VS Code).

## Configuración
Regístrate en ExchangeRate-API para obtener una clave de API gratuita.
En la clase ExchangeRateAPI, reemplaza "tu_clave_de_api_aqui" con tu clave de API.
java
Copiar
Editar
private static final String API_KEY = "tu_clave_de_api_aqui";
Uso
Ejecuta la clase principal Main.
Sigue las instrucciones del menú:
Selecciona una moneda de origen.
Introduce el monto que deseas convertir.
Selecciona una moneda de destino.
El programa mostrará el monto convertido en la moneda de destino seleccionada.

## Estructura del Código
El programa está dividido en tres clases principales:

ExchangeRateAPI: Maneja la conexión a la API y la obtención de las tasas de cambio.
CurrencyConverter: Contiene la lógica de conversión entre dos monedas.
Main: Proporciona la interacción con el usuario y organiza el flujo del programa.



## Ejemplo de Uso
Supongamos que deseas convertir 100 USD a ARS:

Selecciona "USD" como moneda de origen.
Introduce "100" como monto.
Selecciona "ARS" como moneda de destino.
El programa te mostrará algo como:
css
Copiar
Editar
100.0 USD equivale a 25,000.0 ARS


Autor
Creado por [Ariel Javier Murillo De La Barra].


