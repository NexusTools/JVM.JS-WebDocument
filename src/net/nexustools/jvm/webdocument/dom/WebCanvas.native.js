(function(JVM) {
  var currentWindow;

  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/dom/WebCanvas", {
    'getContext$(Ljava/lang/String;)Lnet/nexustools/jvm/webdocument/context/RenderingContext;': function($, type) {
      type = type.$prop._value;
      var ctxClass = "net/nexustools/jvm/webdocument/context/";
      if(type == "2d")
        ctxClass += "Rendering2DContext";
      else if(type == "webgl")
        ctxClass += "RenderingWebGLContext";
      else
        throw new JavaErrors.UnsupportedOperationException("Only 2d and webgl contexts are supported at this time");

      var ctx = $.jvm.initializeObject(ctxClass);
      ctx.$prop._target =  this.$prop._target.getContext(type);
      return ctx;
    }
  });
})($currentJVM);
