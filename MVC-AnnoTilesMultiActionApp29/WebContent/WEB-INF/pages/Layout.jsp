    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
    <html>  
    <head>  
    <title><tiles:insertAttribute name="title" ignore="true" />   </title>  
    </head>  
    <body>  
        <table border="1" cellspacing="2" align="center" width="100%" height="100%">  
            <tr bgcolor="pink">  
                <td height="50" colspan="2"><tiles:insertAttribute name="header" />  
                </td>  
            </tr>  
            <tr>  
                <td height="250" width="150"><tiles:insertAttribute name="menu" />  
                </td>  
                <td width="400"><tiles:insertAttribute name="body" />  
                </td>  
            </tr>  
            <tr bgcolor='cyan' height="2%">  
                <td height="30" colspan="2"><tiles:insertAttribute name="footer" />  
                </td>  
            </tr>  
        </table>  
    </body>  
    </html>  