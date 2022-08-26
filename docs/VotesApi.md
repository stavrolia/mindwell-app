# VotesApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commentsIdVoteDelete**](VotesApi.md#commentsIdVoteDelete) | **DELETE** /comments/{id}/vote | 
[**commentsIdVoteGet**](VotesApi.md#commentsIdVoteGet) | **GET** /comments/{id}/vote | 
[**commentsIdVotePut**](VotesApi.md#commentsIdVotePut) | **PUT** /comments/{id}/vote | 
[**entriesIdVoteDelete**](VotesApi.md#entriesIdVoteDelete) | **DELETE** /entries/{id}/vote | 
[**entriesIdVoteGet**](VotesApi.md#entriesIdVoteGet) | **GET** /entries/{id}/vote | 
[**entriesIdVotePut**](VotesApi.md#entriesIdVotePut) | **PUT** /entries/{id}/vote | 


<a name="commentsIdVoteDelete"></a>
# **commentsIdVoteDelete**
> Rating commentsIdVoteDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Rating = apiInstance.commentsIdVoteDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#commentsIdVoteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#commentsIdVoteDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentsIdVoteGet"></a>
# **commentsIdVoteGet**
> Rating commentsIdVoteGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Rating = apiInstance.commentsIdVoteGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#commentsIdVoteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#commentsIdVoteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commentsIdVotePut"></a>
# **commentsIdVotePut**
> Rating commentsIdVotePut(id, positive)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val positive : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Rating = apiInstance.commentsIdVotePut(id, positive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#commentsIdVotePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#commentsIdVotePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **positive** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdVoteDelete"></a>
# **entriesIdVoteDelete**
> Rating entriesIdVoteDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Rating = apiInstance.entriesIdVoteDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#entriesIdVoteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#entriesIdVoteDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdVoteGet"></a>
# **entriesIdVoteGet**
> Rating entriesIdVoteGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Rating = apiInstance.entriesIdVoteGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#entriesIdVoteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#entriesIdVoteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdVotePut"></a>
# **entriesIdVotePut**
> Rating entriesIdVotePut(id, positive)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VotesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val positive : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Rating = apiInstance.entriesIdVotePut(id, positive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VotesApi#entriesIdVotePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VotesApi#entriesIdVotePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **positive** | **kotlin.Boolean**|  | [optional] [default to true]

### Return type

[**Rating**](Rating.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

