# ImagesApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imagesIdDelete**](ImagesApi.md#imagesIdDelete) | **DELETE** /images/{id} | 
[**imagesIdGet**](ImagesApi.md#imagesIdGet) | **GET** /images/{id} | 
[**imagesPost**](ImagesApi.md#imagesPost) | **POST** /images | 


<a name="imagesIdDelete"></a>
# **imagesIdDelete**
> imagesIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.imagesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imagesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imagesIdDelete")
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

<a name="imagesIdGet"></a>
# **imagesIdGet**
> Image imagesIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Image = apiInstance.imagesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imagesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imagesIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Image**](Image.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="imagesPost"></a>
# **imagesPost**
> Image imagesPost(file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : Image = apiInstance.imagesPost(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imagesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  |

### Return type

[**Image**](Image.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

