# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServiceGet**](CustomerApi.md#customerCustomerIdServiceGet) | **GET** /customer/{customerId}/service | Get customer services



## customerCustomerIdServiceGet

> Service customerCustomerIdServiceGet(customerId)

Get customer services

Get all customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
Integer customerId = null; // Integer | Bamba customer unique identifier
try {
    Service result = apiInstance.customerCustomerIdServiceGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCustomerIdServiceGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Bamba customer unique identifier | [default to null]

### Return type

[**Service**](Service.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

