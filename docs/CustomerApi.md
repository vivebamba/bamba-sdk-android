# CustomerApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerIdServicesGet**](CustomerApi.md#customerCustomerIdServicesGet) | **GET** /customer/{customerId}/services | Get customer services
[**customerCustomerIdServicesServiceIdCancelPut**](CustomerApi.md#customerCustomerIdServicesServiceIdCancelPut) | **PUT** /customer/{customerId}/services/{serviceId}/cancel | Cancel customer services



## customerCustomerIdServicesGet

> List&lt;Object&gt; customerCustomerIdServicesGet(customerId)

Get customer services

Get all customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String customerId = d625aefa-73ba-4458-a107-5b3eea9f112b; // String | Bamba customer unique identifier
try {
    List<Object> result = apiInstance.customerCustomerIdServicesGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCustomerIdServicesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Bamba customer unique identifier | [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerCustomerIdServicesServiceIdCancelPut

> CancellationResponse customerCustomerIdServicesServiceIdCancelPut(customerId, serviceId)

Cancel customer services

Cancel customer services

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String customerId = d625aefa-73ba-4458-a107-5b3eea9f112b; // String | The customer UUID assigned by Bamba
String serviceId = z625aefa-73ba-4458-a107-5b3eea9526a; // String | The service UUID to cancel assigned by Bamba
try {
    CancellationResponse result = apiInstance.customerCustomerIdServicesServiceIdCancelPut(customerId, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCustomerIdServicesServiceIdCancelPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| The customer UUID assigned by Bamba | [default to null]
 **serviceId** | **String**| The service UUID to cancel assigned by Bamba | [default to null]

### Return type

[**CancellationResponse**](CancellationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

