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
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.vivebamba:bamba-sdk-android:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/bamba-sdk-android-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.vivebamba.sdk.api.BambaAgentApi;

public class BambaAgentApiExample {

    public static void main(String[] args) {
        BambaAgentApi apiInstance = new BambaAgentApi();
        Message message = new Message(); // Message | 
        try {
            apiInstance.bambaAgentMessagePost(message);
        } catch (ApiException e) {
            System.err.println("Exception when calling BambaAgentApi#bambaAgentMessagePost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BambaAgentApi* | [**bambaAgentMessagePost**](docs/BambaAgentApi.md#bambaAgentMessagePost) | **POST** /bamba-agent/message | Bamba agent
*CustomerApi* | [**customerCustomerIdServiceGet**](docs/CustomerApi.md#customerCustomerIdServiceGet) | **GET** /customer/{customerId}/service | Get customer services
*StoreApi* | [**storeOrdersPost**](docs/StoreApi.md#storeOrdersPost) | **POST** /store/orders | Place an order
*StoreApi* | [**storeProductsGet**](docs/StoreApi.md#storeProductsGet) | **GET** /store/products | Get products


## Documentation for Models

 - [Customer](docs/Customer.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Message](docs/Message.md)
 - [Order](docs/Order.md)
 - [OrderProducts](docs/OrderProducts.md)
 - [Product](docs/Product.md)
 - [ProductBundleItems](docs/ProductBundleItems.md)
 - [Service](docs/Service.md)


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
