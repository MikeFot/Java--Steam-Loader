# Steam Data Loader
Java library for downloading data from Steam using the provided APIs.

The project is currently in progress but feel free to use it. If you do, let me know so I can include a link to your app in the description for others to find!

It is updated regularly as I am documenting the APIs. Most of the models and classes have Javadocs, along with links to the wiki pages.

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

`compile 'com.michaelfotiadis:java-steam-loader:2.0.0'`

**Maven**

```
<dependency>
  <groupId>com.michaelfotiadis</groupId>
  <artifactId>java-steam-loader</artifactId>
  <version>2.0.0</version>
  <type>pom</type>
</dependency>
```

**Bintray Project**
https://bintray.com/mikefot/maven/java-steam-loader

## Versions
- 2.0.0 : Completed Player Service APIs and added all league calls

- 1.2.0 : Updated Dota Match Details and added in some missing fields

- 1.1.2

- 1.1.1

- 1.1.0

- 1.0.8

- 1.0.6

- 1.0.5

- 1.0.4

- 1.0.3

- 1.0.2

- 1.0.1

- 1.0.0 : Initial Release

## Target
This library is targeting Java 7 for backwards compatibility with Android.
