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

import org.openapitools.client.models.CommentList
import org.openapitools.client.models.EntryRights
import org.openapitools.client.models.Image
import org.openapitools.client.models.Rating
import org.openapitools.client.models.User

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param author 
 * @param createdAt 
 * @param rating 
 * @param title 
 * @param cutTitle 
 * @param content 
 * @param cutContent 
 * @param editContent 
 * @param hasCut 
 * @param images 
 * @param tags 
 * @param wordCount 
 * @param privacy 
 * @param visibleFor 
 * @param isCommentable 
 * @param inLive 
 * @param commentCount 
 * @param favoriteCount 
 * @param isFavorited 
 * @param isWatching 
 * @param comments 
 * @param rights 
 */

data class Entry (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "author")
    val author: User? = null,

    @Json(name = "createdAt")
    val createdAt: kotlin.Double? = null,

    @Json(name = "rating")
    val rating: Rating? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "cutTitle")
    val cutTitle: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "cutContent")
    val cutContent: kotlin.String? = null,

    @Json(name = "editContent")
    val editContent: kotlin.String? = null,

    @Json(name = "hasCut")
    val hasCut: kotlin.Boolean? = null,

    @Json(name = "images")
    val images: kotlin.collections.List<Image>? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "wordCount")
    val wordCount: kotlin.Int? = null,

    @Json(name = "privacy")
    val privacy: Entry.Privacy? = null,

    @Json(name = "visibleFor")
    val visibleFor: kotlin.collections.List<User>? = null,

    @Json(name = "isCommentable")
    val isCommentable: kotlin.Boolean? = null,

    @Json(name = "inLive")
    val inLive: kotlin.Boolean? = null,

    @Json(name = "commentCount")
    val commentCount: kotlin.Int? = null,

    @Json(name = "favoriteCount")
    val favoriteCount: kotlin.Int? = null,

    @Json(name = "isFavorited")
    val isFavorited: kotlin.Boolean? = null,

    @Json(name = "isWatching")
    val isWatching: kotlin.Boolean? = null,

    @Json(name = "comments")
    val comments: CommentList? = null,

    @Json(name = "rights")
    val rights: EntryRights? = null

) {

    /**
     * 
     *
     * Values: all,registered,invited,followers,some,me,anonymous
     */
    enum class Privacy(val value: kotlin.String) {
        @Json(name = "all") all("all"),
        @Json(name = "registered") registered("registered"),
        @Json(name = "invited") invited("invited"),
        @Json(name = "followers") followers("followers"),
        @Json(name = "some") some("some"),
        @Json(name = "me") me("me"),
        @Json(name = "anonymous") anonymous("anonymous");
    }
}
