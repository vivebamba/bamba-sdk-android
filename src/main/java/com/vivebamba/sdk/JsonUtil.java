/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.3.3
 * Contact: desarrollo@vivebamba.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.vivebamba.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import com.vivebamba.sdk.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AdvisorMessageRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdvisorMessageRequest>>(){}.getType();
    }
    
    if ("AdvisorUser".equalsIgnoreCase(className)) {
      return new TypeToken<List<AdvisorUser>>(){}.getType();
    }
    
    if ("CancellationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancellationResponse>>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<List<Customer>>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorResponse>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001>>(){}.getType();
    }
    
    if ("InlineResponse422".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse422>>(){}.getType();
    }
    
    if ("InlineResponse4221".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse4221>>(){}.getType();
    }
    
    if ("InlineResponse422Errors".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse422Errors>>(){}.getType();
    }
    
    if ("Message".equalsIgnoreCase(className)) {
      return new TypeToken<List<Message>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("OrderProducts".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderProducts>>(){}.getType();
    }
    
    if ("PaymentParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentParams>>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<List<Product>>(){}.getType();
    }
    
    if ("ProductDescription".equalsIgnoreCase(className)) {
      return new TypeToken<List<ProductDescription>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AdvisorMessageRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AdvisorMessageRequest>(){}.getType();
    }
    
    if ("AdvisorUser".equalsIgnoreCase(className)) {
      return new TypeToken<AdvisorUser>(){}.getType();
    }
    
    if ("CancellationResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CancellationResponse>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<Customer>(){}.getType();
    }
    
    if ("ErrorResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorResponse>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001>(){}.getType();
    }
    
    if ("InlineResponse422".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse422>(){}.getType();
    }
    
    if ("InlineResponse4221".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse4221>(){}.getType();
    }
    
    if ("InlineResponse422Errors".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse422Errors>(){}.getType();
    }
    
    if ("Message".equalsIgnoreCase(className)) {
      return new TypeToken<Message>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("OrderProducts".equalsIgnoreCase(className)) {
      return new TypeToken<OrderProducts>(){}.getType();
    }
    
    if ("PaymentParams".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentParams>(){}.getType();
    }
    
    if ("Product".equalsIgnoreCase(className)) {
      return new TypeToken<Product>(){}.getType();
    }
    
    if ("ProductDescription".equalsIgnoreCase(className)) {
      return new TypeToken<ProductDescription>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
