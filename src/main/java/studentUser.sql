CREATE TABLE  IF NOT EXISTS users(
                                     user_id SERIAL PRIMARY KEY ,
                                     username VARCHAR(50),
    password VARCHAR(50),
    signup_date DATE
    );