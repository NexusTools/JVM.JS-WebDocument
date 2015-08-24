(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/WebEventable", {
    'addEventListener$(Ljava/lang/String;Lnet/nexustools/jvm/webdocument/WebEventable$Listener;Z)V': function($, event, listener) {
      this.$prop._target.addEventListener(event.$prop._value, function(e) {
         $.classloader.lookupImpl(listener, "onEvent$(Lnet/nexustools/jvm/webdocument/WebEvent;)V").call(listener);
      });
    }
  });
})($currentJVM);