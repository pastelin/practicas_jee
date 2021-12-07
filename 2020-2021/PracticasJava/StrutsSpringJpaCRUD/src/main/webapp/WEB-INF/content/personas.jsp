<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="pform.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="pform.titulo" /></h1>
        <a href="<s:url action="agregarPersona" />"> <s:text name="p.form.agregar" /> </a>
        
        <s:if test="personas.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona" /></th>
                        <th><s:text name="p.nombre" /></th>
                        <th><s:text name="p.apellido" /></th>
                        <th><s:text name="p.email" /></th>
                        <th><s:text name="p.telefono" /></th>
                        <th><s:text name="p.saldo" /></th>
                        <th><s:text name="pform.editar" /></th>
                        <th><s:text name="pform.eliminar" /></th>
                    </tr>
                    
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona" /></td>
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="apellido" /></td>
                            <td><s:property value="email" /></td>
                            <td><s:property value="telefono" /></td>
                            <td><s:property value="saldo" /></td>
                            <td>
                                <s:url action="editarPersona" var="editarURL">
                                    <s:param name="persona.idPersona" value="%{idPersona}"></s:param>
                                </s:url>
                                <s:a href="%{editarURL}"><s:text name="pform.editar" /></s:a>
                            </td>
                            <td>
                                <s:url action="eliminarPersona" var="eliminarURL">
                                    <s:param name="persona.idPersona" value="%{idPersona}" ></s:param>
                                </s:url>
                                <s:a href="%{eliminarURL}"><s:text name="pform.eliminar" /></s:a>
                            </td>
                            
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
    </body>
</html>
