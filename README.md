# TanTinToast
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=15)  [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/grenderg)

Create easly custom Toast messages for your android applications.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.Evangelidis91:TanTinToast:1.0.0'
}
```

## Usage

**DON'T FORGET THE `show()` METHOD!**

Using this library you can display very easy some already implemented Toast messages or create your own.

You can display:
* Error Toast
* Success Toast
* Info Toast
* Warning Toast
* Normal Toast
* Custom Toast


## Using Kotlin

To display an error Toast:
``` 
TanTinToast.ErrorToast(this).setText("Error Toast").show()
```

To display Success Toast:
``` 
TanTinToast.SuccessToast(this).setText("Success Toast").show()
```

To display Info Toast:
``` 
TanTinToast.InfoToast(this).setText("Info Toast").show()
```

To display Warning Toast:
``` 
TanTinToast.WarningToast(this).setText("Warning Toast").show()
```

To display Normal Toast:
``` 
TanTinToast.NormalToast(this).setText("Normal Toast").show()
```

To display Custom Toast:
``` 
TanTinToast.CustomToast(this).setText("Custom Toast").show()
```

## Using Java

To display an error Toast:
``` 
new TanTinToast.ErrorToast(this).setText("Error Toast ").show();
```

To display Success Toast:
``` 
new TanTinToast.SuccessToast(this).setText("Success Toast").show();
```

To display Info Toast:
``` 
new TanTinToast.InfoToast(this).setText("Info Toast").show();
```

To display Warning Toast:
``` 
new TanTinToast.WarningToast(this).setText("Warning Toast").show();
```

To display Normal Toast:
``` 
new TanTinToast.NormalToast(this).setText("Normal Toast").show();
```

To display Custom Toast:
``` 
new TanTinToast.CustomToast(this).setText("Custom Toast").show();
```

### Customize methods
```
* .setTime(Toast.LENGTH_LONG)
```
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Use ```Toast.LENGTH_LONG``` or ```Toast.LENGTH_SHORT``` for setting the displaying time.

```
* .setTypeface()
```
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Use this method if you want to use a specific Font Family for the text
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;First you have to import the libraries below
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;```
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;import android.graphics.Typeface
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;import androidx.core.content.res.ResourcesCompat
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;```
