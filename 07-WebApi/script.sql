create table t_categoria (
	id int primary key,
	nm_categoria varchar2(40),
	st_perecivel int
);

alter table t_produto 
add cd_categoria number 
constraint fk_cd_categoria
REFERENCES t_categoria(id);