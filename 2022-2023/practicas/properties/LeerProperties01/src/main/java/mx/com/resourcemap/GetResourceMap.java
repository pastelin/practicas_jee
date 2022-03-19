package mx.com.resourcemap;

import java.net.URL;
import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class GetResourceMap {

    public void init() {
        ResourceMap resourceMap = Application.getInstance().getContext().getResourceMap(GetResourceMap.class);
        String key = getClass().getSimpleName() + ".resources" + ".StatusBar.messageTimeout";
        System.out.println("key = " + key);
        
        String filename = resourceMap.getResourcesDir() + "GetResourceMap";
        System.out.println(filename);
        URL url = resourceMap.getClassLoader().getResource("delete.Action.icon");
        System.out.println(url.getFile());
        
        
        String valor2 = resourceMap.getString("StatusBar.messageTimeout");
        System.out.println("valor = " + valor2);
        System.out.println(resourceMap.getResourcesDir());

    }

}
