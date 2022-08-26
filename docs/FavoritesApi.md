# FavoritesApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entriesIdFavoriteDelete**](FavoritesApi.md#entriesIdFavoriteDelete) | **DELETE** /entries/{id}/favorite | 
[**entriesIdFavoriteGet**](FavoritesApi.md#entriesIdFavoriteGet) | **GET** /entries/{id}/favorite | 
[**entriesIdFavoritePut**](FavoritesApi.md#entriesIdFavoritePut) | **PUT** /entries/{id}/favorite | 


<a name="entriesIdFavoriteDelete"></a>
# **entriesIdFavoriteDelete**
> FavoriteStatus entriesIdFavoriteDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FavoritesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : FavoriteStatus = apiInstance.entriesIdFavoriteDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#entriesIdFavoriteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#entriesIdFavoriteDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**FavoriteStatus**](FavoriteStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdFavoriteGet"></a>
# **entriesIdFavoriteGet**
> FavoriteStatus entriesIdFavoriteGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FavoritesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : FavoriteStatus = apiInstance.entriesIdFavoriteGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#entriesIdFavoriteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#entriesIdFavoriteGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**FavoriteStatus**](FavoriteStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesIdFavoritePut"></a>
# **entriesIdFavoritePut**
> FavoriteStatus entriesIdFavoritePut(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FavoritesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : FavoriteStatus = apiInstance.entriesIdFavoritePut(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#entriesIdFavoritePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#entriesIdFavoritePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**FavoriteStatus**](FavoriteStatus.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

