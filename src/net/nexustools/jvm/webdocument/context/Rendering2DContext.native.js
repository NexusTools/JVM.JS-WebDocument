(function(JVM) {
  JVM.ClassLoader.defineNativeImpl("net/nexustools/jvm/webdocument/context/Rendering2DContext", {
    'setFillStyle$(Ljava/lang/String;)V': function($, style) {
      this.$prop._target.fillStyle = style.$prop._value;
    },
    'getFillStyle$()Ljava/lang/String;': function($, style) {
      return $.jvm.createString(this.$prop._target.fillStyle);
    },
    'setStrokeStyle$(Ljava/lang/String;)V': function($, style) {
      this.$prop._target.strokeStyle = style.$prop._value;
    },
    'getStrokeStyle$()Ljava/lang/String;': function($, style) {
      return $.jvm.createString(this.$prop._target.strokeStyle);
    },
    'clearRect$(DDDD)V': function($, x, y, w, h) {
      this.$prop._target.clearRect(x, y, w, h);
    },
    'fillRect$(DDDD)V': function($, x, y, w, h) {
      this.$prop._target.fillRect(x, y, w, h);
    },
    'moveTo$(DD)V': function($, x, y) {
      if(isNaN(x))
        x = 0;
      if(isNaN(y))
        y = 0;
      this.$prop._target.moveTo(x, y);
    },
    'lineTo$(DD)V': function($, x, y) {
      if(isNaN(x))
        x = 0;
      if(isNaN(y))
        y = 0;
      this.$prop._target.lineTo(x, y);
    },
    'beginPath$()V': function($) {
      this.$prop._target.beginPath();
    },
    'stroke$()V': function($) {
      this.$prop._target.stroke();
    }
  });
})($currentJVM);
