# AdmApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admGrandfatherGet**](AdmApi.md#admGrandfatherGet) | **GET** /adm/grandfather | 
[**admGrandfatherStatusGet**](AdmApi.md#admGrandfatherStatusGet) | **GET** /adm/grandfather/status | 
[**admGrandfatherStatusPost**](AdmApi.md#admGrandfatherStatusPost) | **POST** /adm/grandfather/status | 
[**admGrandsonGet**](AdmApi.md#admGrandsonGet) | **GET** /adm/grandson | 
[**admGrandsonPost**](AdmApi.md#admGrandsonPost) | **POST** /adm/grandson | 
[**admGrandsonStatusGet**](AdmApi.md#admGrandsonStatusGet) | **GET** /adm/grandson/status | 
[**admGrandsonStatusPost**](AdmApi.md#admGrandsonStatusPost) | **POST** /adm/grandson/status | 
[**admStatGet**](AdmApi.md#admStatGet) | **GET** /adm/stat | 


<a name="admGrandfatherGet"></a>
# **admGrandfatherGet**
> AdmGrandfatherGet200Response admGrandfatherGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
try {
    val result : AdmGrandfatherGet200Response = apiInstance.admGrandfatherGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandfatherGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandfatherGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdmGrandfatherGet200Response**](AdmGrandfatherGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="admGrandfatherStatusGet"></a>
# **admGrandfatherStatusGet**
> AdmGrandsonStatusGet200Response admGrandfatherStatusGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
try {
    val result : AdmGrandsonStatusGet200Response = apiInstance.admGrandfatherStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandfatherStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandfatherStatusGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdmGrandsonStatusGet200Response**](AdmGrandsonStatusGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="admGrandfatherStatusPost"></a>
# **admGrandfatherStatusPost**
> admGrandfatherStatusPost(sent)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
val sent : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.admGrandfatherStatusPost(sent)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandfatherStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandfatherStatusPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sent** | **kotlin.Boolean**|  |

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

<a name="admGrandsonGet"></a>
# **admGrandsonGet**
> AdmGrandsonGet200Response admGrandsonGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
try {
    val result : AdmGrandsonGet200Response = apiInstance.admGrandsonGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandsonGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandsonGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdmGrandsonGet200Response**](AdmGrandsonGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="admGrandsonPost"></a>
# **admGrandsonPost**
> admGrandsonPost(postcode, country, address, name, comment, anonymous)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
val postcode : kotlin.String = postcode_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val address : kotlin.String = address_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val comment : kotlin.String = comment_example // kotlin.String | 
val anonymous : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.admGrandsonPost(postcode, country, address, name, comment, anonymous)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandsonPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandsonPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcode** | **kotlin.String**|  |
 **country** | **kotlin.String**|  |
 **address** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **comment** | **kotlin.String**|  | [optional]
 **anonymous** | **kotlin.Boolean**|  | [optional] [default to false]

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

<a name="admGrandsonStatusGet"></a>
# **admGrandsonStatusGet**
> AdmGrandsonStatusGet200Response admGrandsonStatusGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
try {
    val result : AdmGrandsonStatusGet200Response = apiInstance.admGrandsonStatusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandsonStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandsonStatusGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdmGrandsonStatusGet200Response**](AdmGrandsonStatusGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="admGrandsonStatusPost"></a>
# **admGrandsonStatusPost**
> admGrandsonStatusPost(received)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
val received : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.admGrandsonStatusPost(received)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admGrandsonStatusPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admGrandsonStatusPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **received** | **kotlin.Boolean**|  |

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

<a name="admStatGet"></a>
# **admStatGet**
> AdmStatGet200Response admStatGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdmApi()
try {
    val result : AdmStatGet200Response = apiInstance.admStatGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdmApi#admStatGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdmApi#admStatGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdmStatGet200Response**](AdmStatGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

