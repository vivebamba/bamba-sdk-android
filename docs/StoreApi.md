# StoreApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storeOrdersPost**](StoreApi.md#storeOrdersPost) | **POST** /store/orders | Place an order
[**storeProductsGet**](StoreApi.md#storeProductsGet) | **GET** /store/products | Get products



## storeOrdersPost

> InlineResponse200 storeOrdersPost(order)

Place an order

Place an order

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Order order = new Order(); // Order | 
try {
    InlineResponse200 result = apiInstance.storeOrdersPost(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#storeOrdersPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## storeProductsGet

> List&lt;Product&gt; storeProductsGet()

Get products

Retrieve all products

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.StoreApi;

StoreApi apiInstance = new StoreApi();
try {
    List<Product> result = apiInstance.storeProductsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#storeProductsGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

