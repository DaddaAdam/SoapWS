package com.emsi;
import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8686/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service started at: " + url);
    }
}