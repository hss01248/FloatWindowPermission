# FloatWindowPermission
this repository is aimed to adapt android float window permission in most of phone models and how to request it at runtime </br>

its result is as follows : </br>
![这里写图片描述](http://img.blog.csdn.net/20161121163115438)

if you want to see more,[click here](http://blog.csdn.net/self_study/article/details/52859790)

from now on，the models below android M that have been adapted are :
<ul><li>xiaomi:v5,v6,v7,v8</li><li>huawei:partial</li><li>meizu:partial</li><li>360:partial</li><li>others:phones like samsung,sony or other model can directly show the float window, so there is no need to adapt,but if you find one that can not,contact me via my email(zhao_zepeng@hotmail.com) or leave a message on my blog i mentioned above,thanks</li></ul>

more details about the models that have been adapted(thanks [ruanqin0706](https://github.com/ruanqin0706) for help):</br>



# attention

support api version below 23.  

if api version >= 23, please use RxPermission and so on .

# useage

> ask for permission :(contains the  checkPermission logic)

```
FloatWindowManager.getInstance().askPermission(this);
```

> checkPermission

```
public boolean checkPermission(Context context)
```

## show a view as TYPE_TOAST:

> if has permission ,show the view ,if not, call askPermission

```
public Dialog showAsTypeToast(View view)
```

the return type Dialog is just a wrapper of  WindowManager  ,with a convenient api . to dismiss it ,just call 

           if(dialog !=null && dialog.isShowing()){
               dialog.dismiss();
           }
 if you want to response to the backpressed event of activity ,you can overide in activity like this:

```
 @Override
    public void onBackPressed() {
        if(dialog !=null && dialog.isShowing()){
            dialog.dismiss();
        }else {
            super.onBackPressed();
        }
    }
```



## gradle 

**Step 1.** Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```

**Step 2.** Add the dependency

```
    dependencies {
            compile 'com.github.hss01248:FloatWindowPermission:lastest release'
    }
```

lastest release:https://github.com/hss01248/FloatWindowPermission/releases







# the read me of origin project: 

##6.0/6.0+**##

most models are OK with this way of adaption except meizu:
![这里写图片描述](http://img.blog.csdn.net/20161120151434066)
![这里写图片描述](http://img.blog.csdn.net/20161120151457025)
conclusion:
![这里写图片描述](http://img.blog.csdn.net/20161120151836631)
<font color='red'>until now(2016-11-21), this problem has been solved, we have made a special treatment to the ROM above 6.0 inclue 6.0 in meizu mobiles.</font></br>
##**huawei**##
here is the test result for huawei mobiles:
![这里写图片描述](http://img.blog.csdn.net/20161120152448539)
conclusion:
![这里写图片描述](http://img.blog.csdn.net/20161120152944404)
waiting for adapted...</br>
##**xiaomi**##
most of xiaomi mobiles are adapted very well except some paticular models:</br>
![这里写图片描述](http://img.blog.csdn.net/20161120153255174)
here is the conclusion:
![这里写图片描述](http://img.blog.csdn.net/20161120153426801)
##**samsung**##
almost 100% of the samsung mobiles are adapted very well:
![这里写图片描述](http://img.blog.csdn.net/20161120153722623)
here is the conclusion of samsung:
![这里写图片描述](http://img.blog.csdn.net/20161120154136107)
##**oppo&&vivo**##
only test a small part of the mobiles and here is the result:
![这里写图片描述](http://img.blog.csdn.net/20161120154418424)
conclusion:</br>
![这里写图片描述](http://img.blog.csdn.net/20161120154652831)</br>
##**others**##
we random pick some other models like HTC and Sony and here is the result:
![这里写图片描述](http://img.blog.csdn.net/20161120155216372)
conclusion:</br>
![这里写图片描述](http://img.blog.csdn.net/20161120155248177)