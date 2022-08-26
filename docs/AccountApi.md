# AccountApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountEmailEmailGet**](AccountApi.md#accountEmailEmailGet) | **GET** /account/email/{email} | check if email is used
[**accountEmailPost**](AccountApi.md#accountEmailPost) | **POST** /account/email | set new email
[**accountInvitesGet**](AccountApi.md#accountInvitesGet) | **GET** /account/invites | 
[**accountLoginPost**](AccountApi.md#accountLoginPost) | **POST** /account/login | 
[**accountNameNameGet**](AccountApi.md#accountNameNameGet) | **GET** /account/name/{name} | check if name is used
[**accountPasswordPost**](AccountApi.md#accountPasswordPost) | **POST** /account/password | change new password
[**accountRecoverPasswordPost**](AccountApi.md#accountRecoverPasswordPost) | **POST** /account/recover/password | reset password
[**accountRecoverPost**](AccountApi.md#accountRecoverPost) | **POST** /account/recover | request reset password email
[**accountRegisterPost**](AccountApi.md#accountRegisterPost) | **POST** /account/register | register new account
[**accountSettingsEmailGet**](AccountApi.md#accountSettingsEmailGet) | **GET** /account/settings/email | 
[**accountSettingsEmailPut**](AccountApi.md#accountSettingsEmailPut) | **PUT** /account/settings/email | 
[**accountSettingsTelegramGet**](AccountApi.md#accountSettingsTelegramGet) | **GET** /account/settings/telegram | 
[**accountSettingsTelegramPut**](AccountApi.md#accountSettingsTelegramPut) | **PUT** /account/settings/telegram | 
[**accountSubscribeTelegramDelete**](AccountApi.md#accountSubscribeTelegramDelete) | **DELETE** /account/subscribe/telegram | 
[**accountSubscribeTelegramGet**](AccountApi.md#accountSubscribeTelegramGet) | **GET** /account/subscribe/telegram | 
[**accountSubscribeTokenGet**](AccountApi.md#accountSubscribeTokenGet) | **GET** /account/subscribe/token | 
[**accountVerificationEmailGet**](AccountApi.md#accountVerificationEmailGet) | **GET** /account/verification/{email} | verify account email
[**accountVerificationPost**](AccountApi.md#accountVerificationPost) | **POST** /account/verification | request verification email


<a name="accountEmailEmailGet"></a>
# **accountEmailEmailGet**
> AccountEmailEmailGet200Response accountEmailEmailGet(email)

check if email is used

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    val result : AccountEmailEmailGet200Response = apiInstance.accountEmailEmailGet(email)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountEmailEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountEmailEmailGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |

### Return type

[**AccountEmailEmailGet200Response**](AccountEmailEmailGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountEmailPost"></a>
# **accountEmailPost**
> accountEmailPost(email, password)

set new email

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
try {
    apiInstance.accountEmailPost(email, password)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountEmailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountEmailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |
 **password** | **kotlin.String**|  |

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

<a name="accountInvitesGet"></a>
# **accountInvitesGet**
> AccountInvitesGet200Response accountInvitesGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountInvitesGet200Response = apiInstance.accountInvitesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountInvitesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountInvitesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountInvitesGet200Response**](AccountInvitesGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLoginPost"></a>
# **accountLoginPost**
> AuthProfile accountLoginPost(name, password)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val name : kotlin.String = name_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
try {
    val result : AuthProfile = apiInstance.accountLoginPost(name, password)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountLoginPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **password** | **kotlin.String**|  |

### Return type

[**AuthProfile**](AuthProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="accountNameNameGet"></a>
# **accountNameNameGet**
> AccountNameNameGet200Response accountNameNameGet(name)

check if name is used

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : AccountNameNameGet200Response = apiInstance.accountNameNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountNameNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountNameNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**AccountNameNameGet200Response**](AccountNameNameGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountPasswordPost"></a>
# **accountPasswordPost**
> accountPasswordPost(oldPassword, newPassword)

change new password

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val oldPassword : kotlin.String = oldPassword_example // kotlin.String | 
val newPassword : kotlin.String = newPassword_example // kotlin.String | 
try {
    apiInstance.accountPasswordPost(oldPassword, newPassword)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountPasswordPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oldPassword** | **kotlin.String**|  |
 **newPassword** | **kotlin.String**|  |

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

<a name="accountRecoverPasswordPost"></a>
# **accountRecoverPasswordPost**
> accountRecoverPasswordPost(email, password, date, code)

reset password

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
val date : kotlin.Long = 789 // kotlin.Long | 
val code : kotlin.String = code_example // kotlin.String | 
try {
    apiInstance.accountRecoverPasswordPost(email, password, date, code)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountRecoverPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountRecoverPasswordPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |
 **password** | **kotlin.String**|  |
 **date** | **kotlin.Long**|  |
 **code** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="accountRecoverPost"></a>
# **accountRecoverPost**
> accountRecoverPost(email)

request reset password email

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
try {
    apiInstance.accountRecoverPost(email)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountRecoverPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountRecoverPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="accountRegisterPost"></a>
# **accountRegisterPost**
> AuthProfile accountRegisterPost(email, password, name, birthday, gender, country, city)

register new account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
val password : kotlin.String = password_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val birthday : kotlin.String = birthday_example // kotlin.String | 
val gender : kotlin.String = gender_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val city : kotlin.String = city_example // kotlin.String | 
try {
    val result : AuthProfile = apiInstance.accountRegisterPost(email, password, name, birthday, gender, country, city)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountRegisterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountRegisterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |
 **password** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **birthday** | **kotlin.String**|  | [optional]
 **gender** | **kotlin.String**|  | [optional] [default to not set] [enum: not set, male, female]
 **country** | **kotlin.String**|  | [optional]
 **city** | **kotlin.String**|  | [optional]

### Return type

[**AuthProfile**](AuthProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="accountSettingsEmailGet"></a>
# **accountSettingsEmailGet**
> AccountSettingsEmailGet200Response accountSettingsEmailGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountSettingsEmailGet200Response = apiInstance.accountSettingsEmailGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSettingsEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSettingsEmailGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSettingsEmailGet200Response**](AccountSettingsEmailGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountSettingsEmailPut"></a>
# **accountSettingsEmailPut**
> accountSettingsEmailPut(comments, followers, invites)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val comments : kotlin.Boolean = true // kotlin.Boolean | 
val followers : kotlin.Boolean = true // kotlin.Boolean | 
val invites : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.accountSettingsEmailPut(comments, followers, invites)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSettingsEmailPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSettingsEmailPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comments** | **kotlin.Boolean**|  | [optional] [default to false]
 **followers** | **kotlin.Boolean**|  | [optional] [default to false]
 **invites** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="accountSettingsTelegramGet"></a>
# **accountSettingsTelegramGet**
> AccountSettingsTelegramGet200Response accountSettingsTelegramGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountSettingsTelegramGet200Response = apiInstance.accountSettingsTelegramGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSettingsTelegramGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSettingsTelegramGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSettingsTelegramGet200Response**](AccountSettingsTelegramGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountSettingsTelegramPut"></a>
# **accountSettingsTelegramPut**
> accountSettingsTelegramPut(comments, followers, invites, messages)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val comments : kotlin.Boolean = true // kotlin.Boolean | 
val followers : kotlin.Boolean = true // kotlin.Boolean | 
val invites : kotlin.Boolean = true // kotlin.Boolean | 
val messages : kotlin.Boolean = true // kotlin.Boolean | 
try {
    apiInstance.accountSettingsTelegramPut(comments, followers, invites, messages)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSettingsTelegramPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSettingsTelegramPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comments** | **kotlin.Boolean**|  | [optional] [default to false]
 **followers** | **kotlin.Boolean**|  | [optional] [default to false]
 **invites** | **kotlin.Boolean**|  | [optional] [default to false]
 **messages** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="accountSubscribeTelegramDelete"></a>
# **accountSubscribeTelegramDelete**
> accountSubscribeTelegramDelete()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    apiInstance.accountSubscribeTelegramDelete()
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSubscribeTelegramDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSubscribeTelegramDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="accountSubscribeTelegramGet"></a>
# **accountSubscribeTelegramGet**
> AccountSubscribeTokenGet200Response accountSubscribeTelegramGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountSubscribeTokenGet200Response = apiInstance.accountSubscribeTelegramGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSubscribeTelegramGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSubscribeTelegramGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSubscribeTokenGet200Response**](AccountSubscribeTokenGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountSubscribeTokenGet"></a>
# **accountSubscribeTokenGet**
> AccountSubscribeTokenGet200Response accountSubscribeTokenGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountSubscribeTokenGet200Response = apiInstance.accountSubscribeTokenGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSubscribeTokenGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSubscribeTokenGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSubscribeTokenGet200Response**](AccountSubscribeTokenGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountVerificationEmailGet"></a>
# **accountVerificationEmailGet**
> accountVerificationEmailGet(email, code)

verify account email

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val email : kotlin.String = email_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
try {
    apiInstance.accountVerificationEmailGet(email, code)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountVerificationEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountVerificationEmailGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**|  |
 **code** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountVerificationPost"></a>
# **accountVerificationPost**
> accountVerificationPost()

request verification email

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    apiInstance.accountVerificationPost()
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountVerificationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountVerificationPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

