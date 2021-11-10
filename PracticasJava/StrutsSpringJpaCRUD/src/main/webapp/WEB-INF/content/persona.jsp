<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="pform.detalle" /></title>
    </head>
    <body>
        <h1><s:text name="pform.detalle" /></h1>
        <a href="<s:url action="listar" />"><s:text name="pform.listado" /></a>
        
        <s:form action="guardaPersona">
            <s:hidden name="persona.idPersona" />
            <s:textfield name="persona.nombre" key="p.nombre" />
            <s:textfield name="persona.apellido" key="p.apellido" />
            <s:textfield name="persona.email" key="p.email" />
            <s:textfield name="persona.telefono" key="p.telefono" />
            <s:textfield name="persona.saldo" key="p.saldo" />
            <s:submit action="giardarPersona" key="pform.enviar" />
        </s:form>
        
    </body>
</html>
