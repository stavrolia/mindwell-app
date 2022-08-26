# EntriesApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entriesAnonymousGet**](EntriesApi.md#entriesAnonymousGet) | **GET** /entries/anonymous | 
[**entriesAnonymousPost**](EntriesApi.md#entriesAnonymousPost) | **POST** /entries/anonymous | 
[**entriesBestGet**](EntriesApi.md#entriesBestGet) | **GET** /entries/best | 
[**entriesFriendsGet**](EntriesApi.md#entriesFriendsGet) | **GET** /entries/friends | 
[**entriesIdAdjacentGet**](EntriesApi.md#entriesIdAdjacentGet) | **GET** /entries/{id}/adjacent | 
[**entriesIdComplainPost**](EntriesApi.md#entriesIdComplainPost) | **POST** /entries/{id}/complain | 
[**entriesIdDelete**](EntriesApi.md#entriesIdDelete) | **DELETE** /entries/{id} | 
[**entriesIdGet**](EntriesApi.md#entriesIdGet) | **GET** /entries/{id} | 
[**entriesIdPut**](EntriesApi.md#entriesIdPut) | **PUT** /entries/{id} | 
[**entriesLiveGet**](EntriesApi.md#entriesLiveGet) | **GET** /entries/live | 
[**entriesRandomGet**](EntriesApi.md#entriesRandomGet) | **GET** /entries/random | 
[**entriesTagsGet**](EntriesApi.md#entriesTagsGet) | **GET** /entries/tags | 
[**entriesWatchingGet**](EntriesApi.md#entriesWatchingGet) | **GET** /entries/watching | 


<a name="entriesAnonymousGet"></a>
# **entriesAnonymousGet**
> Feed entriesAnonymousGet(limit, after, before, tag, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.entriesAnonymousGet(limit, after, before, tag, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesAnonymousGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesAnonymousGet")
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

<a name="entriesAnonymousPost"></a>
# **entriesAnonymousPost**
> Entry entriesAnonymousPost(content, title, images, tags, anonymousComments)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val content : kotlin.String = content_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val images : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | 
val tags : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | 
val anonymousComments : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Entry = apiInstance.entriesAnonymousPost(content, title, images, tags, anonymousComments)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesAnonymousPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesAnonymousPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **kotlin.String**|  |
 **title** | **kotlin.String**|  | [optional]
 **images** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)|  | [optional]
 **tags** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **anonymousComments** | **kotlin.Boolean**|  | [optional] [default to false]

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

<a name="entriesBestGet"></a>
# **entriesBestGet**
> Feed entriesBestGet(limit, tag, query, category)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val tag : kotlin.String = tag_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
val category : kotlin.String = category_example // kotlin.String | 
try {
    val result : Feed = apiInstance.entriesBestGet(limit, tag, query, category)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesBestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesBestGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**|  | [optional] [default to 30]
 **tag** | **kotlin.String**|  | [optional]
 **query** | **kotlin.String**|  | [optional]
 **category** | **kotlin.String**|  | [optional] [default to month] [enum: month, week]

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

<a name="entriesFriendsGet"></a>
# **entriesFriendsGet**
> Feed entriesFriendsGet(limit, after, before, tag, query)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    val result : Feed = apiInstance.entriesFriendsGet(limit, after, before, tag, query)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesFriendsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesFriendsGet")
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

<a name="entriesIdAdjacentGet"></a>
# **entriesIdAdjacentGet**
> AdjacentEntries entriesIdAdjacentGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : AdjacentEntries = apiInstance.entriesIdAdjacentGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesIdAdjacentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesIdAdjacentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**AdjacentEntries**](AdjacentEntries.md)

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

<a name="entriesIdComplainPost"></a>
# **entriesIdComplainPost**
> entriesIdComplainPost(id, content)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
try {
    apiInstance.entriesIdComplainPost(id, content)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesIdComplainPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesIdComplainPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  | [optional]

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

<a name="entriesIdDelete"></a>
# **entriesIdDelete**
> entriesIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.entriesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesIdDelete")
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

<a name="entriesIdGet"></a>
# **entriesIdGet**
> Entry entriesIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Entry = apiInstance.entriesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Entry**](Entry.md)

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

<a name="entriesIdPut"></a>
# **entriesIdPut**
> Entry entriesIdPut(id, content, privacy, title, images, tags, visibleFor, isCommentable, isVotable, inLive, anonymousComments)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
val privacy : kotlin.String = privacy_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val images : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | 
val tags : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | 
val visibleFor : kotlin.collections.List<kotlin.Long> =  // kotlin.collections.List<kotlin.Long> | 
val isCommentable : kotlin.Boolean = true // kotlin.Boolean | 
val isVotable : kotlin.Boolean = true // kotlin.Boolean | 
val inLive : kotlin.Boolean = true // kotlin.Boolean | 
val anonymousComments : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Entry = apiInstance.entriesIdPut(id, content, privacy, title, images, tags, visibleFor, isCommentable, isVotable, inLive, anonymousComments)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  |
 **privacy** | **kotlin.String**|  | [enum: all, registered, invited, followers, some, me, anonymous]
 **title** | **kotlin.String**|  | [optional]
 **images** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)|  | [optional]
 **tags** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]
 **visibleFor** | [**kotlin.collections.List&lt;kotlin.Long&gt;**](kotlin.Long.md)|  | [optional]
 **isCommentable** | **kotlin.Boolean**|  | [optional] [default to true]
 **isVotable** | **kotlin.Boolean**|  | [optional] [default to false]
 **inLive** | **kotlin.Boolean**|  | [optional] [default to false]
 **anonymousComments** | **kotlin.Boolean**|  | [optional] [default to false]

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

<a name="entriesLiveGet"></a>
# **entriesLiveGet**
> Feed entriesLiveGet(limit, after, before, tag, query, section)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
val tag : kotlin.String = tag_example // kotlin.String | 
val query : kotlin.String = query_example // kotlin.String | 
val section : kotlin.String = section_example // kotlin.String | 
try {
    val result : Feed = apiInstance.entriesLiveGet(limit, after, before, tag, query, section)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesLiveGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesLiveGet")
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
 **query** | **kotlin.String**|  | [optional]
 **section** | **kotlin.String**|  | [optional] [default to entries] [enum: entries, comments, waiting]

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

<a name="entriesRandomGet"></a>
# **entriesRandomGet**
> Entry entriesRandomGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
try {
    val result : Entry = apiInstance.entriesRandomGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesRandomGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesRandomGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Entry**](Entry.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entriesTagsGet"></a>
# **entriesTagsGet**
> TagList entriesTagsGet(limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TagList = apiInstance.entriesTagsGet(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesTagsGet")
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

<a name="entriesWatchingGet"></a>
# **entriesWatchingGet**
> Feed entriesWatchingGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EntriesApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : Feed = apiInstance.entriesWatchingGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntriesApi#entriesWatchingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntriesApi#entriesWatchingGet")
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

[**Feed**](Feed.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

