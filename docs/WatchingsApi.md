# WatchingsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entriesIdWatchingDelete**](WatchingsApi.md#entriesIdWatchingDelete) | **DELETE** /entries/{id}/watching | 
[**entriesIdWatchingGet**](WatchingsApi.md#entriesIdWatchingGet) | **GET** /entries/{id}/watching | 
[**entriesIdWatchingPut**](WatchingsApi.md#entriesIdWatchingPut) | **PUT** /entries/{id}/watching | 


<a name="entriesIdWatchingDelete"></a>
# **entriesIdWatchingDelete**
> WatchingStatus entriesIdWatchingDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WatchingsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : WatchingStatus = apiInstance.entriesIdWatchingDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WatchingsApi#entriesIdWatchingDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WatchingsApi#entriesIdWatchingDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**WatchingStatus**](WatchingStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdWatchingGet"></a>
# **entriesIdWatchingGet**
> WatchingStatus entriesIdWatchingGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WatchingsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : WatchingStatus = apiInstance.entriesIdWatchingGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WatchingsApi#entriesIdWatchingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WatchingsApi#entriesIdWatchingGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**WatchingStatus**](WatchingStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdWatchingPut"></a>
# **entriesIdWatchingPut**
> WatchingStatus entriesIdWatchingPut(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WatchingsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : WatchingStatus = apiInstance.entriesIdWatchingPut(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WatchingsApi#entriesIdWatchingPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WatchingsApi#entriesIdWatchingPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**WatchingStatus**](WatchingStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

