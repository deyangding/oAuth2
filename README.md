oauth2 练习
authorization-server 基于原生
ram基于内存
db-authorization-baseserver 基于自定义权限角色在authorization-server基础上


http://localhost:8080/oauth/authorize?client_id=clientId&response_type=code
username:admin
pwd:1234

点击approve 授权完成后，重定向到指定页面并返回授权码code=XXX

postMan 
http://localhost:8080/oauth/token POST

grant_type:authorization_code
code:hGlrPj
-------
refresh_token:65af23e5-ec37-4ecd-8f0f-ea331a7b0835
grant_type:refresh_token



输入请求GET  http://localhost:8080/oauth/check_token?token=XXXX



