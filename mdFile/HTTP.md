##HTTP
		是超文本传输协议，是TCP/IP协议的一个应用层协议，
		用于定义客户端和服务器端传输交换数据的过程，以及定义了数据本身的格式。
##HTTP协议的版本
		HTTP/1.0
				建立连接
				客户端发送请求
				服务器端发送响应
				关闭连接
				
				img
		HTTP/1.1
				建立连接
				客户端发送请求
				服务器端发送响应
				...
				...
				客户端发送关闭连接的请求
				服务器端关闭连接

##HTTP协议的请求
		请求行
			GET    /subject/schools/index.shtml  (get请求方式要拼接的参数) HTTP/1.1
			请求方式	资源地址	HTTP协议版本
		请求头
			主机名
				Host: www.itcast.cn
			连接方式
				Connection: keep-alive
			控制缓存
				Cache-Control: max-age=0
			浏览器支持的版本
				User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36
			浏览器支持的类型格式
				Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
			浏览器支持的解码格式
				Accept-Encoding: gzip, deflate
			浏览器支持的语言
				Accept-Language: zh-CN,zh;q=0.8
		请求体
			username:张三
			注意：POST请求方式才有请求体

##HTTP协议的响应
		响应行
				HTTP/1.1 200 OK
				HTTP协议的版本	响应码/状态码
				响应码
						200		ok,响应成功
						304		未更新，缓存是最新的版本
						404		not found，找不到资源
						500		服务器端出现了异常
		响应头
			响应的时间
				Date: Thu, 28 Sep 2017 14:47:44 GMT
			WEB服务器的版本
				Server: Apache/2.4.23 (Win64) OpenSSL/1.0.2h PHP/5.6.28
			服务器端支持范围（部分）请求
				Accept-Ranges: bytes
			连接的超时时间，和连接的允许最大请求数量
				Keep-Alive: timeout=5, max=100
			连接的方式
				Connection: Keep-Alive
			不明确响应体的大小
				Transfer-Encoding: chunked
			响应体的类型
				Content-Type: text/html
		响应体
		
		
		
		
		
		
		