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
import net.nexustools.jvm.bridge.JSObjectRef.Controller;
import net.nexustools.jvm.webdocument.WebEventable;

/**
 *
 * @author kate
 */
public class WebElement extends WebEventable implements Controller {
    
    protected WebElement() {}
    
    public final native String getTag();
    
    public final native String getClassName();
    public final native void setClassName(String name);
    
    public final native void setProperty(String prop, String value);
    public final native String getProperty(String prop);
    
    public final native void setAttribute(String attr, String value);
    public final native String getAttribute(String attr);
    
    public final native void setStyle(String style, String value);
    public final native String getStyle(String style);
    
    public final native void appendChild(WebElement element);
    public final native void removeChld(WebElement element);
    
    public final native String getInnerHTML();
    public final native void setInnerHTML(String html);
    
    public final native WebElement getOffsetParent();
    public final native WebElement getParentNode();
    
    public final native String getText();
    public final native void setText(String html);
    
    public final native <E extends WebElement> E[] getElementsByClassName(String className);
    
    @Override
    public final native JSObjectRef getRef();
    
}
