# org.openapitools.client - Kotlin client library for Mindwell

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to */api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountEmailEmailGet**](docs/AccountApi.md#accountemailemailget) | **GET** /account/email/{email} | check if email is used
*AccountApi* | [**accountEmailPost**](docs/AccountApi.md#accountemailpost) | **POST** /account/email | set new email
*AccountApi* | [**accountInvitesGet**](docs/AccountApi.md#accountinvitesget) | **GET** /account/invites | 
*AccountApi* | [**accountLoginPost**](docs/AccountApi.md#accountloginpost) | **POST** /account/login | 
*AccountApi* | [**accountNameNameGet**](docs/AccountApi.md#accountnamenameget) | **GET** /account/name/{name} | check if name is used
*AccountApi* | [**accountPasswordPost**](docs/AccountApi.md#accountpasswordpost) | **POST** /account/password | change new password
*AccountApi* | [**accountRecoverPasswordPost**](docs/AccountApi.md#accountrecoverpasswordpost) | **POST** /account/recover/password | reset password
*AccountApi* | [**accountRecoverPost**](docs/AccountApi.md#accountrecoverpost) | **POST** /account/recover | request reset password email
*AccountApi* | [**accountRegisterPost**](docs/AccountApi.md#accountregisterpost) | **POST** /account/register | register new account
*AccountApi* | [**accountSettingsEmailGet**](docs/AccountApi.md#accountsettingsemailget) | **GET** /account/settings/email | 
*AccountApi* | [**accountSettingsEmailPut**](docs/AccountApi.md#accountsettingsemailput) | **PUT** /account/settings/email | 
*AccountApi* | [**accountSettingsTelegramGet**](docs/AccountApi.md#accountsettingstelegramget) | **GET** /account/settings/telegram | 
*AccountApi* | [**accountSettingsTelegramPut**](docs/AccountApi.md#accountsettingstelegramput) | **PUT** /account/settings/telegram | 
*AccountApi* | [**accountSubscribeTelegramDelete**](docs/AccountApi.md#accountsubscribetelegramdelete) | **DELETE** /account/subscribe/telegram | 
*AccountApi* | [**accountSubscribeTelegramGet**](docs/AccountApi.md#accountsubscribetelegramget) | **GET** /account/subscribe/telegram | 
*AccountApi* | [**accountSubscribeTokenGet**](docs/AccountApi.md#accountsubscribetokenget) | **GET** /account/subscribe/token | 
*AccountApi* | [**accountVerificationEmailGet**](docs/AccountApi.md#accountverificationemailget) | **GET** /account/verification/{email} | verify account email
*AccountApi* | [**accountVerificationPost**](docs/AccountApi.md#accountverificationpost) | **POST** /account/verification | request verification email
*AdmApi* | [**admGrandfatherGet**](docs/AdmApi.md#admgrandfatherget) | **GET** /adm/grandfather | 
*AdmApi* | [**admGrandfatherStatusGet**](docs/AdmApi.md#admgrandfatherstatusget) | **GET** /adm/grandfather/status | 
*AdmApi* | [**admGrandfatherStatusPost**](docs/AdmApi.md#admgrandfatherstatuspost) | **POST** /adm/grandfather/status | 
*AdmApi* | [**admGrandsonGet**](docs/AdmApi.md#admgrandsonget) | **GET** /adm/grandson | 
*AdmApi* | [**admGrandsonPost**](docs/AdmApi.md#admgrandsonpost) | **POST** /adm/grandson | 
*AdmApi* | [**admGrandsonStatusGet**](docs/AdmApi.md#admgrandsonstatusget) | **GET** /adm/grandson/status | 
*AdmApi* | [**admGrandsonStatusPost**](docs/AdmApi.md#admgrandsonstatuspost) | **POST** /adm/grandson/status | 
*AdmApi* | [**admStatGet**](docs/AdmApi.md#admstatget) | **GET** /adm/stat | 
*ChatsApi* | [**chatsGet**](docs/ChatsApi.md#chatsget) | **GET** /chats | 
*ChatsApi* | [**chatsNameGet**](docs/ChatsApi.md#chatsnameget) | **GET** /chats/{name} | 
*ChatsApi* | [**chatsNameMessagesGet**](docs/ChatsApi.md#chatsnamemessagesget) | **GET** /chats/{name}/messages | 
*ChatsApi* | [**chatsNameMessagesPost**](docs/ChatsApi.md#chatsnamemessagespost) | **POST** /chats/{name}/messages | 
*ChatsApi* | [**chatsNameReadPut**](docs/ChatsApi.md#chatsnamereadput) | **PUT** /chats/{name}/read | 
*ChatsApi* | [**messagesIdDelete**](docs/ChatsApi.md#messagesiddelete) | **DELETE** /messages/{id} | 
*ChatsApi* | [**messagesIdGet**](docs/ChatsApi.md#messagesidget) | **GET** /messages/{id} | 
*ChatsApi* | [**messagesIdPut**](docs/ChatsApi.md#messagesidput) | **PUT** /messages/{id} | 
*CommentsApi* | [**commentsIdComplainPost**](docs/CommentsApi.md#commentsidcomplainpost) | **POST** /comments/{id}/complain | 
*CommentsApi* | [**commentsIdDelete**](docs/CommentsApi.md#commentsiddelete) | **DELETE** /comments/{id} | 
*CommentsApi* | [**commentsIdGet**](docs/CommentsApi.md#commentsidget) | **GET** /comments/{id} | 
*CommentsApi* | [**commentsIdPut**](docs/CommentsApi.md#commentsidput) | **PUT** /comments/{id} | 
*CommentsApi* | [**entriesIdCommentsGet**](docs/CommentsApi.md#entriesidcommentsget) | **GET** /entries/{id}/comments | 
*CommentsApi* | [**entriesIdCommentsPost**](docs/CommentsApi.md#entriesidcommentspost) | **POST** /entries/{id}/comments | 
*DesignApi* | [**designFontsGet**](docs/DesignApi.md#designfontsget) | **GET** /design/fonts | 
*DesignApi* | [**designGet**](docs/DesignApi.md#designget) | **GET** /design | 
*DesignApi* | [**designPut**](docs/DesignApi.md#designput) | **PUT** /design | 
*EntriesApi* | [**entriesAnonymousGet**](docs/EntriesApi.md#entriesanonymousget) | **GET** /entries/anonymous | 
*EntriesApi* | [**entriesAnonymousPost**](docs/EntriesApi.md#entriesanonymouspost) | **POST** /entries/anonymous | 
*EntriesApi* | [**entriesBestGet**](docs/EntriesApi.md#entriesbestget) | **GET** /entries/best | 
*EntriesApi* | [**entriesFriendsGet**](docs/EntriesApi.md#entriesfriendsget) | **GET** /entries/friends | 
*EntriesApi* | [**entriesIdAdjacentGet**](docs/EntriesApi.md#entriesidadjacentget) | **GET** /entries/{id}/adjacent | 
*EntriesApi* | [**entriesIdComplainPost**](docs/EntriesApi.md#entriesidcomplainpost) | **POST** /entries/{id}/complain | 
*EntriesApi* | [**entriesIdDelete**](docs/EntriesApi.md#entriesiddelete) | **DELETE** /entries/{id} | 
*EntriesApi* | [**entriesIdGet**](docs/EntriesApi.md#entriesidget) | **GET** /entries/{id} | 
*EntriesApi* | [**entriesIdPut**](docs/EntriesApi.md#entriesidput) | **PUT** /entries/{id} | 
*EntriesApi* | [**entriesLiveGet**](docs/EntriesApi.md#entriesliveget) | **GET** /entries/live | 
*EntriesApi* | [**entriesRandomGet**](docs/EntriesApi.md#entriesrandomget) | **GET** /entries/random | 
*EntriesApi* | [**entriesTagsGet**](docs/EntriesApi.md#entriestagsget) | **GET** /entries/tags | 
*EntriesApi* | [**entriesWatchingGet**](docs/EntriesApi.md#entrieswatchingget) | **GET** /entries/watching | 
*FavoritesApi* | [**entriesIdFavoriteDelete**](docs/FavoritesApi.md#entriesidfavoritedelete) | **DELETE** /entries/{id}/favorite | 
*FavoritesApi* | [**entriesIdFavoriteGet**](docs/FavoritesApi.md#entriesidfavoriteget) | **GET** /entries/{id}/favorite | 
*FavoritesApi* | [**entriesIdFavoritePut**](docs/FavoritesApi.md#entriesidfavoriteput) | **PUT** /entries/{id}/favorite | 
*ImagesApi* | [**imagesIdDelete**](docs/ImagesApi.md#imagesiddelete) | **DELETE** /images/{id} | 
*ImagesApi* | [**imagesIdGet**](docs/ImagesApi.md#imagesidget) | **GET** /images/{id} | 
*ImagesApi* | [**imagesPost**](docs/ImagesApi.md#imagespost) | **POST** /images | 
*MeApi* | [**meAvatarPut**](docs/MeApi.md#meavatarput) | **PUT** /me/avatar | 
*MeApi* | [**meCalendarGet**](docs/MeApi.md#mecalendarget) | **GET** /me/calendar | 
*MeApi* | [**meCoverPut**](docs/MeApi.md#mecoverput) | **PUT** /me/cover | 
*MeApi* | [**meFavoritesGet**](docs/MeApi.md#mefavoritesget) | **GET** /me/favorites | 
*MeApi* | [**meFollowersGet**](docs/MeApi.md#mefollowersget) | **GET** /me/followers | 
*MeApi* | [**meFollowingsGet**](docs/MeApi.md#mefollowingsget) | **GET** /me/followings | 
*MeApi* | [**meGet**](docs/MeApi.md#meget) | **GET** /me | 
*MeApi* | [**meHiddenGet**](docs/MeApi.md#mehiddenget) | **GET** /me/hidden | 
*MeApi* | [**meIgnoredGet**](docs/MeApi.md#meignoredget) | **GET** /me/ignored | 
*MeApi* | [**meImagesGet**](docs/MeApi.md#meimagesget) | **GET** /me/images | 
*MeApi* | [**meInvitedGet**](docs/MeApi.md#meinvitedget) | **GET** /me/invited | 
*MeApi* | [**meOnlinePut**](docs/MeApi.md#meonlineput) | **PUT** /me/online | 
*MeApi* | [**mePut**](docs/MeApi.md#meput) | **PUT** /me | 
*MeApi* | [**meRequestedGet**](docs/MeApi.md#merequestedget) | **GET** /me/requested | 
*MeApi* | [**meTagsGet**](docs/MeApi.md#metagsget) | **GET** /me/tags | 
*MeApi* | [**meTlogGet**](docs/MeApi.md#metlogget) | **GET** /me/tlog | 
*MeApi* | [**meTlogPost**](docs/MeApi.md#metlogpost) | **POST** /me/tlog | 
*NotificationsApi* | [**notificationsGet**](docs/NotificationsApi.md#notificationsget) | **GET** /notifications | 
*NotificationsApi* | [**notificationsIdGet**](docs/NotificationsApi.md#notificationsidget) | **GET** /notifications/{id} | 
*NotificationsApi* | [**notificationsReadPut**](docs/NotificationsApi.md#notificationsreadput) | **PUT** /notifications/read | 
*Oauth2Api* | [**oauth2AllowPost**](docs/Oauth2Api.md#oauth2allowpost) | **POST** /oauth2/allow | only for internal usage
*Oauth2Api* | [**oauth2AppsIdGet**](docs/Oauth2Api.md#oauth2appsidget) | **GET** /oauth2/apps/{id} | 
*Oauth2Api* | [**oauth2DenyGet**](docs/Oauth2Api.md#oauth2denyget) | **GET** /oauth2/deny | only for internal usage
*Oauth2Api* | [**oauth2TokenPost**](docs/Oauth2Api.md#oauth2tokenpost) | **POST** /oauth2/token | 
*RelationsApi* | [**relationsFromNameDelete**](docs/RelationsApi.md#relationsfromnamedelete) | **DELETE** /relations/from/{name} | cancel following request or unsubscribe the user
*RelationsApi* | [**relationsFromNameGet**](docs/RelationsApi.md#relationsfromnameget) | **GET** /relations/from/{name} | 
*RelationsApi* | [**relationsFromNamePut**](docs/RelationsApi.md#relationsfromnameput) | **PUT** /relations/from/{name} | permit the user to follow you
*RelationsApi* | [**relationsInvitedNamePost**](docs/RelationsApi.md#relationsinvitednamepost) | **POST** /relations/invited/{name} | 
*RelationsApi* | [**relationsToNameDelete**](docs/RelationsApi.md#relationstonamedelete) | **DELETE** /relations/to/{name} | 
*RelationsApi* | [**relationsToNameGet**](docs/RelationsApi.md#relationstonameget) | **GET** /relations/to/{name} | 
*RelationsApi* | [**relationsToNamePut**](docs/RelationsApi.md#relationstonameput) | **PUT** /relations/to/{name} | 
*UsersApi* | [**usersGet**](docs/UsersApi.md#usersget) | **GET** /users | 
*UsersApi* | [**usersNameCalendarGet**](docs/UsersApi.md#usersnamecalendarget) | **GET** /users/{name}/calendar | 
*UsersApi* | [**usersNameFavoritesGet**](docs/UsersApi.md#usersnamefavoritesget) | **GET** /users/{name}/favorites | 
*UsersApi* | [**usersNameFollowersGet**](docs/UsersApi.md#usersnamefollowersget) | **GET** /users/{name}/followers | 
*UsersApi* | [**usersNameFollowingsGet**](docs/UsersApi.md#usersnamefollowingsget) | **GET** /users/{name}/followings | 
*UsersApi* | [**usersNameGet**](docs/UsersApi.md#usersnameget) | **GET** /users/{name} | 
*UsersApi* | [**usersNameImagesGet**](docs/UsersApi.md#usersnameimagesget) | **GET** /users/{name}/images | 
*UsersApi* | [**usersNameInvitedGet**](docs/UsersApi.md#usersnameinvitedget) | **GET** /users/{name}/invited | 
*UsersApi* | [**usersNameTagsGet**](docs/UsersApi.md#usersnametagsget) | **GET** /users/{name}/tags | 
*UsersApi* | [**usersNameTlogGet**](docs/UsersApi.md#usersnametlogget) | **GET** /users/{name}/tlog | 
*VotesApi* | [**commentsIdVoteDelete**](docs/VotesApi.md#commentsidvotedelete) | **DELETE** /comments/{id}/vote | 
*VotesApi* | [**commentsIdVoteGet**](docs/VotesApi.md#commentsidvoteget) | **GET** /comments/{id}/vote | 
*VotesApi* | [**commentsIdVotePut**](docs/VotesApi.md#commentsidvoteput) | **PUT** /comments/{id}/vote | 
*VotesApi* | [**entriesIdVoteDelete**](docs/VotesApi.md#entriesidvotedelete) | **DELETE** /entries/{id}/vote | 
*VotesApi* | [**entriesIdVoteGet**](docs/VotesApi.md#entriesidvoteget) | **GET** /entries/{id}/vote | 
*VotesApi* | [**entriesIdVotePut**](docs/VotesApi.md#entriesidvoteput) | **PUT** /entries/{id}/vote | 
*WatchingsApi* | [**entriesIdWatchingDelete**](docs/WatchingsApi.md#entriesidwatchingdelete) | **DELETE** /entries/{id}/watching | 
*WatchingsApi* | [**entriesIdWatchingGet**](docs/WatchingsApi.md#entriesidwatchingget) | **GET** /entries/{id}/watching | 
*WatchingsApi* | [**entriesIdWatchingPut**](docs/WatchingsApi.md#entriesidwatchingput) | **PUT** /entries/{id}/watching | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AccountEmailEmailGet200Response](docs/AccountEmailEmailGet200Response.md)
 - [org.openapitools.client.models.AccountInvitesGet200Response](docs/AccountInvitesGet200Response.md)
 - [org.openapitools.client.models.AccountNameNameGet200Response](docs/AccountNameNameGet200Response.md)
 - [org.openapitools.client.models.AccountSettingsEmailGet200Response](docs/AccountSettingsEmailGet200Response.md)
 - [org.openapitools.client.models.AccountSettingsTelegramGet200Response](docs/AccountSettingsTelegramGet200Response.md)
 - [org.openapitools.client.models.AccountSubscribeTokenGet200Response](docs/AccountSubscribeTokenGet200Response.md)
 - [org.openapitools.client.models.AdjacentEntries](docs/AdjacentEntries.md)
 - [org.openapitools.client.models.AdmGrandfatherGet200Response](docs/AdmGrandfatherGet200Response.md)
 - [org.openapitools.client.models.AdmGrandsonGet200Response](docs/AdmGrandsonGet200Response.md)
 - [org.openapitools.client.models.AdmGrandsonStatusGet200Response](docs/AdmGrandsonStatusGet200Response.md)
 - [org.openapitools.client.models.AdmStatGet200Response](docs/AdmStatGet200Response.md)
 - [org.openapitools.client.models.App](docs/App.md)
 - [org.openapitools.client.models.AuthProfile](docs/AuthProfile.md)
 - [org.openapitools.client.models.AuthProfileAllOf](docs/AuthProfileAllOf.md)
 - [org.openapitools.client.models.AuthProfileAllOfAccount](docs/AuthProfileAllOfAccount.md)
 - [org.openapitools.client.models.AuthProfileAllOfBan](docs/AuthProfileAllOfBan.md)
 - [org.openapitools.client.models.Avatar](docs/Avatar.md)
 - [org.openapitools.client.models.Calendar](docs/Calendar.md)
 - [org.openapitools.client.models.CalendarEntry](docs/CalendarEntry.md)
 - [org.openapitools.client.models.Chat](docs/Chat.md)
 - [org.openapitools.client.models.ChatList](docs/ChatList.md)
 - [org.openapitools.client.models.ChatRights](docs/ChatRights.md)
 - [org.openapitools.client.models.Comment](docs/Comment.md)
 - [org.openapitools.client.models.CommentList](docs/CommentList.md)
 - [org.openapitools.client.models.CommentRights](docs/CommentRights.md)
 - [org.openapitools.client.models.Cover](docs/Cover.md)
 - [org.openapitools.client.models.Design](docs/Design.md)
 - [org.openapitools.client.models.DesignFontsGet200Response](docs/DesignFontsGet200Response.md)
 - [org.openapitools.client.models.Entry](docs/Entry.md)
 - [org.openapitools.client.models.EntryRights](docs/EntryRights.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.FavoriteStatus](docs/FavoriteStatus.md)
 - [org.openapitools.client.models.Feed](docs/Feed.md)
 - [org.openapitools.client.models.Friend](docs/Friend.md)
 - [org.openapitools.client.models.FriendAllOf](docs/FriendAllOf.md)
 - [org.openapitools.client.models.FriendAllOfCounts](docs/FriendAllOfCounts.md)
 - [org.openapitools.client.models.FriendList](docs/FriendList.md)
 - [org.openapitools.client.models.Image](docs/Image.md)
 - [org.openapitools.client.models.ImageList](docs/ImageList.md)
 - [org.openapitools.client.models.ImageSize](docs/ImageSize.md)
 - [org.openapitools.client.models.MeOnlinePut200Response](docs/MeOnlinePut200Response.md)
 - [org.openapitools.client.models.Message](docs/Message.md)
 - [org.openapitools.client.models.MessageList](docs/MessageList.md)
 - [org.openapitools.client.models.MessageRights](docs/MessageRights.md)
 - [org.openapitools.client.models.Notification](docs/Notification.md)
 - [org.openapitools.client.models.NotificationInfo](docs/NotificationInfo.md)
 - [org.openapitools.client.models.NotificationList](docs/NotificationList.md)
 - [org.openapitools.client.models.NotificationsReadPut200Response](docs/NotificationsReadPut200Response.md)
 - [org.openapitools.client.models.OAuth2Error](docs/OAuth2Error.md)
 - [org.openapitools.client.models.OAuth2Token](docs/OAuth2Token.md)
 - [org.openapitools.client.models.Oauth2AllowPost200Response](docs/Oauth2AllowPost200Response.md)
 - [org.openapitools.client.models.Profile](docs/Profile.md)
 - [org.openapitools.client.models.ProfileAllOf](docs/ProfileAllOf.md)
 - [org.openapitools.client.models.ProfileAllOfRelations](docs/ProfileAllOfRelations.md)
 - [org.openapitools.client.models.Rating](docs/Rating.md)
 - [org.openapitools.client.models.Relationship](docs/Relationship.md)
 - [org.openapitools.client.models.TagList](docs/TagList.md)
 - [org.openapitools.client.models.TagListDataInner](docs/TagListDataInner.md)
 - [org.openapitools.client.models.User](docs/User.md)
 - [org.openapitools.client.models.UserID](docs/UserID.md)
 - [org.openapitools.client.models.UserIDBan](docs/UserIDBan.md)
 - [org.openapitools.client.models.UsersGet200Response](docs/UsersGet200Response.md)
 - [org.openapitools.client.models.WatchingStatus](docs/WatchingStatus.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="OAuth2App"></a>
### OAuth2App

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

<a name="OAuth2Code"></a>
### OAuth2Code

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /oauth
- **Scopes**: 
  - account:read: read available invites, etc.
  - account:write: change email, password, etc.
  - adm:read: read adm info and statuses
  - adm:write: change adm info and update statuses
  - comments:read: read comments and comment votes
  - comments:write: create, edit and remove comments
  - entries:read: read entries, entry votes, favorites, watchings, tags
  - entries:write: create, edit and remove tlog entries
  - favorites:write: add entries to favorites and remove
  - images:read: get uploaded images
  - images:write: upload new images
  - messages:read: read chats and messages and set them read
  - messages:write: create, edit and remove messages
  - notifications:read: read notifications and set them read
  - relations:write: follow, block, hide tlogs, accept followers, invite people
  - settings:read: read account settings
  - settings:write: change account settings
  - users:read: read profile info, relations
  - users:write: change profile info, avatar, etc.
  - votes:write: vote and unvote entries and comments
  - watchings:write: subscribe to entry comments and unsubscribe

<a name="OAuth2Password"></a>
### OAuth2Password

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: N/A

