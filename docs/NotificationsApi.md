# NotificationsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsGet**](NotificationsApi.md#notificationsGet) | **GET** /notifications | 
[**notificationsIdGet**](NotificationsApi.md#notificationsIdGet) | **GET** /notifications/{id} | 
[**notificationsReadPut**](NotificationsApi.md#notificationsReadPut) | **PUT** /notifications/read | 


<a name="notificationsGet"></a>
# **notificationsGet**
> NotificationList notificationsGet(limit, after, before, unread)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NotificationsApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val unread : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : NotificationList = apiInstance.notificationsGet(limit, after, before, unread)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#notificationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#notificationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]
 **unread** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**NotificationList**](NotificationList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationsIdGet"></a>
# **notificationsIdGet**
> Notification notificationsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NotificationsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Notification = apiInstance.notificationsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#notificationsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#notificationsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationsReadPut"></a>
# **notificationsReadPut**
> NotificationsReadPut200Response notificationsReadPut(time)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NotificationsApi()
val time : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
try {
    val result : NotificationsReadPut200Response = apiInstance.notificationsReadPut(time)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#notificationsReadPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#notificationsReadPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time** | **java.math.BigDecimal**|  | [optional] [default to 0.0]

### Return type

[**NotificationsReadPut200Response**](NotificationsReadPut200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

