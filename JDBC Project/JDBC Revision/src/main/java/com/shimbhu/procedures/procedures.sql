
-- ************************************************************************************
-- ************************************************************************************

-- procedure without parameters

-- changing the delimiter //
DELIMITER //

-- creating procedure

CREATE PROCEDURE getAllMovies()
BEGIN
     SELECT * FROM d_movies_tbl;
END //

-- changing again delimiter to ;
DELIMITER ;

-- seeing all the procedures in the movie_ticket database
SHOW PROCEDURE STATUS WHERE db = 'movie_ticket';

-- calling the procedure
CALL getAllMovies();

-- ************************************************************************************
-- ************************************************************************************

-- procedure with parameters

-- procedures with single IN parameter

DELIMITER //

CREATE PROCEDURE getAllMoviesByReleaseYear(
  IN re_year varchar(100)
)
BEGIN
     SELECT * FROM d_movies_tbl where release_year = re_year;
END //

DELIMITER ;

CALL getAllMoviesByReleaseYear('2024');

-- ************************************************************************************
-- ************************************************************************************

-- procedure with IN,OUT parameters

DELIMITER //

CREATE PROCEDURE getAllMoviesByReleaseYearWithINAndOUT(
  IN re_year varchar(100),
  OUT movies_count INT
)
BEGIN
     SELECT COUNT(*) INTO movies_count FROM d_movies_tbl where release_year = re_year;
     SELECT * FROM d_movies_tbl where release_year = re_year; -- in response getting this
END //

DELIMITER ;


-- calling the procedure

CALL getAllMoviesByReleaseYearWithINAndOUT('2024',@count); -- @count we can give any name

-- when explicitly call this then getting only count

SELECT @count;

-- ************************************************************************************
-- ************************************************************************************

DELIMITER //

CREATE PROCEDURE AdjustPrice(
    INOUT price DECIMAL(10, 2),
    IN adjustment DECIMAL(10, 2)
)
BEGIN
    SET price = price + adjustment;
    IF price < 0 THEN
        SET price = 0;
    END IF;
END //

DELIMITER ;

-- To call the procedure:
SET @item_price = 100.00;
CALL AdjustPrice(@item_price, -25.00);
SELECT @item_price;  -- This will output 75.00

SET @item_price = 10.00;
CALL AdjustPrice(@item_price, -15.00);
SELECT @item_price;  -- This will output 0.00 (not -5.00)

-- ************************************************************************************
-- ************************************************************************************