run:
	java -jar target/sistemavendas-0.0.1.jar
push:
	docker build .	
	docker tag springio/sistemasvendas lulak21/papito
	docker push lulak21/papito

