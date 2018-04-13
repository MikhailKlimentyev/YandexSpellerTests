package core;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpClient {

    private  static final String GET_TEMPLATE_BASE_URL =
            "http://epbyminw2301.minsk.epam.com:9444/kwl/templates/";

    public static void main(String args[ ]){
        System.out.println("------------------------ Cut Line ----------------------------------------");
        System.out.println("----- Test Case: Get Template by incorrect Id: Expected Result: false ----");
        GetTemplateById(0, false);
        System.out.println(".");
        System.out.println("------------------------ Cut Line ----------------------------------------");
        System.out.println("------- Test Case: Get Template by correct Id: Expected Result: true -----");
        GetTemplateById(410,true);
    }

    private static void GetTemplateById(int Id, boolean ExpectedValue){
        String targetUrl = GET_TEMPLATE_BASE_URL + Id;

        System.out.println("Template Id: " + Id);
        System.out.println("targetUrl: " + targetUrl);
        HttpURLConnection urlConnection;
        {
            try {
                URL url;
                url = new URL(targetUrl);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();
                int code = urlConnection.getResponseCode();
                System.out.println("getResponseCode():" + code);
                if (code != 404)
                {
                    JsonParser jsonParser = new JsonParser();
                    InputStream inputStream = urlConnection.getInputStream();
                    JsonObject jsonObject = (JsonObject)jsonParser.parse((
                            new InputStreamReader(inputStream, "UTF-8")));
                    Template template = new Template(jsonObject);
                    System.out.println("Template ID: " + template.header.GetValueId());
                    System.out.println("Template Name: " + template.header.GetValueName());
                    System.out.println("Template Description: " + template.header.GetValueDescription());
                    System.out.println("TEST CASE PASSED; Expected value is TRUE: Actual Value: " + code);
                } else {
                    System.out.println("Template with ID: "  + Id + " not found");
                    if (!ExpectedValue)
                        System.out.println("TEST CASE PASSED; Expected value is FALSE: Actual Value: " + code);
                }
            } catch (MalformedURLException e) {
                System.out.println("Exception: MalformedURLException:" + e.getMessage());
            } catch (IOException e) {
                System.out.println("Exception: IOException:" + e.getMessage());
            }
        }
    }
}