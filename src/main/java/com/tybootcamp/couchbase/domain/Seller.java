package com.tybootcamp.couchbase.domain;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Document
public class Seller {

  @Id
  @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
  private String id;

  @Field
  private String name;

  @Field
  private List<Product> products;

  @Field
  private List<Category> categories;

  public Seller(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public List<Category> getCategories(){
    return categories;
  }

  public void setCategories(List<Category> categories){
    this.categories = categories;
  }

  public void setCategory(Category category){
    if(this.categories != null){
      categories.add(category);
    }
    else{
      this.categories = List.of(category);
    }
  }
}
