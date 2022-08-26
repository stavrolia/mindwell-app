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

import org.openapitools.client.models.ImageSize
import org.openapitools.client.models.User

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param author 
 * @param isAnimated 
 * @param processing 
 * @param thumbnail 
 * @param small 
 * @param medium 
 * @param large 
 */

data class Image (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "author")
    val author: User? = null,

    @Json(name = "isAnimated")
    val isAnimated: kotlin.Boolean? = null,

    @Json(name = "processing")
    val processing: kotlin.Boolean? = null,

    @Json(name = "thumbnail")
    val thumbnail: ImageSize? = null,

    @Json(name = "small")
    val small: ImageSize? = null,

    @Json(name = "medium")
    val medium: ImageSize? = null,

    @Json(name = "large")
    val large: ImageSize? = null

)

