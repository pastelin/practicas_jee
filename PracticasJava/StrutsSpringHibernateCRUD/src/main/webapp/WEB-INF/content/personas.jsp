<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="pform.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="pform.titulo" /></h1>
        
        <s:if test="!personas.isEmpty()">
            <div>
                <table border="1">
                    <tr>
                        <td><s:text name="p.idPersona" /></td>
                        <td><s:text name="p.nombre" /></td>
                        <td><s:text name="p.apellido" /></td>
                        <td><s:text name="p.email" /></td>
                        <td><s:text name="p.telefono" /></td>
                        <td><s:text name="p.saldo" /></td>
                    </tr>
                    
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona" /></td>
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="apellido" /></td>
                            <td><s:property value="email" /></td>
                            <td><s:property value="telefono" /></td>
                            <td><s:property value="saldo" /></td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        
        </s:if>
    </body>
</html>
