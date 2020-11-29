package ru.netology.repository;

import com.google.gson.Gson;
import ru.netology.domain.PurchaseItem;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CartRepository {
  private String dbUrl;
  private HttpClient client = HttpClient.newHttpClient();
  private Gson gson = new Gson();

  public CartRepository(String dbUrl) {
    this.dbUrl = dbUrl;
  }

  public void save(PurchaseItem item) {
    try {
      HttpRequest request = HttpRequest.newBuilder(URI.create(dbUrl))
          .header("Content-Type", "application/json")
          .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(item)))
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() < 200 || response.statusCode() > 299) {
        throw new RuntimeException("request didn't complete successfully");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public PurchaseItem[] findAll() {
    try {
      HttpRequest request = HttpRequest.newBuilder(URI.create(dbUrl))
          .header("Accept", "application/json")
          .GET()
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() < 200 || response.statusCode() > 299) {
        throw new RuntimeException("request didn't complete successfully");
      }
      return gson.fromJson(response.body(), PurchaseItem[].class);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void removeById(int id) {
    try {
      HttpRequest request = HttpRequest.newBuilder(URI.create(dbUrl + "/" + id))
          .header("Content-Type", "application/json")
          .DELETE()
          .build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      if (response.statusCode() < 200 || response.statusCode() > 299) {
        throw new RuntimeException("request didn't complete successfully");
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

