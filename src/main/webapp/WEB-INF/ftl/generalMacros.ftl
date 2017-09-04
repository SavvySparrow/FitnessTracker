<#include "cssMacros.ftl">
<#macro messege pageMessege="Default_Messege" headerSize="h2">
   <td colspan="2" align="center"><${headerSize}>${pageMessege}!</${headerSize}></td>
</#macro>
<#macro redirect link name>
     <td colspan="2" align="center">
     <a href="${link}.html"><p class="message">${name}</p></a>
     </td>
</#macro>
