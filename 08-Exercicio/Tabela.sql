CREATE TABLE tb_usuario (
    cd_usuario    NUMBER NOT NULL,
    nm_usuario    VARCHAR2(100) NOT NULL,
    dt_cadastro   DATE NOT NULL,
    dt_nascimento DATE,
    ds_email      VARCHAR2(100) NOT NULL,
    nr_cpf        VARCHAR2(11) NOT NULL
);

ALTER TABLE tb_usuario ADD CONSTRAINT tb_usuario_pk PRIMARY KEY ( cd_usuario );

ALTER TABLE tb_usuario ADD CONSTRAINT tb_usuario__un UNIQUE ( ds_email,
                                                              nr_cpf );

CREATE SEQUENCE SQ_TB_USUARIO START WITH 1 INCREMENT BY 1;            															  
			