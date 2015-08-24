(function(JVM) {
  var currentWindow;

  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/dom/WebWindow", {
    'getCurrent$()Lnet/nexustools/jvm/webdocument/dom/WebWindow;': function($) {
      if(currentWindow == null) {
        currentWindow = $.jvm.newObject();
        $.impl._.call(currentWindow);
        currentWindow.$prop['_target'] = window;
      }
      return currentWindow;
    },
    'setInterval$(Ljava/lang/Runnable;J)Lnet/nexustools/jvm/webdocument/dom/WebWindow$Interval;': function($, runnable, timeout) {
        var intervalObj = $.jvm.initializeObject("net/nexustools/jvm/webdocument/dom/WebWindow$Interval");
        intervalObj.$prop['_timer'] = setInterval(runnable.run, timeout);
        return intervalObj;
    },
    'setTimeout$(Ljava/lang/Runnable;J)Lnet/nexustools/jvm/webdocument/dom/WebWindow$Timeout;': function($, runnable, timeout) {
        var intervalObj = $.jvm.initializeObject("net/nexustools/jvm/webdocument/dom/WebWindow$Timeout");
        intervalObj.$prop['_timer'] = setTimeout(runnable.run, timeout);
        return intervalObj;
    }
  });
})($currentJVM);