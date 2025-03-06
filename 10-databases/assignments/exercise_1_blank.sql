CREATE TABLE customers (
    customer_id INTEGER PRIMARY KEY, 
    last_name   VARCHAR(50) NOT NULL,
    first_name  VARCHAR(50) NOT NULL,
    address     VARCHAR(200),
    city        VARCHAR(50),
    state       VARCHAR(3) CHECK (state IN ('NSW', 'VIC', 'QLD', 'ACT', 'TAS', 'NT', 'SA', 
                                            'WA')) NOT NULL,
    postcode    VARCHAR(8)
);


CREATE TABLE movies (
    movie_id            INTEGER PRIMARY KEY,
    movie_title         VARCHAR(100) NOT NULL,
    director_first_name VARCHAR(50) NOT NULL,
    director_last_name  VARCHAR(50) NOT NULL,
    genre               VARCHAR(20) CHECK (genre IN ('Action', 'Adventure', 'Comedy', 'Romance', 
                                           'Science', 'Fiction', 'Documentary', 'Drama', 
                                           'Horror') NOT NULL,
    release_date        DATE,
    studio_name         VARCHAR(50)
);


CREATE TABLE stock (
    movie_id      INTEGER,
    media_type    VARCHAR(20) CHECK (media_type IN ('DVD', 'Blu-Ray', 'Stream-Media') NOT NULL,
    cost_price    ???,
    retail_price  ???,
    current_stock ???,
    PRIMARY KEY (movie_id, media_type),
    FOREIGN KEY (movie_id) REFERENCES movies(movie_id)
        ON DELETE ??? ON UPDATE ???
);


CREATE TABLE shipments (
    shipment_id   INTEGER PRIMARY KEY,
    customer_id   INTEGER CHECK ???,
    movie_id      INTEGER CHECK ???,
    media_type    VARCHAR(20),
    shipment_date DATE,
    FOREIGN KEY (movie_id) REFERENCES stock(movie_id)
        ON DELETE ??? ON UPDATE ???,
    FOREIGN KEY (media_type) REFERENCES stock(media_type)
        ON DELETE ??? ON UPDATE ???
);


