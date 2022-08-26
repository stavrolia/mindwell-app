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

import org.openapitools.client.models.Cover
import org.openapitools.client.models.FriendAllOfCounts

import com.squareup.moshi.Json

/**
 * 
 *
 * @param gender 
 * @param privacy 
 * @param title 
 * @param rank 
 * @param lastSeenAt 
 * @param cover 
 * @param counts 
 */

data class FriendAllOf (

    @Json(name = "gender")
    val gender: FriendAllOf.Gender? = null,

    @Json(name = "privacy")
    val privacy: FriendAllOf.Privacy? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "rank")
    val rank: java.math.BigDecimal? = null,

    @Json(name = "lastSeenAt")
    val lastSeenAt: kotlin.Double? = null,

    @Json(name = "cover")
    val cover: Cover? = null,

    @Json(name = "counts")
    val counts: FriendAllOfCounts? = null

) {

    /**
     * 
     *
     * Values: male,female,notSet
     */
    enum class Gender(val value: kotlin.String) {
        @Json(name = "male") male("male"),
        @Json(name = "female") female("female"),
        @Json(name = "not set") notSet("not set");
    }
    /**
     * 
     *
     * Values: all,followers,invited,registered
     */
    enum class Privacy(val value: kotlin.String) {
        @Json(name = "all") all("all"),
        @Json(name = "followers") followers("followers"),
        @Json(name = "invited") invited("invited"),
        @Json(name = "registered") registered("registered");
    }
}

