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
    <form class="register-form" name="register-form" action="register.html" method="post">
      <input type="text" placeholder="name" name="username"/>
      <input type="password" placeholder="password" name="password"/>
      <input type="text" placeholder="email address" name="email"/>
      <button>create</button>
      <p class="message">Already registered? <a href="login.html">Sign In</a></p>
    </form>
  </div>
</div>
</body>
</html>