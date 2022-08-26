# CommentsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentsIdComplainPost**](CommentsApi.md#commentsIdComplainPost) | **POST** /comments/{id}/complain | 
[**commentsIdDelete**](CommentsApi.md#commentsIdDelete) | **DELETE** /comments/{id} | 
[**commentsIdGet**](CommentsApi.md#commentsIdGet) | **GET** /comments/{id} | 
[**commentsIdPut**](CommentsApi.md#commentsIdPut) | **PUT** /comments/{id} | 
[**entriesIdCommentsGet**](CommentsApi.md#entriesIdCommentsGet) | **GET** /entries/{id}/comments | 
[**entriesIdCommentsPost**](CommentsApi.md#entriesIdCommentsPost) | **POST** /entries/{id}/comments | 


<a name="commentsIdComplainPost"></a>
# **commentsIdComplainPost**
> commentsIdComplainPost(id, content)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
try {
    apiInstance.commentsIdComplainPost(id, content)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentsIdComplainPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentsIdComplainPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="commentsIdDelete"></a>
# **commentsIdDelete**
> commentsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.commentsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentsIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentsIdGet"></a>
# **commentsIdGet**
> Comment commentsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Comment = apiInstance.commentsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentsIdPut"></a>
# **commentsIdPut**
> Comment commentsIdPut(id, content)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
try {
    val result : Comment = apiInstance.commentsIdPut(id, content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#commentsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#commentsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  |

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="entriesIdCommentsGet"></a>
# **entriesIdCommentsGet**
> CommentList entriesIdCommentsGet(id, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : CommentList = apiInstance.entriesIdCommentsGet(id, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#entriesIdCommentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#entriesIdCommentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]

### Return type

[**CommentList**](CommentList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdCommentsPost"></a>
# **entriesIdCommentsPost**
> Comment entriesIdCommentsPost(id, content)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommentsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
try {
    val result : Comment = apiInstance.entriesIdCommentsPost(id, content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommentsApi#entriesIdCommentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommentsApi#entriesIdCommentsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  |

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

