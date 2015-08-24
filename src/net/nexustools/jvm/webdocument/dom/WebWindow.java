/*
 * JVM.JS-WebDocument
 * 
 * This code is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software.
 */
package net.nexustools.jvm.webdocument.dom;

import net.nexustools.jvm.webdocument.WebEventable;

/**
 *
 * @author kate
 */
public class WebWindow extends WebEventable {
    public static class Timeout {
        protected Timeout() {}
        
        public native void cancel();
    }
    public static class Interval {
        protected Interval() {}
        
        public native void cancel();
    }
    
    public static native int innerWidth();
    public static native int innerHeight();
    
    public static native Timeout setTimeout(Runnable run, long timeout);
    public static native Interval setInterval(Runnable run, long timeout);
    public static native void eval(String source);
    
    public static native WebWindow getCurrent();
    
    public native void postMessage(String message, String targetOrigin);
    public void postMessage(String message) {
        postMessage(message, "*");
    }
    
}
