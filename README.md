# AwesomeDialog

This library is a set of simple wrapper classes that was created to help you easily make SCLA like dialogs.

[![](https://jitpack.io/v/mirshahbazi/AwesomeDialog.svg)](https://jitpack.io/#mirshahbazi/AwesomeDialog)

## Gradle

add jitpack to your project

```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
    }
}
```  

compile on your dependencies

```
dependencies {
	  implementation 'com.github.mirshahbazi:AwesomeDialog:Tag'
}
```


### Dialog Types

Each Dialog has its own top color, icon, title and message + its own featured. There are 6 types of dialogs available:
* [PopInfoDialog](#awesomeinfodialog)
* [PopErrorDialog](#awesomeerrordialog)
* [PopProgressDialog](#awesomeprogressdialog)
* [PopWarningDialog](#awesomewarningdialog)
* [PopNoticeDialog](#awesomenoticedialog)
* [PopSuccessDialog](#awesomesuccessdialog)

#### PopInfoDialog
You can set posite and negative buttons here. Closures can be individually set for each button (onClick of any
button with closure the button will be dismissed).

```java
 new PopInfoDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogInfoBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_dialog_info, R.color.white)
                .setCancelable(true)
                .setPositiveButtonText(getString(R.string.dialog_yes_button))
                .setPositiveButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
                .setPositiveButtonTextColor(R.color.white)
                .setNeutralButtonText(getString(R.string.dialog_neutral_button))
                .setNeutralButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
                .setNeutralButtonTextColor(R.color.white)
                .setNegativeButtonText(getString(R.string.dialog_no_button))
                .setNegativeButtonbackgroundColor(R.color.dialogInfoBackgroundColor)
                .setNegativeButtonTextColor(R.color.white)
                .setPositiveButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        //click
                    }
                })
                .setNeutralButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        //click
                    }
                })
                .setNegativeButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        //click
                    }
                })
                .show();

```
#### PopErrorDialog
Display an Error dialog with one button

```java
  new PopErrorDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogErrorBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_dialog_error, R.color.white)
                .setCancelable(true).setButtonText(getString(R.string.dialog_ok_button))
                .setButtonBackgroundColor(R.color.dialogErrorBackgroundColor)
                .setButtonText(getString(R.string.dialog_ok_button))
                .setErrorButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        // click
                    }
                })
                .show();
    }
```
#### PopProgressDialog
Display a Progress Dialog

```java
 new PopInfoDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogInfoBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_dialog_info, R.color.white)
                .setCancelable(true)
                .show();

```
#### PopWarningDialog
Display Warning to user with or without button

```java
new PopWarningDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogNoticeBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_notice, R.color.white)
                .setCancelable(true)
                .setButtonText(getString(R.string.dialog_ok_button))
                .setButtonBackgroundColor(R.color.dialogNoticeBackgroundColor)
                .setButtonText(getString(R.string.dialog_ok_button))
                .setWarningButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        // click
                    }
                })
                .show();

```
#### PopNoticeDialog
Display notice to user

```java
new PopNoticeDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogNoticeBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_notice, R.color.white)
                .setCancelable(true)
                .setButtonText(getString(R.string.dialog_ok_button))
                .setButtonBackgroundColor(R.color.dialogNoticeBackgroundColor)
                .setButtonText(getString(R.string.dialog_ok_button))
                .setNoticeButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        // click
                    }
                })
                .show();
```

#### PopSuccessDialog
Displays a success message, with max of three buttons

```java
new PopSuccessDialog(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.app_name)
                .setColoredCircle(R.color.dialogSuccessBackgroundColor)
                .setDialogIconAndColor(R.drawable.ic_dialog_info, R.color.white)
                .setCancelable(true)
                .setPositiveButtonText(getString(R.string.dialog_yes_button))
                .setPositiveButtonbackgroundColor(R.color.dialogSuccessBackgroundColor)
                .setPositiveButtonTextColor(R.color.white)
                .setNegativeButtonText(getString(R.string.dialog_no_button))
                .setNegativeButtonbackgroundColor(R.color.dialogSuccessBackgroundColor)
                .setNegativeButtonTextColor(R.color.white)
                .setPositiveButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        //click
                    }
                })
                .setNegativeButtonClick(new Closure() {
                    @Override
                    public void exec() {
                        //click
                    }
                })
                .show();
```

# Screenshots

## Info
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/info.png" width="300" >

## Error
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/error.png" width="300" >

## Progress
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/progress.png" width="300" >

## Warning
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/warning.png" width="300" >

## Notice
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/notice.png" width="300" >

## Success
<img src="https://github.com/blennerSilva/AwesomeDialog/blob/master/awesomedialoglib/extras/screenshots/success.png" width="300" >

## License

Copyright (c) 2019 MAM

-- 
