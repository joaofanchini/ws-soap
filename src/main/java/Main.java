import ws.StockWS;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String... args) {
        StockWS stockWS = new StockWS();
        String url = "http://localhost:8080/stockws";

        System.out.println("Iniciando serviço SOAP");
        Endpoint.publish(url, stockWS);
    }
}
