/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.3.2
 * Contact: desarrollo@vivebamba.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.vivebamba.sdk.api;

import com.vivebamba.sdk.ApiInvoker;
import com.vivebamba.sdk.ApiException;
import com.vivebamba.sdk.Pair;

import com.vivebamba.sdk.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.vivebamba.sdk.model.CancellationResponse;
import com.vivebamba.sdk.model.ErrorResponse;
import com.vivebamba.sdk.model.InlineResponse4221;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CustomerApi {
  String basePath = "https://sandbox.vivebamba.com/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get customer services
  * Get all customer services
   * @param customerId Bamba customer unique identifier
   * @return List<Object>
  */
  public List<Object> customerCustomerIdServicesGet (UUID customerId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerId' when calling customerCustomerIdServicesGet",
        new ApiException(400, "Missing the required parameter 'customerId' when calling customerCustomerIdServicesGet"));
    }

    // create path and map variables
    String path = "/customer/{customerId}/services".replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<Object>) ApiInvoker.deserialize(localVarResponse, "array", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get customer services
   * Get all customer services
   * @param customerId Bamba customer unique identifier
  */
  public void customerCustomerIdServicesGet (UUID customerId, final Response.Listener<List<Object>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerId' when calling customerCustomerIdServicesGet",
        new ApiException(400, "Missing the required parameter 'customerId' when calling customerCustomerIdServicesGet"));
    }

    // create path and map variables
    String path = "/customer/{customerId}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Object>) ApiInvoker.deserialize(localVarResponse,  "array", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Cancel customer services
  * Cancel customer services
   * @param customerId Bamba customer unique identifier
   * @param serviceId Service Id
   * @return CancellationResponse
  */
  public CancellationResponse customerCustomerIdServicesServiceIdCancelPut (UUID customerId, UUID serviceId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerId' when calling customerCustomerIdServicesServiceIdCancelPut",
        new ApiException(400, "Missing the required parameter 'customerId' when calling customerCustomerIdServicesServiceIdCancelPut"));
    }
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'serviceId' when calling customerCustomerIdServicesServiceIdCancelPut",
        new ApiException(400, "Missing the required parameter 'serviceId' when calling customerCustomerIdServicesServiceIdCancelPut"));
    }

    // create path and map variables
    String path = "/customer/{customerId}/services/{serviceId}/cancel".replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString())).replaceAll("\\{" + "serviceId" + "\\}", apiInvoker.escapeString(serviceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CancellationResponse) ApiInvoker.deserialize(localVarResponse, "", CancellationResponse.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Cancel customer services
   * Cancel customer services
   * @param customerId Bamba customer unique identifier   * @param serviceId Service Id
  */
  public void customerCustomerIdServicesServiceIdCancelPut (UUID customerId, UUID serviceId, final Response.Listener<CancellationResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'customerId' when calling customerCustomerIdServicesServiceIdCancelPut",
        new ApiException(400, "Missing the required parameter 'customerId' when calling customerCustomerIdServicesServiceIdCancelPut"));
    }
    // verify the required parameter 'serviceId' is set
    if (serviceId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'serviceId' when calling customerCustomerIdServicesServiceIdCancelPut",
        new ApiException(400, "Missing the required parameter 'serviceId' when calling customerCustomerIdServicesServiceIdCancelPut"));
    }

    // create path and map variables
    String path = "/customer/{customerId}/services/{serviceId}/cancel".replaceAll("\\{format\\}","json").replaceAll("\\{" + "customerId" + "\\}", apiInvoker.escapeString(customerId.toString())).replaceAll("\\{" + "serviceId" + "\\}", apiInvoker.escapeString(serviceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CancellationResponse) ApiInvoker.deserialize(localVarResponse,  "", CancellationResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
