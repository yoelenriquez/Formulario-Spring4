/*Poblate table*/
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(1, 'Yoel', 'Enriquez', 'yoel.enriquez.1995@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(2, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(3, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(4, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(5, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(6, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(7, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(8, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(9, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(10, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(11, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(12, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(13, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(14, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(15, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(16, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(17, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(18, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(19, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(20, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(21, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(22, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(23, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(24, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');
INSERT INTO clientes (id, nombre, apellido, email, create_at, foto) VALUES(25, 'Pablo', 'Perez', 'pablo.perez.1985@gmail.com', '2020-08-31', '');


/*PRODUCTOS TABLA*/
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD',15000,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W32',1499999,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple ipod shuffle',379000,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook z110',450000,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional',800000,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta aro 26',549999,NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica comoda 5 cajones',65999,NOW());

/* FACTURAS DE EJEMPLO*/
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 7);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 5);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura de bicicleta', 'Alguna nota importante', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (3, 2, 6);
