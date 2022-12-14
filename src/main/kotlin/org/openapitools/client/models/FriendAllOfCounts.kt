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
 * @param propertyEntries 
 * @param followings 
 * @param followers 
 * @param ignored 
 * @param invited 
 * @param comments 
 * @param favorites 
 * @param tags 
 * @param days 
 */

data class FriendAllOfCounts (

    @Json(name = "entries")
    val propertyEntries: kotlin.Int? = null,

    @Json(name = "followings")
    val followings: kotlin.Int? = null,

    @Json(name = "followers")
    val followers: kotlin.Int? = null,

    @Json(name = "ignored")
    val ignored: kotlin.Int? = null,

    @Json(name = "invited")
    val invited: kotlin.Int? = null,

    @Json(name = "comments")
    val comments: kotlin.Int? = null,

    @Json(name = "favorites")
    val favorites: kotlin.Int? = null,

    @Json(name = "tags")
    val tags: kotlin.Int? = null,

    @Json(name = "days")
    val days: kotlin.Int? = null

)

