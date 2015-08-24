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

import net.nexustools.jvm.bridge.JSObjectRef.NativeController;

/**
 *
 * @author kate
 */
public class PrototypeHelper extends NativeController {
    
    public static native boolean isInstalled();
    
    public static native PrototypeHelper $();
    public static native PrototypeHelper $(String query);
    
}
