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
 * @param postcode 
 * @param country 
 * @param address 
 * @param fullname 
 * @param comment 
 * @param name 
 */

data class AdmGrandfatherGet200Response (

    @Json(name = "postcode")
    val postcode: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "fullname")
    val fullname: kotlin.String? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

)

