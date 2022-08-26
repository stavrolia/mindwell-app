/**
 * Mindwell
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.MessageRights
import org.openapitools.client.models.User

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param chatId 
 * @param author 
 * @param createdAt 
 * @param read 
 * @param content 
 * @param editContent 
 * @param rights 
 */

data class Message (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "chatId")
    val chatId: kotlin.Long? = null,

    @Json(name = "author")
    val author: User? = null,

    @Json(name = "createdAt")
    val createdAt: kotlin.Double? = null,

    @Json(name = "read")
    val read: kotlin.Boolean? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "editContent")
    val editContent: kotlin.String? = null,

    @Json(name = "rights")
    val rights: MessageRights? = null

)
