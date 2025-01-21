package org.example.utils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateAPI {

        private final String apiKey;
        private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

        public ExchangeRateAPI(String apiKey) {
            this.apiKey = apiKey;
        }

        public Map<String, Double> getExchangeRates() throws IOException, InterruptedException {
            String url = API_URL + apiKey + "/latest/USD";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            if (!jsonResponse.has("result") || !jsonResponse.get("result").getAsString().equals("success")) {
                throw new IOException("Error al obtener datos de la API");
            }

            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
            Map<String, Double> rates = new HashMap<>();

            for (String currency : conversionRates.keySet()) {
                rates.put(currency, conversionRates.get(currency).getAsDouble());
            }

            return rates;
        }
    }

