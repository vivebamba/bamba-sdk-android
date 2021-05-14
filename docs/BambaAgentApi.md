# BambaAgentApi

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bambaAgentMessagePost**](BambaAgentApi.md#bambaAgentMessagePost) | **POST** /bamba-agent/message | Bamba agent



## bambaAgentMessagePost

> bambaAgentMessagePost(message)

Bamba agent

All related with Bamba Agent

### Example

```java
// Import classes:
//import com.vivebamba.sdk.api.BambaAgentApi;

BambaAgentApi apiInstance = new BambaAgentApi();
Message message = new Message(); // Message | 
try {
    apiInstance.bambaAgentMessagePost(message);
} catch (ApiException e) {
    System.err.println("Exception when calling BambaAgentApi#bambaAgentMessagePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message**](Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

