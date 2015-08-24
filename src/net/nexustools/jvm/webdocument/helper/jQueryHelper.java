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
package net.nexustools.jvm.webdocument.helper;

import net.nexustools.jvm.bridge.JSInvokable;
import net.nexustools.jvm.bridge.JSObjectRef;
import net.nexustools.jvm.bridge.JSObjectRef.NativeController;
import net.nexustools.jvm.webdocument.dom.WebElement;

/**
 *
 * @author kate
 */
public class jQueryHelper extends NativeController {
    public static final class AjaxPromise {
        public final native void done(JSInvokable handler);
        public final native void fail(JSInvokable handler);
        public final native void always(JSInvokable handler);
    }
    
    public static native boolean isInstalled();
    
    public static native jQueryHelper $();
    public static native jQueryHelper $(String query);
    public static native jQueryHelper $(WebElement el);
    
    public static native AjaxPromise get(String url);
    public static native AjaxPromise post(String url, JSObjectRef data);
    
    public static native JSObjectRef getStaticRef();
    
}
