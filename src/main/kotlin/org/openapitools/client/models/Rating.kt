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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param isVotable 
 * @param upCount 
 * @param downCount 
 * @param rating 
 * @param vote 
 */

data class Rating (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "isVotable")
    val isVotable: kotlin.Boolean? = null,

    @Json(name = "upCount")
    val upCount: kotlin.Int? = null,

    @Json(name = "downCount")
    val downCount: kotlin.Int? = null,

    @Json(name = "rating")
    val rating: kotlin.Float? = null,

    @Json(name = "vote")
    val vote: kotlin.Int? = null

)

