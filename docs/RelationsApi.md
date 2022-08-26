# RelationsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationsFromNameDelete**](RelationsApi.md#relationsFromNameDelete) | **DELETE** /relations/from/{name} | cancel following request or unsubscribe the user
[**relationsFromNameGet**](RelationsApi.md#relationsFromNameGet) | **GET** /relations/from/{name} | 
[**relationsFromNamePut**](RelationsApi.md#relationsFromNamePut) | **PUT** /relations/from/{name} | permit the user to follow you
[**relationsInvitedNamePost**](RelationsApi.md#relationsInvitedNamePost) | **POST** /relations/invited/{name} | 
[**relationsToNameDelete**](RelationsApi.md#relationsToNameDelete) | **DELETE** /relations/to/{name} | 
[**relationsToNameGet**](RelationsApi.md#relationsToNameGet) | **GET** /relations/to/{name} | 
[**relationsToNamePut**](RelationsApi.md#relationsToNamePut) | **PUT** /relations/to/{name} | 


<a name="relationsFromNameDelete"></a>
# **relationsFromNameDelete**
> Relationship relationsFromNameDelete(name)

cancel following request or unsubscribe the user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsFromNameDelete(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsFromNameDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsFromNameDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="relationsFromNameGet"></a>
# **relationsFromNameGet**
> Relationship relationsFromNameGet(name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsFromNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsFromNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsFromNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="relationsFromNamePut"></a>
# **relationsFromNamePut**
> Relationship relationsFromNamePut(name)

permit the user to follow you

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsFromNamePut(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsFromNamePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsFromNamePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="relationsInvitedNamePost"></a>
# **relationsInvitedNamePost**
> relationsInvitedNamePost(name, invite)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
val invite : kotlin.String = invite_example // kotlin.String | 
try {
    apiInstance.relationsInvitedNamePost(name, invite)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsInvitedNamePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsInvitedNamePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **invite** | **kotlin.String**|  |

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

<a name="relationsToNameDelete"></a>
# **relationsToNameDelete**
> Relationship relationsToNameDelete(name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsToNameDelete(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsToNameDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsToNameDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="relationsToNameGet"></a>
# **relationsToNameGet**
> Relationship relationsToNameGet(name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsToNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsToNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsToNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="relationsToNamePut"></a>
# **relationsToNamePut**
> Relationship relationsToNamePut(name, r)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RelationsApi()
val name : kotlin.String = name_example // kotlin.String | 
val r : kotlin.String = r_example // kotlin.String | 
try {
    val result : Relationship = apiInstance.relationsToNamePut(name, r)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RelationsApi#relationsToNamePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RelationsApi#relationsToNamePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **r** | **kotlin.String**|  | [enum: followed, ignored, hidden]

### Return type

[**Relationship**](Relationship.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

