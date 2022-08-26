# UsersApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersGet**](UsersApi.md#usersGet) | **GET** /users | 
[**usersNameCalendarGet**](UsersApi.md#usersNameCalendarGet) | **GET** /users/{name}/calendar | 
[**usersNameFavoritesGet**](UsersApi.md#usersNameFavoritesGet) | **GET** /users/{name}/favorites | 
[**usersNameFollowersGet**](UsersApi.md#usersNameFollowersGet) | **GET** /users/{name}/followers | 
[**usersNameFollowingsGet**](UsersApi.md#usersNameFollowingsGet) | **GET** /users/{name}/followings | 
[**usersNameGet**](UsersApi.md#usersNameGet) | **GET** /users/{name} | 
[**usersNameImagesGet**](UsersApi.md#usersNameImagesGet) | **GET** /users/{name}/images | 
[**usersNameInvitedGet**](UsersApi.md#usersNameInvitedGet) | **GET** /users/{name}/invited | 
[**usersNameTagsGet**](UsersApi.md#usersNameTagsGet) | **GET** /users/{name}/tags | 
[**usersNameTlogGet**](UsersApi.md#usersNameTlogGet) | **GET** /users/{name}/tlog | 


<a name="usersGet"></a>
# **usersGet**
> UsersGet200Response usersGet(top, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val top : kotlin.String = top_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : UsersGet200Response = apiInstance.usersGet(top, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **top** | **kotlin.String**|  | [optional] [default to new] [enum: new, rank, waiting]
 **query** | **kotlin.String**|  | [optional]

### Return type

[**UsersGet200Response**](UsersGet200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameCalendarGet"></a>
# **usersNameCalendarGet**
> Calendar usersNameCalendarGet(name, start, end, limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val start : kotlin.Long = 789 // kotlin.Long | 
val end : kotlin.Long = 789 // kotlin.Long | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : Calendar = apiInstance.usersNameCalendarGet(name, start, end, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameCalendarGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameCalendarGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **start** | **kotlin.Long**|  | [optional] [default to 0]
 **end** | **kotlin.Long**|  | [optional] [default to 0]
 **limit** | **kotlin.Int**|  | [optional] [default to 1000]

### Return type

[**Calendar**](Calendar.md)

### Authorization


Configure OAuth2App:
    ApiClient.accessToken = ""
Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameFavoritesGet"></a>
# **usersNameFavoritesGet**
> Feed usersNameFavoritesGet(name, limit, after, before, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.usersNameFavoritesGet(name, limit, after, before, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameFavoritesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameFavoritesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]
 **query** | **kotlin.String**|  | [optional]

### Return type

[**Feed**](Feed.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameFollowersGet"></a>
# **usersNameFollowersGet**
> FriendList usersNameFollowersGet(name, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.usersNameFollowersGet(name, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameFollowersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameFollowersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]

### Return type

[**FriendList**](FriendList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameFollowingsGet"></a>
# **usersNameFollowingsGet**
> FriendList usersNameFollowingsGet(name, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.usersNameFollowingsGet(name, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameFollowingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameFollowingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]

### Return type

[**FriendList**](FriendList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameGet"></a>
# **usersNameGet**
> Profile usersNameGet(name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Profile = apiInstance.usersNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Profile**](Profile.md)

### Authorization


Configure OAuth2App:
    ApiClient.accessToken = ""
Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameImagesGet"></a>
# **usersNameImagesGet**
> ImageList usersNameImagesGet(name, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : ImageList = apiInstance.usersNameImagesGet(name, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameImagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameImagesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]

### Return type

[**ImageList**](ImageList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameInvitedGet"></a>
# **usersNameInvitedGet**
> FriendList usersNameInvitedGet(name, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.usersNameInvitedGet(name, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameInvitedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameInvitedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]

### Return type

[**FriendList**](FriendList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameTagsGet"></a>
# **usersNameTagsGet**
> TagList usersNameTagsGet(name, limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TagList = apiInstance.usersNameTagsGet(name, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameTagsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]

### Return type

[**TagList**](TagList.md)

### Authorization


Configure OAuth2App:
    ApiClient.accessToken = ""
Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersNameTlogGet"></a>
# **usersNameTlogGet**
> Feed usersNameTlogGet(name, limit, after, before, tag, sort, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.usersNameTlogGet(name, limit, after, before, tag, sort, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersNameTlogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersNameTlogGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [default to new] [enum: new, old, best]
 **query** | **kotlin.String**|  | [optional]

### Return type

[**Feed**](Feed.md)

### Authorization


Configure OAuth2App:
    ApiClient.accessToken = ""
Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

