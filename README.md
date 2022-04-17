# Astronomy Picture of The Day

This is a practice app to implement clean architecture approach and caching data inside local database. This app uses Model - View - View Model or in short MVVM architecture.
I also try to separate the layers by module (data, domain, feature).

APK Link: https://drive.google.com/drive/folders/1Im-ElCAsVd5Ypbme-WFach1WWfSoEgp1

<img src="https://user-images.githubusercontent.com/32363208/163707322-7a300900-8ed7-4b0d-b09d-2727416dfeb3.png" width=800/>

Tech stacks:
- Dagger Hilt
- Coroutines Flow
- Retrofit
- Room
- ViewModel

# Features

## Caching
When user has fetched the data, it is cached in the local database so when user is offline, they can still access the APOD!

<img src="https://user-images.githubusercontent.com/32363208/163707543-cdcec8dd-58f4-475f-bbab-4726b6a8449d.jpg" width=400/>

## Share
Click the share button in the toolbar to share with your friends!

<img src="https://user-images.githubusercontent.com/32363208/163707599-4e87bc64-72a2-46fb-a323-cc6f796dd1ca.jpg" width=400/>
