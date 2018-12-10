package com.example.macbook.androidproject;

import java.util.HashMap;
import java.util.Map;

public class Meal {
    int id;
    String name;
    String description;
    double price;
    String thumbnail;

    public Meal() {
    }

    public Meal(int id, String name, String description, double price, String thumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Map<String, Object> toMap() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("id", this.id);
        result.put("name", this.name);
        result.put("description", this.description);
        result.put("price", this.price);
        result.put("thumbnail", this.thumbnail);

        return result;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}