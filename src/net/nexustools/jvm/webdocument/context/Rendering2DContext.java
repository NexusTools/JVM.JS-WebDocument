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
package net.nexustools.jvm.webdocument.context;

/**
 *
 * @author kate
 */
public final class Rendering2DContext extends RenderingContext {
    
    protected Rendering2DContext() {}
    
    public final native String getFillStyle();
    public final native void setFillStyle(String style);
    
    public final native String getStrokeStyle();
    public final native void setStrokeStyle(String style);
    
    public final native String getLineCap();
    public final native void setLineCap(String cap);
    
    public final native void clearRect(double x, double y, double w, double h);
    public final native void fillRect(double x, double y, double w, double h);
    public final native void strokeRect(double x, double y, double w, double h);
    
    public final native void beginPath();
    public final native void moveTo(double x, double y);
    public final native void lineTo(double x, double y);
    
    public final native void stroke();
    public final native void fill();
    
}
