run:
	docker run -p 8081:8080 --name sistemavendas --restart=always -d lulak21/papito
push:
	./mvnw install dockerfile:build 	
	docker tag springio/sistemavendas lulak21/papito
	docker login --username=lulak21 --password=superadmin1
	docker push lulak21/papito

