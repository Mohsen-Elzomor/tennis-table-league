
insert into country (code, country_name) values ('EG', 'Egypt');

insert into registration (id, registration_date) values (1, now()-1);
insert into registration (id, registration_date) values (2, now()-2);

insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (1, 'Ahmed', 'Ali', 'ahemd@gmail.com','M','1995-03-15 10:22:12', 'EG');
insert into player (id, first_name, last_name, email, gender, date_of_birth, country_code) values (2, 'Mohamed', 'nour', 'mohamed@gmail.com','M','1995-11-19 12:22:12', 'EG');

insert into tournament_type (id, tournament_type) values (1, 'OLS');
insert into tournament_type (id, tournament_type) values (2, 'BSS');
insert into tournament_type (id, tournament_type) values (3, 'OMS');

insert into playing_category (id, category_name) values (1, 'Men’s singles');
insert into playing_category (id, category_name) values (2, 'Mixed doubles');

insert into surface_type (id, surface_type) values (1, 'Clay');
insert into surface_type (id, surface_type) values (2, 'Grass');
insert into surface_type (id, surface_type) values (3, 'Carpet');

insert into tournament (id, tournament_name, location, start_date, end_date, number_of_rounds, tournament_type_id, surface_type_id) values (1, 'Inter Team Tournament', 'Noida', now(), now() + INTERVAL 3 DAY, 6, 1, 1);

insert into tournament_playing_category (id, tournament_id, playing_category_id) values (1, 1, 1);

insert into registration_player (registration_id, player_id) values (1, 1);

insert into playing_in (id, registration_id, seed, tournament_playing_category_id) values (1, 1, 2, 1);

