# Play-Youtube
Used youtube player API to play youtube videos
Learnt about using a third party library in andorid application. We are required to download google's youtube player api (.jar). Inorder to use this API,
go to console.developers.google.com and create a GOOGLE_API_KEY. We need to provide our package name and SHA-1 certificate to console.developers.google.com inorder
to link our app to the API. These details can be easily obtained by creating a maps activity in android studio.

Inorder to play videos, we can either implement YoutubePlayer.onInitilizedListener interface (after extending from YoutubeBaseActivity) or we can simply use
Youtube Standalone player which provides "createVideoIntent()" and "createPlaylistIntent()" methods to play single video and playList respectively. 
