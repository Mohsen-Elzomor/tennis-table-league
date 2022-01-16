CREATE TABLE country (
                         code varchar(3)  NOT NULL,
                         country_name varchar(50)  NOT NULL,
                         CONSTRAINT country_pk PRIMARY KEY (code)
) ;

CREATE TABLE player (
                        id integer  NOT NULL,
                        first_name varchar(50)  NOT NULL,
                        last_name varchar(50)  NOT NULL,
                        email varchar(255)  NOT NULL,
                        gender char(1)  NOT NULL,
                        date_of_birth date  NOT NULL,
                        country_code varchar(3)  NOT NULL,
                        CONSTRAINT player_pk PRIMARY KEY (id)
) ;

CREATE TABLE playing_category (
                                  id integer  NOT NULL,
                                  category_name varchar(50)  NOT NULL,
                                  CONSTRAINT playing_category_pk PRIMARY KEY (id)
) ;

CREATE TABLE registration (
                              id integer  NOT NULL,
                              registration_date date  NOT NULL,
                              CONSTRAINT registration_pk PRIMARY KEY (id)
) ;

CREATE TABLE tournament (
                            id integer  NOT NULL,
                            tournament_name varchar(100)  NOT NULL,
                            location varchar(50)  NOT NULL,
                            start_date date  NOT NULL,
                            end_date date  NOT NULL,
                            number_of_rounds integer  NOT NULL,
                            tournament_type_id integer  NOT NULL,
                            surface_type_id integer  NOT NULL,
                            CONSTRAINT tournament_pk PRIMARY KEY (id)
) ;

CREATE TABLE tournament_playing_category (
                                             id integer  NOT NULL,
                                             tournament_id integer  NOT NULL,
                                             playing_category_id integer  NOT NULL,
                                             CONSTRAINT tournament_playing_category_pk PRIMARY KEY (id)
) ;

CREATE TABLE tournament_type (
                                 id integer  NOT NULL,
                                 tournament_type varchar(30)  NOT NULL,
                                 CONSTRAINT tournament_type_pk PRIMARY KEY (id)
) ;

CREATE TABLE surface_type (
                              id integer  NOT NULL,
                              surface_type varchar(50)  NOT NULL,
                              CONSTRAINT surface_type_pk PRIMARY KEY (id)
) ;
CREATE TABLE registration_player (
                                     registration_id integer  NOT NULL,
                                     player_id integer  NOT NULL,
                                     CONSTRAINT registration_player_pk PRIMARY KEY (registration_id,player_id)
) ;