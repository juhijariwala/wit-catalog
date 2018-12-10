#!/bin/bash

set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE TABLE item(
    id serial PRIMARY KEY,
    name VARCHAR (255) NOT NULL,
    description VARCHAR (355) UNIQUE NOT NULL,
    price real NOT NULL
    );
EOSQL