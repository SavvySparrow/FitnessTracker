<#import "generalMacros.ftl" as mac>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
   <style>
 	<@mac.commancss_lr_page/>
 	<@mac.lr_sf_css/>
   </style>
</head>
<body>
<#assign LoginMessege>${messege}</#assign>
<div class="LR-SF-page">
  <div class="form">
     <table border="0">
     <tr>
     <@mac.messege pageMessege=LoginMessege/>
     </tr>
     <tr>
     		<#if loginSuccess>
     			<@mac.redirect link="home" name="Go to Home"/> 
            <#else>
            	<@mac.redirect link="login" name="Try Again"/> 
     		</#if>  
     </tr>         
     </table>
</div>
</div>
</body>
</html>