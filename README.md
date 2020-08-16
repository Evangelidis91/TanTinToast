# TanTinToast
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)  [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/KEvangelidis)

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
	implementation 'com.github.Evangelidis91:TanTinToast:1.1.1'
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
TanTinToast.Error(this).text("Error Toast").show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/error.png" width="250">

To display Success Toast:
``` 
TanTinToast.Success(this).text("Success Toast").show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/success.png" width="250">


To display Info Toast:
``` 
TanTinToast.Info(this).text("Info Toast").show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/info.png" width="250">


To display Warning Toast:
``` 
TanTinToast.Warning(this).text("Warning Toast").show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/warning.png" width="250">


To display Normal Toast:
``` 
TanTinToast.Normal(this).text("Normal Toast").show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/normal.png" width="250">


To display Custom Toast:
``` 
TanTinToast.Custom(this)
    .text("Custom Toast")
    .icon(R.drawable.icon)
    .background(R.color.colorPrimaryDark)
    .textColor(R.color.colorAccent)
    .time(TanTinToast.LONG)
    .typeface(R.font.montserrat)
    .show()
```
<img src="https://github.com/Evangelidis91/TanTinToast/blob/master/app/src/main/res/drawable/custom_toast.png" width="250">


## Using Java

To display an error Toast:
``` 
new TanTinToast.Error(this).text("Error Toast ").show();
```

To display Success Toast:
``` 
new TanTinToast.Success(this).text("Success Toast").show();
```

To display Info Toast:
``` 
new TanTinToast.Info(this).text("Info Toast").show();
```

To display Warning Toast:
``` 
new TanTinToast.Warning(this).text("Warning Toast").show();
```

To display Normal Toast:
``` 
new TanTinToast.Normal(this).text("Normal Toast").show();
```

To display Custom Toast:
``` 
new TanTinToast.Custom(this).text("Custom Toast").show();
```

### Customize Toast text
```
.text("Any text")
```


### Customize Toast time
```
.time(TanTinToast.LONG)
```
Use ```TanTinToast.LONG``` to display toast for 3.5 seconds or ```TanTinToast.SHORT``` to display for 2 seconds.


### Customize Toast message FontFamily
```
.typeface(R.font.custom_font_family)
```
You can just pass any file under font folder


### Customize Toast message TextSIze
```
.textSize(16)
```
Use this method to change Toast message text size ***Inserted value declares sp value***


## Using TanTin.Custom
Using Custom you can customize
* The icon.
* The backgroundColor.
* The textColor.
* All the previous customizations.

Use ```.icon(int)``` to set Toast icon.
Use ```.background(int)``` to set Toast backgroundColor.
Use ```.textColor(int)``` to set Toast message textColor.
