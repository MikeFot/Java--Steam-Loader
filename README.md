# Android--Steam-Dota2-Loader
Java library for downloading Dota2 Data from Steam

### Usage

#### Instantiation
- `new SteamLoader(key, isDebugEnabled)`

- `new SteamLoader(key)`

**Option 1:** Instantiate a new #SteamLoader# providing a String Steam API Developer key and a flag for enablind debug.

**Option 2:** Same as Option 1, but debug enabled reverts to `false`.

There are 3 data providers available via the `SteamLoader` instance:
- `PlayerProvider`: Calls for looking up a Steam User / Player
- `GamesProvider`: Calls for retrieving a user's Steam Library
- `Dota2 Provider`: Calls for retrieving Dota2 related data

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

`compile 'com.michaelfotiadis:java-steam-loader:1.0.0'`

**Maven**

```
<dependency>
  <groupId>com.michaelfotiadis</groupId>
  <artifactId>java-steam-loader</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

**Bintray Project**
https://bintray.com/mikefot/maven/java-steam-loader

## Versions
- 1.0.0 : Initial Release

## Target
This library is targeting Java 7 for backwards compatibility with Android.
