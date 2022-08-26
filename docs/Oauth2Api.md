# Oauth2Api

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth2AllowPost**](Oauth2Api.md#oauth2AllowPost) | **POST** /oauth2/allow | only for internal usage
[**oauth2AppsIdGet**](Oauth2Api.md#oauth2AppsIdGet) | **GET** /oauth2/apps/{id} | 
[**oauth2DenyGet**](Oauth2Api.md#oauth2DenyGet) | **GET** /oauth2/deny | only for internal usage
[**oauth2TokenPost**](Oauth2Api.md#oauth2TokenPost) | **POST** /oauth2/token | 


<a name="oauth2AllowPost"></a>
# **oauth2AllowPost**
> Oauth2AllowPost200Response oauth2AllowPost(responseType, clientId, redirectUri, scope, state, codeChallenge, codeChallengeMethod)

only for internal usage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Oauth2Api()
val responseType : kotlin.String = responseType_example // kotlin.String | 
val clientId : kotlin.Int = 56 // kotlin.Int | 
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | 
val scope : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val state : kotlin.String = state_example // kotlin.String | 
val codeChallenge : kotlin.String = codeChallenge_example // kotlin.String | 
val codeChallengeMethod : kotlin.String = codeChallengeMethod_example // kotlin.String | 
try {
    val result : Oauth2AllowPost200Response = apiInstance.oauth2AllowPost(responseType, clientId, redirectUri, scope, state, codeChallenge, codeChallengeMethod)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AllowPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AllowPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseType** | **kotlin.String**|  | [enum: code]
 **clientId** | **kotlin.Int**|  |
 **redirectUri** | **kotlin.String**|  |
 **scope** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  |
 **state** | **kotlin.String**|  | [optional]
 **codeChallenge** | **kotlin.String**|  | [optional]
 **codeChallengeMethod** | **kotlin.String**|  | [optional] [enum: plain, S256]

### Return type

[**Oauth2AllowPost200Response**](Oauth2AllowPost200Response.md)

### Authorization


Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="oauth2AppsIdGet"></a>
# **oauth2AppsIdGet**
> App oauth2AppsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Oauth2Api()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : App = apiInstance.oauth2AppsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2AppsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2AppsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**App**](App.md)

### Authorization


Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2DenyGet"></a>
# **oauth2DenyGet**
> oauth2DenyGet(clientId, redirectUri)

only for internal usage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Oauth2Api()
val clientId : kotlin.Int = 56 // kotlin.Int | 
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | 
try {
    apiInstance.oauth2DenyGet(clientId, redirectUri)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2DenyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2DenyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.Int**|  |
 **redirectUri** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauth2TokenPost"></a>
# **oauth2TokenPost**
> OAuth2Token oauth2TokenPost(grantType, clientId, clientSecret, code, redirectUri, codeVerifier, refreshToken, username, password)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Oauth2Api()
val grantType : kotlin.String = grantType_example // kotlin.String | 
val clientId : kotlin.Int = 56 // kotlin.Int | 
val clientSecret : kotlin.String = clientSecret_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val redirectUri : kotlin.String = redirectUri_example // kotlin.String | 
val codeVerifier : kotlin.String = codeVerifier_example // kotlin.String | 
val refreshToken : kotlin.String = refreshToken_example // kotlin.String | 
val username : kotlin.String = username_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
try {
    val result : OAuth2Token = apiInstance.oauth2TokenPost(grantType, clientId, clientSecret, code, redirectUri, codeVerifier, refreshToken, username, password)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Oauth2Api#oauth2TokenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Oauth2Api#oauth2TokenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **kotlin.String**|  | [enum: authorization_code, client_credentials, password, refresh_token]
 **clientId** | **kotlin.Int**|  |
 **clientSecret** | **kotlin.String**|  | [optional]
 **code** | **kotlin.String**|  | [optional]
 **redirectUri** | **kotlin.String**|  | [optional]
 **codeVerifier** | **kotlin.String**|  | [optional]
 **refreshToken** | **kotlin.String**|  | [optional]
 **username** | **kotlin.String**|  | [optional]
 **password** | **kotlin.String**|  | [optional]

### Return type

[**OAuth2Token**](OAuth2Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

