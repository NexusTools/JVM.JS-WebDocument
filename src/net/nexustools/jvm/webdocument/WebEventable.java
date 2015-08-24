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
package net.nexustools.jvm.webdocument;

/**
 *
 * @author kate
 */
public class WebEventable {
    public static interface Listener<E extends WebEvent> {
        public void onEvent(E event);
    }
    
    public final native void addEventListener(String event, Listener listener, boolean useCapture);
    public final void addEventListener(String event, Listener listener) {
        addEventListener(event, listener, false);
    }
    
    public final native void removeEventListener(String event, Listener listener, boolean useCapture);
    public final void removeEventListener(String event, Listener listener) {
        addEventListener(event, listener, false);
    }
    
}
