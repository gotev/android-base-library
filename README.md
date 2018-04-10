# Android Base Library
Starting empty project to create an android library, which is ready to be published on bintray and maven central

Just fork this project, then clone it on your computer and open it in Android Studio!

# Initial setup
After you've cloned your forked repo, you need to perform these actions:

* Register on [bintray.com](https://bintray.com). It's free.
* Get you bintray API key and username
* Inside your `local.properties` file put `bintray.apikey=YOUR_API_KEY` and `bintray.user=YOUR_BINTRAY_USERNAME`
* Modify the [following lines](https://github.com/gotev/android-base-library/blob/master/library/build.gradle#L5-L22) in library/build.gradle file accordingly to your library
* Create a new package `com.yourcompany.yourlibrary` under the java sources
* Remove example `net.gotev.baselibrary` files and package

And you're ready to go!

To publish your library on bintray, simply execute: `./gradlew clean assembleRelease bintrayUpload`

From bintray.com, you can then link your library on jCenter and push it also to Maven Central, but I'm not going to cover that here, as there are plenty of examples on the Internet on how to do that
