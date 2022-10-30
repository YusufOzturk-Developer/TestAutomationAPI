/*
Otomasyon projesinde kullanılan methodlar okunulabilirliğin arttırılması
ve  esneklik  sağlanabilmesi  için  bu  sınıf  içerisinde tanımlanmıştır.

Http status kontrolleri için 'java.net.http... ' framework leri kullanılmıştır.
Http status kodları 'Assertions.assertEquals' işlevi ile kontrol edilmiştir.
*/


package org.example;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class JSONResponseController {

    // Basarili GET Methodu //Successful GET Method
    // Kullamnılan API: https://generator.swagger.io/api/gen/clients
    public static void GetClientsSuccess() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://generator.swagger.io/api/gen/clients"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("Test Case: GET 'BAŞARILI' API isteği");
        System.out.println("HTTP Request Response code: "+response.statusCode());
        try
        {
            Assertions.assertEquals(200, response.statusCode());
            System.out.println("API isteği başarılı\n");
        }
        catch (AssertionError e)
        {
            System.out.println("API isteği başarısız\n");
            //throw e;
        }
    }

    // Başarisiz Get Methodu //Failed Get Method
    // Kullamnılan API: https://generator.swagger.io/api/gen/failed
    public static void GetClientsFailed() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://generator.swagger.io/api/gen/failed"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println("Test Case: GET 'BAŞARISIZ' API isteği");
        System.out.println("HTTP Request Response code: "+response.statusCode());
        try
        {
            Assertions.assertEquals(200, response.statusCode());
            System.out.println("API isteği başarılı\n");
        }
        catch (AssertionError e)
        {
            System.out.println("API isteği başarısız\n");
            //throw e;
        }
    }

    // Basarili Post Methodu //Successful Post Method
    // Kullamnılan API: https://generator.swagger.io/api/gen/clients/go
    public static void PostSuccess() throws IOException, InterruptedException{

        String jsonString = "{\n" +
                "  \"spec\": {},\n" +
                "  \"options\": {\n" +
                "    \"additionalProp1\": \"go_posted\",\n" +
                "    \"additionalProp2\": \"string\",\n" +
                "    \"additionalProp3\": \"string\"\n" +
                "  },\n" +
                "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
                "  \"authorizationValue\": {\n" +
                "    \"value\": \"string\",\n" +
                "    \"type\": \"string\",\n" +
                "    \"keyName\": \"string\"\n" +
                "  },\n" +
                "  \"securityDefinition\": {\n" +
                "    \"type\": \"string\",\n" +
                "    \"description\": \"string\"\n" +
                "  }\n" +
                "}" ;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://generator.swagger.io/api/gen/clients/go"))
                .header("content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonString))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println("Test Case: POST 'BAŞARILI' API isteği");
        System.out.println("HTTP Request Response code: "+response.statusCode());
        try
        {
            Assertions.assertEquals(200, response.statusCode());
            System.out.println("API isteği başarılı\n");
        }
        catch (AssertionError e)
        {
            System.out.println("API isteği başarısız\n");
            //throw e;
        }
    }

    // Başarisiz Post Methodu //Failed Post Method
    // Kullamnılan API: https://generator.swagger.io/api/gen/clients/failed
    public static void PostFailed() throws IOException, InterruptedException{

        String jsonString = "{\n" +
                "  \"spec\": {},\n" +
                "  \"options\": {\n" +
                "    \"additionalProp1\": \"go_failed\",\n" +
                "    \"additionalProp2\": \"string\",\n" +
                "    \"additionalProp3\": \"string\"\n" +
                "  },\n" +
                "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
                "  \"authorizationValue\": {\n" +
                "    \"value\": \"string\",\n" +
                "    \"type\": \"string\",\n" +
                "    \"keyName\": \"string\"\n" +
                "  },\n" +
                "  \"securityDefinition\": {\n" +
                "    \"type\": \"string\",\n" +
                "    \"description\": \"string\"\n" +
                "  }\n" +
                "}" ;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("https://generator.swagger.io/api/gen/clients/failed"))
                .header("content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonString))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println("Test Case: POST 'BAŞARISIZ' API isteği");
        System.out.println("HTTP Request Response code: "+response.statusCode());
        try
        {
            Assertions.assertEquals(200, response.statusCode());
            System.out.println("API isteği başarılı\n");
        }
        catch (AssertionError e)
        {
            System.out.println("API isteği başarısız\n");
            //throw e;
        }
    }
}
