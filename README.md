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
    <version>1.0.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.vivebamba:bamba-sdk-android:1.0.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/bamba-sdk-android-1.0.5.jar
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
            InlineResponse2001 result = apiInstance.advisorMessagePost(advisorMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BambaAdvisorApi#advisorMessagePost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.vivebamba.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BambaAdvisorApi* | [**advisorMessagePost**](docs/BambaAdvisorApi.md#advisorMessagePost) | **POST** /advisor/message | Send messages to the Bamba Advisor
*StoreApi* | [**storeOrdersPost**](docs/StoreApi.md#storeOrdersPost) | **POST** /store/orders | Place an order
*StoreApi* | [**storeProductsGet**](docs/StoreApi.md#storeProductsGet) | **GET** /store/products | Get products


### Bamba Advisor

The advisor Bamba follows the basic concept of communication:

Send a message: Sender sends a message to Bamba Advisor
Receive the response: Bamba Advisor sends the response to Issuer

You can send a message to the Bamba advisor using the advisorMessagePost method, then you need to listen for the response to your message, to achieve this it is necessary that you expose in your application a url (webhook) where the advisor can send you the responses to your messages.

This webhook should wait for notification via POST.

Once you have the url where you want to receive the responses from the Bamba advisor, send us the url by email to desarrollo@vivebamba.com so that we can register the webhook for your integration and you can receive the responses.


## Documentation for Models

 - [AdvisorMessageRequest](docs/AdvisorMessageRequest.md)
 - [AdvisorUser](docs/AdvisorUser.md)
 - [Customer](docs/Customer.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
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

