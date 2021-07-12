# Android Base Library Template
Template project to create an Android library, which is ready to be published locally and on Maven Central.

## What's in this project template
- Kotlin 1.4.32
- KtLint
- Android Testing setup for both unit and integration tests
- Library project
- Example app project which imports the library project
- `manifest.gradle` which contains library metadata information and common dependencies between library project and demo app project.

## Getting started
* Fork this project
* Clone it locally  ```
* Run `./rename` and enter the required information
* Done! Open `example/build.gradle` from your Android Studio and start writing your next awesome library!

### Maven Central
Follow this guide: https://github.com/sky-uk/gradle-maven-plugin/#maven-central-publish

## Release
You can release the library:
- **locally**: `./release local`. This is going to create a `releases` directory which can be used as a Maven Repository.
- **MavenCentral**: `./release`

## Using the library
Once the library is published, you can use it like this:

```groovy
implementation 'LIBRARY_PROJECT_GROUP:LIBRARY_NAME:1.0.0'
```

### Using your GitHub Repository as a Maven Repository
Perform `./release local` and then push the `releases` directory. In your dependencies, add this to your repositories section:

```groovy
maven {
    content { includeGroup "LIBRARY_PROJECT_GROUP" }
    credentials(HttpHeaderCredentials.class) {
        name = "Authorization"
        value = "Bearer ${ System.getenv('GITHUB_TOKEN') }"
    }
    authentication { register("header", HttpHeaderAuthentication.class) }
    url "https://raw.githubusercontent.com/GITHUB_USER/GITHUB_REPOSITORY_NAME/master/releases"
}
```

You need to add an environment variable in your `.bash_profile` for the github repo to work:

```
export GITHUB_TOKEN="YOUR_TOKEN"
```

And then `source .bash_profile`
