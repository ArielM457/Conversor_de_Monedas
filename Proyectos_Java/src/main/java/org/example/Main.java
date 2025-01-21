package org.example;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.example.utils.CurrencyConverter;
import org.example.utils.ExchangeRateAPI;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String apiKey = "c520ad4815cddd86cb63780c"; // Reemplaza con tu clave

        ExchangeRateAPI api = new ExchangeRateAPI(apiKey);
        try {
            Map<String, Double> exchangeRates = api.getExchangeRates();

            System.out.println("Seleccione una moneda de origen:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");

            int opcionOrigen = scanner.nextInt();
            String[] monedas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};

            if (opcionOrigen < 1 || opcionOrigen > monedas.length) {
                System.out.println("Opción no válida.");
                return;
            }

            String monedaOrigen = monedas[opcionOrigen - 1];

            System.out.println("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            System.out.println("Seleccione una moneda de destino:");
            System.out.println("1. ARS - Peso argentino");
            System.out.println("2. BOB - Boliviano boliviano");
            System.out.println("3. BRL - Real brasileño");
            System.out.println("4. CLP - Peso chileno");
            System.out.println("5. COP - Peso colombiano");
            System.out.println("6. USD - Dólar estadounidense");

            int opcionDestino = scanner.nextInt();

            if (opcionDestino < 1 || opcionDestino > monedas.length) {
                System.out.println("Opción no válida.");
                return;
            }

            String monedaDestino = monedas[opcionDestino - 1];

            CurrencyConverter converter = new CurrencyConverter(exchangeRates);
            double montoConvertido = converter.convert(monedaOrigen, monedaDestino, monto);

            System.out.printf("%f %s equivale a %f %s%n", monto, monedaOrigen, montoConvertido, monedaDestino);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}