
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

DROP TABLE IF EXISTS owner;

CREATE TABLE `owner` (
  `id` integer PRIMARY KEY,
  `name` varchar(255),
  `contact_number` integer
);

DROP TABLE IF EXISTS medical_record;

CREATE TABLE `medical_record` (
  `id` integer UNIQUE PRIMARY KEY,
  `pet_id` integer UNIQUE,
  `date` date,
  `diagnosis` varchar(255),
  `medication` varchar(255),
  `note` varchar(255)
);

DROP TABLE IF EXISTS billing;

CREATE TABLE `billing` (
  `id` integer UNIQUE PRIMARY KEY,
  `owner_id` integer UNIQUE,
  `total_amount` integer
);

ALTER TABLE `pet` ADD FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`);

ALTER TABLE `medical_record` ADD FOREIGN KEY (`pet_id`) REFERENCES `pet` (`id`);

ALTER TABLE `billing` ADD FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`);
