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

import net.nexustools.jvm.webdocument.context.Rendering2DContext;
import net.nexustools.jvm.webdocument.context.RenderingContext;

/**
 *
 * @author kate
 */
public class WebCanvas extends WebElement {
    
    protected WebCanvas() {}
    
    public final native <C extends RenderingContext> C getContext(String type);
    
    public Rendering2DContext get2DContext() {
        return getContext("2d");
    }
    
}
