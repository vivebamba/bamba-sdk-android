# StoreApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1StoreOrdersPost**](StoreApi.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
[**v1StoreProductsGet**](StoreApi.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products



## v1StoreOrdersPost

> InlineResponse200 v1StoreOrdersPost(order)

Place an order

Place an order

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.StoreApi;

StoreApi apiInstance = new StoreApi();
Order order = new Order(); // Order | 
try {
    InlineResponse200 result = apiInstance.v1StoreOrdersPost(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#v1StoreOrdersPost");
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


## v1StoreProductsGet

> List&lt;Product&gt; v1StoreProductsGet()

Get products

Retrieve all products

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.StoreApi;

StoreApi apiInstance = new StoreApi();
try {
    List<Product> result = apiInstance.v1StoreProductsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#v1StoreProductsGet");
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

