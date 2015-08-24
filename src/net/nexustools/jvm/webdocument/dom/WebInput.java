/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.nexustools.jvm.webdocument.dom;

/**
 *
 * @author kate
 */
public class WebInput extends WebElement {
    
    protected WebInput() {}
    
    public final String getValue() {
        return getAttribute("value");
    }
    
    public final void setValue(String value) {
        setAttribute("value", value);
    }
    
}
