
# Entry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  |  [optional]
**author** | [**User**](User.md) |  |  [optional]
**createdAt** | **kotlin.Double** |  |  [optional]
**rating** | [**Rating**](Rating.md) |  |  [optional]
**title** | **kotlin.String** |  |  [optional]
**cutTitle** | **kotlin.String** |  |  [optional]
**content** | **kotlin.String** |  |  [optional]
**cutContent** | **kotlin.String** |  |  [optional]
**editContent** | **kotlin.String** |  |  [optional]
**hasCut** | **kotlin.Boolean** |  |  [optional]
**images** | [**kotlin.collections.List&lt;Image&gt;**](Image.md) |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**wordCount** | **kotlin.Int** |  |  [optional]
**privacy** | [**inline**](#Privacy) |  |  [optional]
**visibleFor** | [**kotlin.collections.List&lt;User&gt;**](User.md) |  |  [optional]
**isCommentable** | **kotlin.Boolean** |  |  [optional]
**inLive** | **kotlin.Boolean** |  |  [optional]
**commentCount** | **kotlin.Int** |  |  [optional]
**favoriteCount** | **kotlin.Int** |  |  [optional]
**isFavorited** | **kotlin.Boolean** |  |  [optional]
**isWatching** | **kotlin.Boolean** |  |  [optional]
**comments** | [**CommentList**](CommentList.md) |  |  [optional]
**rights** | [**EntryRights**](EntryRights.md) |  |  [optional]


<a name="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | all, registered, invited, followers, some, me, anonymous



