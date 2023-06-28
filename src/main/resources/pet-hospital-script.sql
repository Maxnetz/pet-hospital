DROP TABLE IF EXISTS billing;

CREATE TABLE billing (
  id INTEGER PRIMARY KEY,
  owner_id INTEGER UNIQUE,
  invoice_date DATE,
  total_amount INTEGER
);

DROP TABLE IF EXISTS owner;

CREATE TABLE `owner` (
  `id` integer PRIMARY KEY,
  `name` varchar(255),
  `contact_number` integer
);

DROP TABLE IF EXISTS pet;

CREATE TABLE `pet` (
  `id` integer UNIQUE PRIMARY KEY,
  `name` varchar(255),
  `species` varchar(255),
  `breed` varchar(255),
  `age` integer,
  `size` varchar(255),
  `owner_id` integer
);

DROP TABLE IF EXISTS medical_record;

CREATE TABLE medical_record (
  id INTEGER PRIMARY KEY,
  pet_id INTEGER UNIQUE,
  date DATE,
  diagnosis VARCHAR(255),
  medication VARCHAR(255),
  note VARCHAR(255)
);