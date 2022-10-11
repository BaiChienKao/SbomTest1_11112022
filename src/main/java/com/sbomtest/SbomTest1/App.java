package com.sbomtest.SbomTest1;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.thoughtworks.xstream.converters.basic.*;
import com.zaxxer.nuprocess.codec.*;
import org.apache.batik.*;
import org.keycloak.common.util.*;
import org.apache.commons.jxpath.JXPathContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String newStr = new String("Sbom");
    	JXPathContext context = JXPathContext.newContext(newStr);
    	context.equals(newStr);
        System.out.println( "Hello World!" );
        
    }
}
