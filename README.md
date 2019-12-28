# Android Base Library
Template project to create an Android library, which is ready to be published locally and on Bintray.

# What's in this project template
- Kotlin 1.3.60
- KtLint
- Android Testing setup for both unit and integration tests
- Library project
- Example app project which imports the library project
- `manifest.gradle` which contains library metadata information and common dependencies between library project and demo app project.

# Getting started
* Fork this project
* Clone it locally
* Get you Bintray API key and username. If you don't have it, register on [bintray.com](https://bintray.com). It's free.
* Put the following in your `local.properties`:
  ```
  bintray.apikey=YOUR_API_KEY
  bintray.user=YOUR_BINTRAY_USERNAME
  ```
* Run `./rename` and enter the required information
* Done! Open `example/app/build.gradle` from your Android Studio and start writing your next awesome library!

# Release
You can release the library:
- **locally**: `./release local`. This is going to create a `releases` directory which can be used as a Maven Repository.
- **publicly on Bintray**: `./release`
    > From bintray.com, you can then link your library on jCenter and push it also to Maven Central, but I'm not going to cover that here, as there are plenty of examples on the Internet on how to do that.
