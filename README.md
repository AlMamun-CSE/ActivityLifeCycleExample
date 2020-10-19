# ActivityLifeCycleExample
Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. The android Activity is the subclass of ContextThemeWrapper class.
An activity is the single screen in android. It is like window or frame of Java.
By the help of activity, you can place all your UI components or widgets in a single screen.

<p align="center">
  <img src="https://static.javatpoint.com/images/androidimages/Android-Activity-Lifecycle.png" width="350" title="hover text">
</p>
<ol>onCreate():</ol>

<p>Called when the activity is first created. This is where you should do all of your normal static set up: create views, bind data to lists, etc. This method also provides      you with a Bundle containing the activity's previously frozen state, if there was one. Always followed by onStart().</p

<ol> onRestart():</ol>

<p>Called after your activity has been stopped, prior to it being started again. Always followed by onStart()</p>

<ol>onStart():</ol>

<p>Called when the activity is becoming visible to the user. Followed by onResume() if the activity comes to the foreground.</p>

<ol>onResume():</ol>

<p>Called when the activity will start interacting with the user. At this point your activity is at the top of the activity stack, with user input going to it. Always followed by onPause().</p>

<ol>onPause ():</ol>

<p>Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed. The counterpart to onResume(). When activity B is launched in front of activity A, this callback will be invoked on A. B will not be created until A's onPause() returns, so be sure to not do anything lengthy here.</p>

<ol>onStop():</ol>

<p>Called when you are no longer visible to the user. You will next receive either onRestart(), onDestroy(), or nothing, depending on later user activity. Note that this method may never be called, in low memory situations where the system does not have enough memory to keep your activity's process running after its onPause() method is called.</p>

<ol>onDestroy():</ol>

<p>The final call you receive before your activity is destroyed. This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space. You can distinguish between> these two scenarios with the isFinishing() method</p>
