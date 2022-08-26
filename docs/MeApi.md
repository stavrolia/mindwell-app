# MeApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meAvatarPut**](MeApi.md#meAvatarPut) | **PUT** /me/avatar | 
[**meCalendarGet**](MeApi.md#meCalendarGet) | **GET** /me/calendar | 
[**meCoverPut**](MeApi.md#meCoverPut) | **PUT** /me/cover | 
[**meFavoritesGet**](MeApi.md#meFavoritesGet) | **GET** /me/favorites | 
[**meFollowersGet**](MeApi.md#meFollowersGet) | **GET** /me/followers | 
[**meFollowingsGet**](MeApi.md#meFollowingsGet) | **GET** /me/followings | 
[**meGet**](MeApi.md#meGet) | **GET** /me | 
[**meHiddenGet**](MeApi.md#meHiddenGet) | **GET** /me/hidden | 
[**meIgnoredGet**](MeApi.md#meIgnoredGet) | **GET** /me/ignored | 
[**meImagesGet**](MeApi.md#meImagesGet) | **GET** /me/images | 
[**meInvitedGet**](MeApi.md#meInvitedGet) | **GET** /me/invited | 
[**meOnlinePut**](MeApi.md#meOnlinePut) | **PUT** /me/online | 
[**mePut**](MeApi.md#mePut) | **PUT** /me | 
[**meRequestedGet**](MeApi.md#meRequestedGet) | **GET** /me/requested | 
[**meTagsGet**](MeApi.md#meTagsGet) | **GET** /me/tags | 
[**meTlogGet**](MeApi.md#meTlogGet) | **GET** /me/tlog | 
[**meTlogPost**](MeApi.md#meTlogPost) | **POST** /me/tlog | 


<a name="meAvatarPut"></a>
# **meAvatarPut**
> meAvatarPut(file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.meAvatarPut(file)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meAvatarPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meAvatarPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  |

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

<a name="meCalendarGet"></a>
# **meCalendarGet**
> Calendar meCalendarGet(start, end, limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val start : kotlin.Long = 789 // kotlin.Long | 
val end : kotlin.Long = 789 // kotlin.Long | 
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : Calendar = apiInstance.meCalendarGet(start, end, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meCalendarGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meCalendarGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **kotlin.Long**|  | [optional] [default to 0]
 **end** | **kotlin.Long**|  | [optional] [default to 0]
 **limit** | **kotlin.Int**|  | [optional] [default to 1000]

### Return type

[**Calendar**](Calendar.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="meCoverPut"></a>
# **meCoverPut**
> meCoverPut(file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.meCoverPut(file)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meCoverPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meCoverPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  |

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

<a name="meFavoritesGet"></a>
# **meFavoritesGet**
> Feed meFavoritesGet(limit, after, before, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.meFavoritesGet(limit, after, before, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meFavoritesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meFavoritesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meFollowersGet"></a>
# **meFollowersGet**
> FriendList meFollowersGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meFollowersGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meFollowersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meFollowersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meFollowingsGet"></a>
# **meFollowingsGet**
> FriendList meFollowingsGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meFollowingsGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meFollowingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meFollowingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meGet"></a>
# **meGet**
> AuthProfile meGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
try {
    val result : AuthProfile = apiInstance.meGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthProfile**](AuthProfile.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="meHiddenGet"></a>
# **meHiddenGet**
> FriendList meHiddenGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meHiddenGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meHiddenGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meHiddenGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meIgnoredGet"></a>
# **meIgnoredGet**
> FriendList meIgnoredGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meIgnoredGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meIgnoredGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meIgnoredGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meImagesGet"></a>
# **meImagesGet**
> ImageList meImagesGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : ImageList = apiInstance.meImagesGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meImagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meImagesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meInvitedGet"></a>
# **meInvitedGet**
> FriendList meInvitedGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meInvitedGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meInvitedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meInvitedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meOnlinePut"></a>
# **meOnlinePut**
> MeOnlinePut200Response meOnlinePut()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
try {
    val result : MeOnlinePut200Response = apiInstance.meOnlinePut()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meOnlinePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meOnlinePut")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MeOnlinePut200Response**](MeOnlinePut200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mePut"></a>
# **mePut**
> Profile mePut(showName, privacy, gender, isDaylog, title, birthday, country, city, showInTops)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val showName : kotlin.String = showName_example // kotlin.String | 
val privacy : kotlin.String = privacy_example // kotlin.String | 
val gender : kotlin.String = gender_example // kotlin.String | 
val isDaylog : kotlin.Boolean = true // kotlin.Boolean | 
val title : kotlin.String = title_example // kotlin.String | 
val birthday : kotlin.String = birthday_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | 
val city : kotlin.String = city_example // kotlin.String | 
val showInTops : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Profile = apiInstance.mePut(showName, privacy, gender, isDaylog, title, birthday, country, city, showInTops)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#mePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#mePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showName** | **kotlin.String**|  |
 **privacy** | **kotlin.String**|  | [enum: all, invited, followers, registered]
 **gender** | **kotlin.String**|  | [optional] [default to not set] [enum: male, female, not set]
 **isDaylog** | **kotlin.Boolean**|  | [optional] [default to false]
 **title** | **kotlin.String**|  | [optional]
 **birthday** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**|  | [optional]
 **city** | **kotlin.String**|  | [optional]
 **showInTops** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**Profile**](Profile.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="meRequestedGet"></a>
# **meRequestedGet**
> FriendList meRequestedGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : FriendList = apiInstance.meRequestedGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meRequestedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meRequestedGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="meTagsGet"></a>
# **meTagsGet**
> TagList meTagsGet(limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TagList = apiInstance.meTagsGet(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meTagsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional] [default to 30]

### Return type

[**TagList**](TagList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="meTlogGet"></a>
# **meTlogGet**
> Feed meTlogGet(limit, after, before, tag, sort, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val sort : kotlin.String = sort_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.meTlogGet(limit, after, before, tag, sort, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meTlogGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meTlogGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **after** | **kotlin.String**|  | [optional]
 **before** | **kotlin.String**|  | [optional]
 **tag** | **kotlin.String**|  | [optional]
 **sort** | **kotlin.String**|  | [optional] [default to new] [enum: new, old, best]
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

<a name="meTlogPost"></a>
# **meTlogPost**
> Entry meTlogPost(content, privacy, title, images, tags, visibleFor, isCommentable, isVotable, inLive)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val content : kotlin.String = content_example // kotlin.String | 
val privacy : kotlin.String = privacy_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val images : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | 
val tags : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | 
val visibleFor : kotlin.collections.List<kotlin.Long> =  // kotlin.collections.List<kotlin.Long> | 
val isCommentable : kotlin.Boolean = true // kotlin.Boolean | 
val isVotable : kotlin.Boolean = true // kotlin.Boolean | 
val inLive : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Entry = apiInstance.meTlogPost(content, privacy, title, images, tags, visibleFor, isCommentable, isVotable, inLive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#meTlogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#meTlogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**|  |
 **privacy** | **kotlin.String**|  | [enum: all, registered, invited, followers, some, me]
 **title** | **kotlin.String**|  | [optional]
 **images** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)|  | [optional]
 **tags** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **visibleFor** | [**kotlin.collections.List&lt;kotlin.Long&gt;**](kotlin.Long.md)|  | [optional]
 **isCommentable** | **kotlin.Boolean**|  | [optional] [default to true]
 **isVotable** | **kotlin.Boolean**|  | [optional] [default to false]
 **inLive** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**Entry**](Entry.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

