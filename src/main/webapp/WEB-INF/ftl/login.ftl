<#import "generalMacros.ftl" as mac>
<html>
<head>
  <title>${title}</title>
   <style>
 	<@mac.commancss_lr_page/>
 	<@mac.LRcss/>
   </style>
</head>
<body>
  <div class="LR-page">
  <div class="form">
    <form class="login-form" name="login-form" action="login.html" method="post">
      <input type="text" placeholder="username" name="loginUsername"/>
      <input type="password" placeholder="password" name="loginPassword"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register.html">Create an account</a></p>
    </form>
  </div>
</div>
</body>
</html>