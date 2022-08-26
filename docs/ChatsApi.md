# ChatsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatsGet**](ChatsApi.md#chatsGet) | **GET** /chats | 
[**chatsNameGet**](ChatsApi.md#chatsNameGet) | **GET** /chats/{name} | 
[**chatsNameMessagesGet**](ChatsApi.md#chatsNameMessagesGet) | **GET** /chats/{name}/messages | 
[**chatsNameMessagesPost**](ChatsApi.md#chatsNameMessagesPost) | **POST** /chats/{name}/messages | 
[**chatsNameReadPut**](ChatsApi.md#chatsNameReadPut) | **PUT** /chats/{name}/read | 
[**messagesIdDelete**](ChatsApi.md#messagesIdDelete) | **DELETE** /messages/{id} | 
[**messagesIdGet**](ChatsApi.md#messagesIdGet) | **GET** /messages/{id} | 
[**messagesIdPut**](ChatsApi.md#messagesIdPut) | **PUT** /messages/{id} | 


<a name="chatsGet"></a>
# **chatsGet**
> ChatList chatsGet(limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : ChatList = apiInstance.chatsGet(limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#chatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#chatsGet")
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

[**ChatList**](ChatList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chatsNameGet"></a>
# **chatsNameGet**
> Chat chatsNameGet(name)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Chat = apiInstance.chatsNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#chatsNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#chatsNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |

### Return type

[**Chat**](Chat.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chatsNameMessagesGet"></a>
# **chatsNameMessagesGet**
> MessageList chatsNameMessagesGet(name, limit, after, before)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val name : kotlin.String = name_example // kotlin.String | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val after : kotlin.String = after_example // kotlin.String | 
val before : kotlin.String = before_example // kotlin.String | 
try {
    val result : MessageList = apiInstance.chatsNameMessagesGet(name, limit, after, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#chatsNameMessagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#chatsNameMessagesGet")
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

[**MessageList**](MessageList.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chatsNameMessagesPost"></a>
# **chatsNameMessagesPost**
> Message chatsNameMessagesPost(name, content, uid)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val name : kotlin.String = name_example // kotlin.String | 
val content : kotlin.String = content_example // kotlin.String | 
val uid : java.math.BigDecimal = 8.14 // java.math.BigDecimal | unique message id
try {
    val result : Message = apiInstance.chatsNameMessagesPost(name, content, uid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#chatsNameMessagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#chatsNameMessagesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **content** | **kotlin.String**|  |
 **uid** | **java.math.BigDecimal**| unique message id |

### Return type

[**Message**](Message.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="chatsNameReadPut"></a>
# **chatsNameReadPut**
> NotificationsReadPut200Response chatsNameReadPut(name, message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val name : kotlin.String = name_example // kotlin.String | 
val message : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : NotificationsReadPut200Response = apiInstance.chatsNameReadPut(name, message)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#chatsNameReadPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#chatsNameReadPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **message** | **kotlin.Long**|  |

### Return type

[**NotificationsReadPut200Response**](NotificationsReadPut200Response.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messagesIdDelete"></a>
# **messagesIdDelete**
> messagesIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.messagesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#messagesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#messagesIdDelete")
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

<a name="messagesIdGet"></a>
# **messagesIdGet**
> Message messagesIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
try {
    val result : Message = apiInstance.messagesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#messagesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#messagesIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |

### Return type

[**Message**](Message.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messagesIdPut"></a>
# **messagesIdPut**
> Message messagesIdPut(id, content)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChatsApi()
val id : kotlin.Long = 789 // kotlin.Long | 
val content : kotlin.String = content_example // kotlin.String | 
try {
    val result : Message = apiInstance.messagesIdPut(id, content)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#messagesIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#messagesIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**|  |
 **content** | **kotlin.String**|  |

### Return type

[**Message**](Message.md)

### Authorization


Configure OAuth2Code:
    ApiClient.accessToken = ""
Configure OAuth2Password:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

