package org.example.block6pathvariableheaders;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Servicio {

    HashMap<String,String > varNumber = new HashMap<String, String >();

    public Persona addPersona(Persona info){
        return info;
    }

    public HashMap addVar(String var1, String var2){
        varNumber.put("var1",var1);
        varNumber.put("var2",var2);
        return varNumber;
    }
}
