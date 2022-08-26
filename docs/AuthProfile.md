
# AuthProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**showName** | **kotlin.String** |  |  [optional]
**isOnline** | **kotlin.Boolean** |  |  [optional]
**avatar** | [**Avatar**](Avatar.md) |  |  [optional]
**gender** | [**inline**](#Gender) |  |  [optional]
**privacy** | [**inline**](#Privacy) |  |  [optional]
**title** | **kotlin.String** |  |  [optional]
**rank** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**lastSeenAt** | **kotlin.Double** |  |  [optional]
**cover** | [**Cover**](Cover.md) |  |  [optional]
**counts** | [**FriendAllOfCounts**](FriendAllOfCounts.md) |  |  [optional]
**isDaylog** | **kotlin.Boolean** |  |  [optional]
**createdAt** | **kotlin.Double** |  |  [optional]
**invitedBy** | [**User**](User.md) |  |  [optional]
**ageLowerBound** | **kotlin.Int** |  |  [optional]
**ageUpperBound** | **kotlin.Int** |  |  [optional]
**country** | **kotlin.String** |  |  [optional]
**city** | **kotlin.String** |  |  [optional]
**design** | [**Design**](Design.md) |  |  [optional]
**relations** | [**ProfileAllOfRelations**](ProfileAllOfRelations.md) |  |  [optional]
**birthday** | **kotlin.String** |  |  [optional]
**showInTops** | **kotlin.Boolean** |  |  [optional]
**account** | [**AuthProfileAllOfAccount**](AuthProfileAllOfAccount.md) |  |  [optional]
**ban** | [**AuthProfileAllOfBan**](AuthProfileAllOfBan.md) |  |  [optional]


<a name="Gender"></a>
## Enum: gender
Name | Value
---- | -----
gender | male, female, not set


<a name="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | all, followers, invited, registered



