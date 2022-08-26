# DesignApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**designFontsGet**](DesignApi.md#designFontsGet) | **GET** /design/fonts | 
[**designGet**](DesignApi.md#designGet) | **GET** /design | 
[**designPut**](DesignApi.md#designPut) | **PUT** /design | 


<a name="designFontsGet"></a>
# **designFontsGet**
> DesignFontsGet200Response designFontsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DesignApi()
try {
    val result : DesignFontsGet200Response = apiInstance.designFontsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DesignApi#designFontsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DesignApi#designFontsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DesignFontsGet200Response**](DesignFontsGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="designGet"></a>
# **designGet**
> Design designGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DesignApi()
try {
    val result : Design = apiInstance.designGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DesignApi#designGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DesignApi#designGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Design**](Design.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="designPut"></a>
# **designPut**
> Design designPut(textAlignment, css, backgroundColor, textColor, fontFamily, fontSize)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DesignApi()
val textAlignment : kotlin.String = textAlignment_example // kotlin.String | 
val css : kotlin.String = css_example // kotlin.String | 
val backgroundColor : kotlin.String = backgroundColor_example // kotlin.String | 
val textColor : kotlin.String = textColor_example // kotlin.String | 
val fontFamily : kotlin.String = fontFamily_example // kotlin.String | 
val fontSize : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : Design = apiInstance.designPut(textAlignment, css, backgroundColor, textColor, fontFamily, fontSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DesignApi#designPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DesignApi#designPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **textAlignment** | **kotlin.String**|  | [enum: left, right, center, justify]
 **css** | **kotlin.String**|  | [optional]
 **backgroundColor** | **kotlin.String**|  | [optional] [default to &quot;#ffffff&quot;]
 **textColor** | **kotlin.String**|  | [optional] [default to &quot;#000000&quot;]
 **fontFamily** | **kotlin.String**|  | [optional]
 **fontSize** | **kotlin.Int**|  | [optional]

### Return type

[**Design**](Design.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

