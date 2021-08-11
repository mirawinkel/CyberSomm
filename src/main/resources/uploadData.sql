LOAD DATA LOCAL INFILE 'c:/Users/MiraR/Downloads/wineInfo.csv'
    INTO TABLE wine
    FIELDS TERMINATED BY ','
    LINES TERMINATED BY '\r\n'
    IGNORE 1 LINES
    (id,vintage,producer,NAME,varietal,region,country,cost,price)