# Android Assignment

This Application loads JSON data from the given URL and *ANNOUNCEMENT_IMAGE_THUMBNAIL* and *ANNOUNCEMENT_TITLE* are shows in a RecyclerView. When a item is tapped the details is shown in DetailsActivity in WebView from *ANNOUNCEMENT_HTML* element. A Singleton class which extends Application has been created to have access of values like BASE_URL, TAG_DETAILS etc.. through out the application life-cycle.

## Libraries user are

* [Retrofit](http://square.github.io/retrofit/) - Networking Library
* [Android Data Binding](https://developer.android.com/topic/libraries/data-binding/index.html) - Data Binding Library to write declarative layouts
* [Picasso](http://square.github.io/picasso/) - Image downloading and caching library to display ANNOUNCEMENT_IMAGE_THUMBNAIL
* [google-gson - GsonConverterFactory](https://github.com/google/gson) - To convert JSON string to an equivalent Java object


### Versions

```
* compileSdkVersion : 26
* gradle : 3.0.1
```