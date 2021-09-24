# V1Api

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AdvisorMessagePost**](V1Api.md#v1AdvisorMessagePost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
[**v1CustomerCustomerIdServicesGet**](V1Api.md#v1CustomerCustomerIdServicesGet) | **GET** /v1/customer/{customerId}/services | Get customer services
[**v1CustomerCustomerIdServicesSkuCancelPut**](V1Api.md#v1CustomerCustomerIdServicesSkuCancelPut) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
[**v1StoreOrdersPost**](V1Api.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
[**v1StoreProductsGet**](V1Api.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products



## v1AdvisorMessagePost

> InlineResponse2001 v1AdvisorMessagePost(advisorMessageRequest)

Send messages to the Bamba Advisor

Send mesages to the Bamba Advisor from new or existing customers

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.V1Api;

V1Api apiInstance = new V1Api();
AdvisorMessageRequest advisorMessageRequest = new AdvisorMessageRequest(); // AdvisorMessageRequest | 
try {
    InlineResponse2001 result = apiInstance.v1AdvisorMessagePost(advisorMessageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1Api#v1AdvisorMessagePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advisorMessageRequest** | [**AdvisorMessageRequest**](AdvisorMessageRequest.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1CustomerCustomerIdServicesGet

> Subscription v1CustomerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.V1Api;

V1Api apiInstance = new V1Api();
Integer customerId = null; // Integer | Bamba customer unique identifier
try {
    Subscription result = apiInstance.v1CustomerCustomerIdServicesGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1Api#v1CustomerCustomerIdServicesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Bamba customer unique identifier | [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1CustomerCustomerIdServicesSkuCancelPut

> Subscription v1CustomerCustomerIdServicesSkuCancelPut(customerId, sku)

Cancel customer services

Cancel customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.V1Api;

V1Api apiInstance = new V1Api();
String customerId = null; // String | Bamba customer unique identifier
String sku = null; // String | Service sku
try {
    Subscription result = apiInstance.v1CustomerCustomerIdServicesSkuCancelPut(customerId, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1Api#v1CustomerCustomerIdServicesSkuCancelPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Bamba customer unique identifier | [default to null]
 **sku** | **String**| Service sku | [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1StoreOrdersPost

> InlineResponse200 v1StoreOrdersPost(order)

Place an order

Place an order

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.V1Api;

V1Api apiInstance = new V1Api();
Order order = new Order(); // Order | 
try {
    InlineResponse200 result = apiInstance.v1StoreOrdersPost(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1Api#v1StoreOrdersPost");
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
//import com.vivebamba.sdk.api.V1Api;

V1Api apiInstance = new V1Api();
try {
    List<Product> result = apiInstance.v1StoreProductsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1Api#v1StoreProductsGet");
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

