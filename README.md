# iStudy
![Android CI](https://github.com/efguydan/iStudy/workflows/Android%20CI/badge.svg)

iStudy is an offline first Android application to watch videos about different educational topics.

## Tech Stack & Open-source libraries
- Minimum SDK level 21
- 100% [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous
- JetPack
 - LiveData - notify domain layer data to views.
 - Lifecycle - dispose observing data when lifecycle state changes.
 - ViewModel - UI related data holder, lifecycle aware.
 - Room Persistence - construct database.
- Architecture
 - MVVM Architecture (View - DataBinding - ViewModel - Model)
 - Repository pattern
 - Dagger 2 - Dependency Injection
- [ExoPlayer](https://github.com/google/ExoPlayer) - playing video
- [Retrofit2 & Gson](https://github.com/square/retrofit) - constructing the REST API
- [OkHttp3](https://github.com/square/okhttp) - implementing interceptor, logging and mocking web server
- [Coil](https://github.com/coil-kt/coil) - loading images
- [Timber](https://github.com/JakeWharton/timber) - logging

## System Architecture
The Architecture used in the project is MVVM. Some reasons it was used include:

- MVVM is structured to separate program logic and the user interface. The View contains the User interface, the Model contains the data while the Viewmodel connects them together, providing transformational logic where necessary.
- The ViewModel survives configuration changes and provides a safe space to save data used by the fragment or activity. This was particularly used in the lesson fragment where the exoplayer instance is hosted in the viewmodel in order to survive configuration changes and keeps a smooth streaming experience.
- The ViewModel, out of the box supports Reactive Programming. The ViewModel doesn't have to be aware of the View. It only exposes observables which the view can subscribe to and transform into UI for the user. This leads to lesser coupling of components.


The


