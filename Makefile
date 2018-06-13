run:
	java -jar target/sistemavendas-0.0.1.jar
push:
	./mvnw install dockerfile:build 	
	docker tag springio/sistemavendas lulak21/papito
	docker push lulak21/papito

