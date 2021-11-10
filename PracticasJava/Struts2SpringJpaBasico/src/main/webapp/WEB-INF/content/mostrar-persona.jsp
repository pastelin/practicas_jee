<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="persona.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="persona.titulo" /></h1>
        
        <s:if test="personas.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona" /></th>
                        <th><s:text name="p.nombre" /></th>
                        <th><s:text name="p.apellido" /></th>
                        <th><s:text name="p.email" />/th>
                        <th><s:text name="p.telefono" /></th>
                        <th><s:text name="p.saldo" /></th>
                    </tr>
                    <s:iterator value="personas">
                        <tr>
                            <th><s:property value="idPersona" /></th>
                            <th><s:property value="nombre" /></th>
                            <th><s:property value="apellido" /></th>
                            <th><s:property value="email" /></th>
                            <th><s:property value="telefono" /></th>
                            <th><s:property value="saldo" /></th>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
        <s:form>
            <s:submit key="persona.boton" name="submit" />
        </s:form>
        
        <div><s:text name="persona.contador" />: <s:property value="contadorPersonas" /></div>
    </body>
</html>
