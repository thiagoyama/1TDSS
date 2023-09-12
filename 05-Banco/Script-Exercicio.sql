CREATE TABLE tb_aluno (
    nr_rm     INTEGER PRIMARY KEY,
    nm_aluno   VARCHAR2(100) NOT NULL,
    st_ativo  NUMBER(1) NOT NULL,
    vl_nota1  DECIMAL(3, 1) NOT NULL,
    vl_nota2  DECIMAL(3, 1) NOT NULL
);