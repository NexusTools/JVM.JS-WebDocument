(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/dom/WebDocument", {
    'createElement$(Ljava/lang/String;)Lnet/nexustools/jvm/webdocument/dom/WebElement;': function($, el) {
      el = document.createElement(el.$prop._value);
      console.log(el);

      return __webdocument_objForElement($, el);
    },
    'getBody$()Lnet/nexustools/jvm/webdocument/dom/WebElement;': function($) {
      return __webdocument_objForElement($, document.body);
    },
    'getHead$()Lnet/nexustools/jvm/webdocument/dom/WebElement;': function($) {
      return __webdocument_objForElement($, document.head);
    },
    'getElementById$(Ljava/lang/String;)Lnet/nexustools/jvm/webdocument/dom/WebElement;': function($, id) {
      return __webdocument_objForElement($, document.getElementById(id.$prop._value));
    }
  });
})($currentJVM);
