# CyberSomm
## Virtual Sommelier Assistant

CyberSomm is a virtual sommelier application. It helps to find wines to pair with meals, and also serves as a database crawler to find wines based on input criteria

Embedded ADMIN account credentials:
Email: admin@cybersomm.com
password:lovewine

### Technical Challenges
Getting JUint 5 to run tests as a test suite

Implementing Spring Security and figuring out how to handle the authentication object to access user records within the database.

Implementing the store page (it's been hidden from view and saved for a future release)





### Additional
The application is constructed within the Spring Boot framework utilizing MariaDB as the database driver for production, and h2 database for containerized testing within JUnit.

Supporting SQL data sets are located in the CyberSomm/SQL folder. Three have a run order as listed in the file names to be run *_FIRST *_SECOND and *_THIRD

A database schema diagram is located at CyberSomm/CyberSomm DB Relationships.jpeg





#### User Stories:
-As a wine drinker, I want guidance so that I know what pairs with my food

-As a consumer, I want to be informed of wines similar to what I like so that I can try new wines

-As a consumer, I want to know what's available near me so that I know what's available locally to purchase

-As a site user I want to be able to track my favorites for future purchases

-As a consumer I want to know the expected price to pay for something

-As a consumer I want to know what my local purveyors offer for sale


Currently, hosted at:

[GitHub](https://github.com/mirawinkel/CyberSomm)