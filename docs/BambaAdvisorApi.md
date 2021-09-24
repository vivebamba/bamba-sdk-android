# BambaAdvisorApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advisorMessagePost**](BambaAdvisorApi.md#advisorMessagePost) | **POST** /advisor/message | Send messages to the Bamba Advisor



## advisorMessagePost

> InlineResponse2001 advisorMessagePost(advisorMessageRequest)

Send messages to the Bamba Advisor

Send mesages to the Bamba Advisor from new or existing customers

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.BambaAdvisorApi;

BambaAdvisorApi apiInstance = new BambaAdvisorApi();
AdvisorMessageRequest advisorMessageRequest = new AdvisorMessageRequest(); // AdvisorMessageRequest | 
try {
    InlineResponse2001 result = apiInstance.advisorMessagePost(advisorMessageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BambaAdvisorApi#advisorMessagePost");
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

