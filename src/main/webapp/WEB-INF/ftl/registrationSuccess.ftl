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
<div class="LR-SF-page">
  <div class="form">
     <table border="0">
            <tr>
               <@mac.messege pageMessege=messege/>
            </tr>
            <tr>
               <@mac.messege pageMessege=messege2 headerSize="h3"/>
            </tr>
            <tr>
                <td>User Name:</td>
                <td>${username}</td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td>${email}</td>
            </tr> 
            <tr>
                <td colspan="2" align="center">
      			<a href="login.html"><p class="message">Sign In</p></a>
      			</td>
            </tr> 
        </table>
  </div>
</div>
</body>
</html>