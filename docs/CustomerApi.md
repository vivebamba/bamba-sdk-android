# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServicesGet**](CustomerApi.md#customerCustomerIdServicesGet) | **GET** /customer/{customerId}/services | Get customer services
[**customerCustomerIdServicesSkuCancelGet**](CustomerApi.md#customerCustomerIdServicesSkuCancelGet) | **GET** /customer/{customerId}/services/{sku}/cancel | Cancel customer services



## customerCustomerIdServicesGet

> Subscription customerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
Integer customerId = null; // Integer | Bamba customer unique identifier
try {
    Subscription result = apiInstance.customerCustomerIdServicesGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCustomerIdServicesGet");
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


## customerCustomerIdServicesSkuCancelGet

> Subscription customerCustomerIdServicesSkuCancelGet(customerId, sku)

Cancel customer services

Cancel customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String customerId = null; // String | Bamba customer unique identifier
String sku = null; // String | Service sku
try {
    Subscription result = apiInstance.customerCustomerIdServicesSkuCancelGet(customerId, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCustomerIdServicesSkuCancelGet");
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

