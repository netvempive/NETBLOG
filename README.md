NETBLOG
=======

personal blog , 2014/11/20 start by net
------
>markdown

>>markdown

* firest
* sencend
* third


1. firest
2. sencend
3. third

*   A list item with a blockquote:

    > This is a blockquote
    > inside a list item.



https://www.netsarang.com/zh/downloading/?token=YXgxY2hxR2dTZ1BoQ29fUFlZQkxwZ0BtZDZiNDN4WUZIcFRjbjVwaFpES0lB

listen       443 ssl;
server_name  localhost;
ssl_certificate      /opt/crt/server.crt;
ssl_certificate_key  /opt/crt/server.key;
ssl_session_timeout 5m;
ssl_ciphers ECDHE-RSA-AES128-GCM-SHA256:ECDHE:ECDH:AES:HIGH:!NULL:!aNULL:!MD5:!ADH:!RC4;
ssl_protocols TLSv1 TLSv1.1 TLSv1.2;
ssl_prefer_server_ciphers on;





yum -y install make zlib zlib-devel gcc-c++ libtool openssl openssl-devel

./configure --prefix=/usr/local/nginx --with-http_ssl_module

make && make install
