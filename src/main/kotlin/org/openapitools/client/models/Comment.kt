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

import org.openapitools.client.models.CommentRights
import org.openapitools.client.models.Rating
import org.openapitools.client.models.User

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param author 
 * @param entryId 
 * @param createdAt 
 * @param content 
 * @param editContent 
 * @param rating 
 * @param rights 
 */

data class Comment (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "author")
    val author: User? = null,

    @Json(name = "entryId")
    val entryId: kotlin.Long? = null,

    @Json(name = "createdAt")
    val createdAt: kotlin.Double? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "editContent")
    val editContent: kotlin.String? = null,

    @Json(name = "rating")
    val rating: Rating? = null,

    @Json(name = "rights")
    val rights: CommentRights? = null

)

