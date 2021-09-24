# bamba-sdk-android

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.vivebamba</groupId>
    <artifactId>bamba-sdk-android</artifactId>
    <version>1.2.9</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.vivebamba:bamba-sdk-android:1.2.9"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/bamba-sdk-android-1.2.9.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.vivebamba.sdk.api.BambaAdvisorApi;

public class BambaAdvisorApiExample {

    public static void main(String[] args) {
        BambaAdvisorApi apiInstance = new BambaAdvisorApi();
        AdvisorMessageRequest advisorMessageRequest = new AdvisorMessageRequest(); // AdvisorMessageRequest | 
        try {
            InlineResponse2001 result = apiInstance.v1AdvisorMessagePost(advisorMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BambaAdvisorApi#v1AdvisorMessagePost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BambaAdvisorApi* | [**v1AdvisorMessagePost**](docs/BambaAdvisorApi.md#v1AdvisorMessagePost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
*CustomerApi* | [**v1CustomerCustomerIdServicesGet**](docs/CustomerApi.md#v1CustomerCustomerIdServicesGet) | **GET** /v1/customer/{customerId}/services | Get customer services
*CustomerApi* | [**v1CustomerCustomerIdServicesSkuCancelPut**](docs/CustomerApi.md#v1CustomerCustomerIdServicesSkuCancelPut) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
*StoreApi* | [**v1StoreOrdersPost**](docs/StoreApi.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
*StoreApi* | [**v1StoreProductsGet**](docs/StoreApi.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products
*V1Api* | [**v1AdvisorMessagePost**](docs/V1Api.md#v1AdvisorMessagePost) | **POST** /v1/advisor/message | Send messages to the Bamba Advisor
*V1Api* | [**v1CustomerCustomerIdServicesGet**](docs/V1Api.md#v1CustomerCustomerIdServicesGet) | **GET** /v1/customer/{customerId}/services | Get customer services
*V1Api* | [**v1CustomerCustomerIdServicesSkuCancelPut**](docs/V1Api.md#v1CustomerCustomerIdServicesSkuCancelPut) | **PUT** /v1/customer/{customerId}/services/{sku}/cancel | Cancel customer services
*V1Api* | [**v1StoreOrdersPost**](docs/V1Api.md#v1StoreOrdersPost) | **POST** /v1/store/orders | Place an order
*V1Api* | [**v1StoreProductsGet**](docs/V1Api.md#v1StoreProductsGet) | **GET** /v1/store/products | Get products


## Documentation for Models

 - [AdvisorMessageRequest](docs/AdvisorMessageRequest.md)
 - [AdvisorUser](docs/AdvisorUser.md)
 - [Customer](docs/Customer.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse422](docs/InlineResponse422.md)
 - [InlineResponse4221](docs/InlineResponse4221.md)
 - [InlineResponse422Errors](docs/InlineResponse422Errors.md)
 - [Message](docs/Message.md)
 - [Order](docs/Order.md)
 - [OrderProducts](docs/OrderProducts.md)
 - [PaymentParams](docs/PaymentParams.md)
 - [Product](docs/Product.md)
 - [SectionWhatIncludes](docs/SectionWhatIncludes.md)
 - [SectionWhatNotIncludes](docs/SectionWhatNotIncludes.md)
 - [Service](docs/Service.md)
 - [Subscription](docs/Subscription.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key

- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

desarrollo@vivebamba.com

