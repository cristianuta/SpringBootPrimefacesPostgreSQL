CREATE USER tableuser WITH PASSWORD 'tableuser' CREATEDB;
CREATE DATABASE datatable;
GRANT ALL on database datatable TO GROUP postgres;
GRANT postgres TO tableuser;