# Java--Steam-Loader
Java library for downloading Dota2 Data from Steam

The project is currently in progress but you are free to use it. It is updated regularly as I am documenting the APIs.

## Usage
Instantiate a SteamLoader and use it to get Provider wrapper classes or the APIs directly. Happy coding!

## Importing into your project

**Gradle**

Add the following to your parent project Gradle file

```
allprojects {
        repositories {
           maven { url "https://dl.bintray.com/mikefot/maven/" }
        }
    }
```

And the following to your module Gradle file:

`compile 'com.michaelfotiadis:java-steam-loader:1.0.4'`

**Maven**

```
<dependency>
  <groupId>com.michaelfotiadis</groupId>
  <artifactId>java-steam-loader</artifactId>
  <version>1.0.4</version>
  <type>pom</type>
</dependency>
```

**Bintray Project**
https://bintray.com/mikefot/maven/java-steam-loader

## Versions
- 1.0.0 : Initial Release

## Target
This library is targeting Java 7 for backwards compatibility with Android.
