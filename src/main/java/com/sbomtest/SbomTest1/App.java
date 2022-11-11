package com.sbomtest.SbomTest1;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.thoughtworks.xstream.converters.basic.*;
import com.zaxxer.nuprocess.codec.*;

import java.security.Principal;

import org.apache.batik.*;
import org.keycloak.common.util.*;
import org.apache.commons.jxpath.JXPathContext;
import org.eclipse.californium.scandium.auth.PrincipalSerializer;
import ch.qos.logback.core.encoder.ByteArrayUtil;
import org.eclipse.californium.elements.util.DatagramWriter;

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
    	ByteArrayUtil arrayUtil = new ByteArrayUtil();
    	String arrayU = arrayUtil.toString();
    	
    	Principal principal = null;
    	DatagramWriter writer = new DatagramWriter();
    	PrincipalSerializer.serialize(principal, writer);
    	
    	
        System.out.println( "Hello World!" );
        
    }
}
