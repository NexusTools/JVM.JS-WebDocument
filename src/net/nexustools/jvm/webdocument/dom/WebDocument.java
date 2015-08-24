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

import net.nexustools.jvm.bridge.JSObjectRef;

/**
 *
 * @author kate
 */
public class WebDocument {
    
    //public static native WebDocument getCurrent();
    
    public static native JSObjectRef getRef();
    
    public static native WebElement getHead();
    public static native WebElement getBody();
    
    public static native <E extends WebElement> E getElementById(String id);
    public static native <E extends WebElement> E createElement(String tag);
    
}
