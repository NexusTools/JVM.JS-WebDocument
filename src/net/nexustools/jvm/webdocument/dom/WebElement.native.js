(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/dom/WebElement", {
    'setAttribute$(Ljava/lang/String;Ljava/lang/String;)V': function($, key, val) {
      this.$prop._target.setAttribute(key.$prop._value, val.$prop._value);
    },
    'appendChild$(Lnet/nexustools/jvm/webdocument/dom/WebElement;)V': function($, el) {
      this.$prop._target.appendChild(el.$prop._target);
    },
    'getStyle$(Ljava/lang/String;)Ljava/lang/String;': function($, key) {
      return JVM.createString(this.$prop._target.style[key.$prop._value]);
    },
    'setStyle$(Ljava/lang/String;Ljava/lang/String;)V': function($, key, val) {
      this.$prop._target.style[key.$prop._value] = val.$prop._value;
    },
    'getProperty$(Ljava/lang/String;)Ljava/lang/String;': function($, key) {
      return JVM.createString(""+this.$prop._target[key.$prop._value]);
    },
    'setProperty$(Ljava/lang/String;Ljava/lang/String;)V': function($, key, val) {
      this.$prop._target[key.$prop._value] = val.$prop._value;
    },
    'getInnerHTML$()Ljava/lang/String;': function($) {
      return JVM.createString(this.$prop._target.innerHTML);
    },
    'setInnerHTML$(Ljava/lang/String;)V': function($, html) {
      this.$prop._target.innerHTML = html.$prop._value;
    }
  });
})($currentJVM);