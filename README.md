## Qhala Interview :movie_camera: :tv:
[![codebeat badge](https://codebeat.co/badges/9f7bb947-8983-4c30-9f0a-93a5d36a5d17)](https://codebeat.co/projects/github-com-jamesnyakush-qhala-interview-master) [![Maintainability](https://api.codeclimate.com/v1/badges/9c2ee7a00cefe2980f2d/maintainability)](https://codeclimate.com/github/jamesnyakush/Qhala-interview/maintainability) [![Test Coverage](https://api.codeclimate.com/v1/badges/9c2ee7a00cefe2980f2d/test_coverage)](https://codeclimate.com/github/jamesnyakush/Qhala-interview/test_coverage)

This is an Interview Tech challenge by  [Qhala](https://qhala.com/) I used [TMDB API](https://developers.themoviedb.org/3) to solve this challenge. 

## Screenshots

| Movies | Movie Detail |
| ------ | ----- |
| ![Movies](/art/moviesdark.png) | ![Single Movie](/art/singlemoviedark.png) | 

## Prerequisites 

To Add your Api Key from  [TMDB API](https://developers.themoviedb.org/3)  u have to run the following command to your terminal 
I used CMake  to Secure Api Key :relaxed: 

```shell script
 $ cd app/src/main/cpp
 $ cp  native-lib.cpp.sample  native-lib.cpp
```

## Tech-stack

* Tech-stack
    * [Kotlin](https://kotlinlang.org/) - a cross-platform, statically typed, general-purpose programming language with type inference.
    * [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - perform background operations.
    * [Dagger-Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - a pragmatic lightweight dependency injection framework.
    * [Retrofit](https://square.github.io/retrofit/) - a type-safe REST client for Android.
    * [Jetpack](https://developer.android.com/jetpack)
        * [Room](https://developer.android.com/topic/libraries/architecture/room) - a persistence library provides an abstraction layer over SQLite.
        * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - is an observable data holder.
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform action when lifecycle state changes.
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way.
    * [Timber](https://github.com/JakeWharton/timber) - a highly extensible android logger.

* Architecture
    * MVVM - Model View View Model
* Tests
    * [Unit Tests](https://en.wikipedia.org/wiki/Unit_testing) ([JUnit](https://junit.org/junit4/))
    * [Mockito](https://github.com/mockito/mockito) + [Mockito-Kotlin](https://github.com/nhaarman/mockito-kotlin)
    * [Kluent](https://github.com/MarkusAmshove/Kluent)
    * [Kakao](https://github.com/agoda-com/Kakao)
* Gradle
    * [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) - For reference purposes, here's an [article explaining the migration](https://medium.com/@evanschepsiror/migrating-to-kotlin-dsl-4ee0d6d5c977).

* CI/CD
    * Github Actions 
    
## Work plan 

I created an automated [Kanban](https://github.com/jamesnyakush/Qhala-interview/projects/1) on the Github projects for agile development.

![Work plan](/art/kabana.png)    

## Unit Test
Ui Testing 
![Unit Test](/art/uitest.png)

## Room Database Inspector

This is How data is being Stored to Room db.

![Room db](/art/room.png)